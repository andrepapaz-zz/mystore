package com.example.mystore.application;

import com.example.mystore.domain.Product;
import com.example.mystore.domain.ProductShort;
import com.example.mystore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andre on 07/05/2018.
 */
@RestController
public class ProductApiController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/api/products")
    public Iterable<ProductShort> listAll() {
        return productService.listAllShort();
    }

    @RequestMapping("/api/products/{id}")
    public ProductShort getById(@PathVariable("id") Long id) {
        return productService.getByPBaseproduct(id);
    }
}
