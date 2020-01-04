package maruch.repository;

import maruch.entity.FavoriteEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * お気に入りリポジトリ.
 */
@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, Integer> {
    List<FavoriteEntity> findAllByUserId(Pageable pageable, int userId);
}
