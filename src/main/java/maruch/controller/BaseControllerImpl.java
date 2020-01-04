package maruch.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.swagger.api.DefaultApi;
import maruch.swagger.api.model.Favorite;
import maruch.swagger.api.model.Lunch;
import maruch.swagger.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class BaseControllerImpl implements DefaultApi {

    @NonNull UserController userController;

    @NonNull LunchController lunchController;

    @NonNull FavoriteController favoriteController;

    @Override
    public ResponseEntity<List<Favorite>> favoritesGet(@DecimalMin("1") @DecimalMax("100") @Valid BigDecimal count, @DecimalMin("1") @DecimalMax("100") @Valid BigDecimal cursor) {
        return favoriteController.findFavorite(count, cursor);
    }

    @Override
    public ResponseEntity<Lunch> lunchesAddPost(Lunch body) {
        return lunchController.createLunch(body);
    }

    @Override
    public ResponseEntity<Lunch> lunchesIdGet(Long id) {
        return lunchController.getLunch(id);
    }

    @Override
    public ResponseEntity<List<Lunch>> lunchesListPost(maruch.swagger.api.model.LunchListSearchProperties body) {
        return lunchController.getLunchList(body);
    }

    @Override
    public ResponseEntity<User> usersAddPost(@Valid maruch.swagger.api.model.RequestUser body) {
        return userController.addUser(body);
    }

    @Override
    public ResponseEntity<User> usersMeGet() {
        return userController.getLoginUser();
    }

    @Override
    public ResponseEntity<User> usersMePut(@Valid maruch.swagger.api.model.RequestUser body) {
        return userController.updateLoginUser(body);
    }
}
