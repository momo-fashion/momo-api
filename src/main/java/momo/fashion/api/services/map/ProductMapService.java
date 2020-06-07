package momo.fashion.api.services.map;

import momo.fashion.api.model.Product;
import momo.fashion.api.services.ProductService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class ProductMapService extends AbstractMapService<Product, Long> implements ProductService {
    @Override
    public Set<Product> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Product object) {
        super.delete(object);
    }

    @Override
    public Product save(Product object) {
        if (object != null) {
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Product findById(Long id) {
        return super.findById(id);
    }
}
