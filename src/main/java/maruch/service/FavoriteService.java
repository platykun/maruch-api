package maruch.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.domain.Favorite;
import maruch.domain.value.SearchPropertiesValue;
import maruch.entity.FavoriteEntity;
import maruch.repository.FavoriteRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * お気に入り情報を管理するServiceクラス.
 */
@Service
@RequiredArgsConstructor
public class FavoriteService {
    @NonNull FavoriteRepository favoriteRepository;

    /**
     * お気に入り登録する.
     *
     * @param favorite お気に入り情報
     * @return 登録済お気に入り情報
     */
    public Favorite favorite(Favorite favorite) {
        FavoriteEntity favoriteEntity = convertToEntity(favorite);
        FavoriteEntity result = favoriteRepository.save(favoriteEntity);

        return convertToDomain(result);
    }

    /**
     * お気に入り情報を取得する.
     *
     * @param searchProperties 検索条件
     * @param userId ユーザID
     * @return お気に入り情報一覧
     */
    public List<Favorite> getFavorites(SearchPropertiesValue searchProperties, int userId) {
        Pageable pageable = PageRequest.of(searchProperties.getCursor(), searchProperties.getCount());

        List<FavoriteEntity> result = favoriteRepository.findAllByUserId(pageable, userId); // TODO: ログインユーザのIDを格納する

        return result.stream()
                .map(this::convertToDomain)
                .collect(Collectors.toList());
    }

    /**
     * FavoriteDomainクラスからEntityを生成する
     * @param favorite Favoriteドメイン
     * @return Entityクラス
     */
    private FavoriteEntity convertToEntity(Favorite favorite) {
        return new FavoriteEntity(
                favorite.getUserId(),
                favorite.getLunchId(),
                (java.sql.Date)favorite.getDate()
        );
    }

    /**
     * EntityからFavoriteDomainクラスを生成する.
     *
     * @param entity Entity
     * @return Favorite
     */
    private Favorite convertToDomain(FavoriteEntity entity) {
        return Favorite.create(entity.getUserId(), entity.getLunchId(), entity.getFavoriteDate());
    }
}
