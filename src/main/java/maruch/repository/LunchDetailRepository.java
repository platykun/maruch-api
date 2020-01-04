package maruch.repository;

import maruch.entity.LunchDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ランチ詳細情報リポジトリ.
 */
@Repository
public interface LunchDetailRepository extends JpaRepository<LunchDetailEntity, Integer> {
}
