package maruch.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.domain.Lunch;
import maruch.domain.value.LunchSearchValue;
import maruch.helper.LunchHelper;
import maruch.service.LunchService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LunchController {
    @NonNull LunchService lunchService;

    /**
     * ランチ情報を作成する.
     *
     * @param lunch ランチ情報
     * @return 作成済のランチ情報
     */
    public ResponseEntity<maruch.swagger.api.model.Lunch> createLunch(maruch.swagger.api.model.Lunch lunch) {

        Lunch lunchModel = LunchHelper.convertRequestToModel(lunch);
        Lunch result = lunchService.createLunch(lunchModel);

        return ResponseEntity.ok(LunchHelper.convertModelToResultLunch(result));
    }

    /**
     * ランチ詳細情報を取得する.
     *
     * @param id ランチID
     * @return ランチ詳細情報.
     */
    public ResponseEntity<maruch.swagger.api.model.Lunch> getLunch(Long id) {
        Lunch result = lunchService.getLunch(id.intValue());

        return ResponseEntity.ok(LunchHelper.convertModelToResultLunch(result));
    }

    /**
     * ランチ一覧情報を取得する.
     *
     * @return ランチ一覧情報
     */
    public ResponseEntity<List<maruch.swagger.api.model.Lunch>> getLunchList(maruch.swagger.api.model.LunchListSearchProperties lunchListSearchProperties) {
        LunchSearchValue lunchSearchValue = LunchHelper.convertLunchSearchValueToModel(lunchListSearchProperties);

        List<Lunch> resultModels = lunchService.getLunches(lunchSearchValue);

        List<maruch.swagger.api.model.Lunch> results =  resultModels.stream()
                .map(r -> LunchHelper.convertModelToResultLunch(r))
                .collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }
}
