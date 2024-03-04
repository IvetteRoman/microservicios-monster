package ec.edu.monster.store.product.repository;

import ec.edu.monster.store.product.entity.Category;
import ec.edu.monster.store.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
