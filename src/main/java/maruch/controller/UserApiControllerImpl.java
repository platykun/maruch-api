package maruch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import swagger.api.DefaultApi;
import swagger.api.model.Favorite;
import swagger.api.model.Lunch;
import swagger.api.model.User;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class UserApiControllerImpl implements DefaultApi {
    @Override
    public ResponseEntity<List<Favorite>> favoritesGet(BigDecimal count, BigDecimal cursor) {
        return null;
    }

    @Override
    public ResponseEntity<Lunch> lunchsAddPost(Lunch body) {
        return null;
    }

    @Override
    public ResponseEntity<Object> lunchsIdGet(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Lunch> lunchsListPost(Object body) {
        return null;
    }

    @Override
    public ResponseEntity<User> usersAddPost(Object body) {
        return null;
    }

    @Override
    public ResponseEntity<User> usersMeGet(Object body) {
        return null;
    }

    @Override
    public ResponseEntity<User> usersMePut(Object body) {
        return null;
    }
}
