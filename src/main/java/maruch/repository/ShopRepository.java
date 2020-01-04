package maruch.repository;

import maruch.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 店舗リポジトリ.
 */
@Repository
public interface ShopRepository extends JpaRepository<ShopEntity, Integer> {
    Optional<ShopEntity> findById(String id);
}
