package maruch.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.domain.Favorite;
import maruch.domain.value.SearchPropertiesValue;
import maruch.helper.FavoriteHelper;
import maruch.helper.SearchPropertiesHelper;
import maruch.service.FavoriteService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * お気に入りを表すcontrollerクラス.
 */
@Service
@RequiredArgsConstructor
public class FavoriteController {
    @NonNull FavoriteService favoriteService;

    public ResponseEntity<maruch.swagger.api.model.Favorite> favorite(maruch.swagger.api.model.Favorite favorite) {

        Favorite model = FavoriteHelper.convertRequestToModel(favorite);
        Favorite result = favoriteService.favorite(model);

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(FavoriteHelper.convertModelToResult(result));
    }

    public ResponseEntity<List<maruch.swagger.api.model.Favorite>> findFavorite(BigDecimal count, BigDecimal cursor) {
        SearchPropertiesValue searchPropertiesValue = SearchPropertiesHelper.convertToModel(count, cursor);

        List<Favorite> result = favoriteService.getFavorites(searchPropertiesValue,
                1);

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(FavoriteHelper.convertModelsToResult(result));
    }
}
