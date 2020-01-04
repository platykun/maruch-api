package maruch.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.domain.Lunch;
import maruch.domain.LunchDetail;
import maruch.domain.value.LunchSearchValue;
import maruch.domain.value.SearchPropertiesValue;
import maruch.entity.LunchDetailEntity;
import maruch.entity.LunchEntity;
import maruch.repository.LunchDetailRepository;
import maruch.repository.LunchRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * ランチ情報を取得するServiceクラス.
 */
@Service
@RequiredArgsConstructor
public class LunchService {
    @NonNull
    LunchRepository lunchRepository;

    @NonNull
    LunchDetailRepository lunchDetailRepository;

    /**
     * ランチ情報を作成する.
     *
     * @return 作成済のランチ情報
     */
    public Lunch createLunch(Lunch lunch) {

        LunchEntity lunchEntity = convertLunchModelToEntity(0, lunch);
        LunchEntity lunchResultEntity = lunchRepository.save(lunchEntity);

        Lunch lunchResult = convetEntityToLunchModel(lunchResultEntity);

        if(lunch.getLunchDetail() != null) {
            LunchDetail lunchDetail = createLunchDetail(lunch.getLunchDetail());
            lunchResult.addDetail(lunchDetail);
        }

        return lunchResult;
    }

    /**
     * ランチ詳細情報を作成する.
     *
     * @param lunchDetail ランチ詳細情報
     * @return 作成済みランチ詳細情報
     */
    public LunchDetail createLunchDetail(LunchDetail lunchDetail) {
        LunchDetailEntity lunchDetailEntity = convertLunchDetailModelToEntity(lunchDetail);
        LunchDetailEntity lunchDetailResult = lunchDetailRepository.save(lunchDetailEntity);

        return convetEntityToLunchDetailModel(lunchDetailResult);
    }

    /**
     * ランチ情報を取得する.
     *
     * @param id ランチID
     * @return ランチ情報
     * @throws NoSuchElementException ランチ情報が取得できなかった場合にthrow
     */
    public Lunch getLunch(int id) throws NoSuchElementException {
        LunchEntity result = lunchRepository
                .findById(id)
                .orElseThrow();

        LunchDetailEntity lunchDetailResult = lunchDetailRepository
                .findById(id)
                .orElseThrow();

        return convertEntityToLunchModelWithDetail(result, lunchDetailResult);
    }

    /**
     * ランチ情報の一覧を取得する.
     *
     * @param lunchSearchValue ランチ検索条件
     * @return ランチ情報一覧.
     */
    public List<Lunch> getLunches(LunchSearchValue lunchSearchValue) {
        // TODO: 検索範囲以外の検索条件、ソート条件の実装をする
        SearchPropertiesValue searchPropertiesValue = lunchSearchValue.getSearchPropertiesValue();
        Pageable pageable = PageRequest.of(searchPropertiesValue.getCursor(), searchPropertiesValue.getCount());

        List<LunchEntity> userEntities = lunchRepository.findAll(pageable).toList();

        return userEntities.stream()
                .map(u ->
                        Lunch.create(
                                u.getId(),
                                u.getImageUrl(),
                                u.getAuthor(),
                                u.getShopId(),
                                u.getPrice()
                        )
                ).collect(Collectors.toList());
    }


    /**
     * ModelからLunchEntityに変換する.
     *
     * @param lunchId ランチID.
     * @param lunch   LunchModel
     * @return LunchEntity
     */
    private LunchEntity convertLunchModelToEntity(int lunchId, Lunch lunch) {
        return new LunchEntity(
                lunchId,
                lunch.getImageUrl(),
                lunch.getAuthor(),
                lunch.getShopId(),
                lunch.getPrice()
        );
    }

    /**
     * ModelからLunchDetailに変換する.
     *
     * @param d   LunchModel
     * @return LunchEntity
     */
    private LunchDetailEntity convertLunchDetailModelToEntity(LunchDetail d) {
        return new LunchDetailEntity(
                d.getLunchId(),
                d.getCalorie(),
                d.getCarbohydrate(),
                d.getDescription(),
                d.getFiber(),
                d.getLabel(),
                d.getLipid(),
                d.getProtein(),
                d.getSalt()
        );
    }

    /**
     * LunchEntity, LunchDetailEntityからModelに変換する
     *
     * @param lunchEntity LunchEntity
     * @param lunchDetailEntity LunchDetailEntity
     * @return LunchModel
     */
    private Lunch convertEntityToLunchModelWithDetail(LunchEntity lunchEntity, LunchDetailEntity lunchDetailEntity) {
        Lunch lunch = convetEntityToLunchModel(lunchEntity);

        if (lunchDetailEntity != null) {
            LunchDetail detail = convetEntityToLunchDetailModel(lunchDetailEntity);
            lunch.addDetail(detail);
        }

        return lunch;
    }

    /**
     * LunchEntityからModelに変換する.
     *
     * @param lunchEntity LunchEntity
     * @return LunchModel
     */
    private Lunch convetEntityToLunchModel(LunchEntity lunchEntity) {
        return Lunch.create(
                lunchEntity.getId(),
                lunchEntity.getImageUrl(),
                lunchEntity.getAuthor(),
                lunchEntity.getShopId(),
                lunchEntity.getPrice()
        );
    }

    /**
     * ModelからLunchEntityに変換する.
     *
     * @param e LunchDetailEntity
     * @return LunchModel
     */
    private LunchDetail convetEntityToLunchDetailModel(LunchDetailEntity e) {
        return LunchDetail.create(
                e.getLunchId(),
                e.getCalorie(),
                e.getDescription(),
                e.getFiber(),
                e.getLabel(),
                e.getLipid(),
                e.getProtein(),
                e.getSalt()
        );
    }
}
