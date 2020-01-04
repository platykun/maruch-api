package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

/**
 * お気に入りテーブル.
 */
@Entity
@Table(name = "favorite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FavoriteId.class)
public class FavoriteEntity {

    @Id
    private int userId;
    @Id
    private int lunchId;

    /**
     * お気に入り日付.
     */
    private Date favoriteDate;
}

