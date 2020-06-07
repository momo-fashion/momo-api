package momo.fashion.api.controllers;

import momo.fashion.api.model.Product;
import momo.fashion.api.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class ProductController {

    final private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/products")
    public @ResponseBody
    Set<Product> findAll() {
        return productService.findAll();
    }
}
