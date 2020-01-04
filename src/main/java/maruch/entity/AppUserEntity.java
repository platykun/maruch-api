package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * ユーザテーブル.
 */
@Entity
@Table(name = "app_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserEntity implements Serializable {
    /**
     * ユーザID.
     */
    @Id
    private int id;

    /**
     * ユーザ名.
     */
    private String userName;

    /**
     * 性別.
     */
    private String sex;
}
