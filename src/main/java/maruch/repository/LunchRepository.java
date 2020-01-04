package maruch.repository;

import maruch.entity.LunchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * ランチリポジトリ.
 */
@Repository
public interface LunchRepository extends JpaRepository<LunchEntity, Integer> {
    Optional<LunchEntity> findById(String id);
}
