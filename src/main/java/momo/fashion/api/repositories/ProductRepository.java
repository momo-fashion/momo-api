package momo.fashion.api.repositories;

import momo.fashion.api.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {
}
