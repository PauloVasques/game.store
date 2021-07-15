package br.com.supera.game.store.repository;

import br.com.supera.game.store.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query(value = "SELECT * FROM products ORDER BY name", nativeQuery = true)
    List<ProductEntity> sortByName();

    @Query(value = "SELECT * FROM products ORDER BY price", nativeQuery = true)
    List<ProductEntity> sortByPrice();

    @Query(value = "SELECT * FROM products ORDER BY score", nativeQuery = true)
    List<ProductEntity> sortByScore();
}
