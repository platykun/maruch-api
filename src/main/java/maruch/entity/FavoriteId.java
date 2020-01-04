package maruch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * FavoriteテーブルのID情報.
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteId implements Serializable {
    /**
     * ユーザID.
     */
    private int userId;
    /**
     * ランチID.
     */
    private int lunchId;
}
