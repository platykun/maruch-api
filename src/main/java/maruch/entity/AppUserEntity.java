package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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
