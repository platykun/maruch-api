package maruch.helper;

import maruch.domain.User;
import maruch.domain.value.SexEnum;

/**
 * swaggerオブジェクトとドメインオブジェクトを変換する
 */
public class UserHelper {
    public static User convertRequestUserToUserModel(
            maruch.swagger.api.model.RequestUser requestUser) {
        return User.craeteUser(
                requestUser.getName(),
                SexEnum.valueOf(requestUser.getSex().toString())
        );
    }

    public static maruch.swagger.api.model.User convertUserModelToRequestUser(User user) {
        maruch.swagger.api.model.User responseUser = new maruch.swagger.api.model.User();

        responseUser.setId(user.getId());
        responseUser.setName(user.getUserName());
//        responseUser.setBirth(user.getBirth()); TODO birthをもたせる
        responseUser.setSex(maruch.swagger.api.model.User.SexEnum.valueOf(user.getSex().toString()));

        return responseUser;
    }
}
