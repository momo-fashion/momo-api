package momo.fashion.repositories;

import momo.fashion.api.v1.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {
}
