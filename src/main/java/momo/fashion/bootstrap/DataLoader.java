package momo.fashion.bootstrap;

import momo.fashion.api.v1.model.Product;
import momo.fashion.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductService productService;

    public DataLoader(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = productService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Product product1 = new Product();
        product1.setName("Earing");
        product1.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/91pV8dVwtFL._SL420_SX500_CR0,0,520,500.jpg");
        product1.setPrice(80d);
        product1.setRegularPrice(100d);
        product1.setDiscountPrice(20d);

        Product product2 = new Product();
        product2.setName("iPhone 7 Plus 6S Plus 6 Plus Screen Protector");
        product2.setImageUrl("https://images-na.ssl-images-amazon.com/images/I/71RHBxJlqUL._SX522_.jpg");
        product2.setPrice(7.99d);
        product2.setRegularPrice(29.99d);
        product2.setDiscountPrice(73d);

        productService.save(product1);
        productService.save(product2);


    }
}
