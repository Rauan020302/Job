package it.academy.shopping.repository;

import it.academy.shopping.entity.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingRepository extends JpaRepository<ShoppingItem,Long> {
    List<ShoppingItem> findByUserUsername(String username);
}
