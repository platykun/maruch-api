package maruch.helper;

import maruch.domain.Favorite;

import java.util.List;
import java.util.stream.Collectors;

/**
 * swaggerオブジェクトとドメインオブジェクトを変換する
 */
public class FavoriteHelper {

    public static Favorite convertRequestToModel(
            maruch.swagger.api.model.Favorite favorite) {

        return Favorite.create(
                1, //TODO: ログインユーザを格納する.
                favorite.getLunchId(),
                favorite.getDate()
        );
    }

    public static List<maruch.swagger.api.model.Favorite> convertModelsToResult(List<Favorite> favorites) {
        return favorites.stream()
                .map(FavoriteHelper::convertModelToResult)
                .collect(Collectors.toList());
    }

    public static maruch.swagger.api.model.Favorite convertModelToResult(Favorite favorite) {
        maruch.swagger.api.model.Favorite result = new maruch.swagger.api.model.Favorite();
        result.setLunchId(favorite.getLunchId());
        result.setDate(favorite.getDate());
        return result;
    }

}
