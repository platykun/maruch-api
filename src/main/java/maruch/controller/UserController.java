package maruch.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import maruch.domain.User;
import maruch.helper.UserHelper;
import maruch.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserController {
    @NonNull UserService userService;

    /**
     * ユーザを追加する.
     *
     * @param requestUser ユーザ情報
     * @return 追加済ユーザ
     */
    public ResponseEntity<maruch.swagger.api.model.User> addUser(maruch.swagger.api.model.RequestUser requestUser) {
        User user = UserHelper.convertRequestUserToUserModel(requestUser);

        User createdUser = userService.craeteUser(user);

        maruch.swagger.api.model.User responseUser =
                UserHelper.convertUserModelToRequestUser(createdUser);

        return ResponseEntity.ok(responseUser);
    }

    /**
     * ログインユーザ情報を取得する.
     *
     * @return ログインユーザ
     */
    public ResponseEntity<maruch.swagger.api.model.User> getLoginUser() {
        User loginUser = userService.getLoginUser();

        maruch.swagger.api.model.User responseUser =
                UserHelper.convertUserModelToRequestUser(loginUser);
        return ResponseEntity.ok(responseUser);
    }

    /**
     * ユーザ情報を更新する.
     *
     * @param requestUser 更新後のユーザ情報
     * @return 更新後のユーザ情報
     */
    public ResponseEntity<maruch.swagger.api.model.User> updateLoginUser(maruch.swagger.api.model.RequestUser requestUser) {
        User user = UserHelper.convertRequestUserToUserModel(requestUser)
                .setId(1); // TODO セッション情報から取得する.

        User updatedUser = userService.updateUser(user);

        maruch.swagger.api.model.User responseUser =
                UserHelper.convertUserModelToRequestUser(updatedUser);
        return ResponseEntity.ok(responseUser);
    }
}
