package com.example.mystore.services;

import com.example.mystore.domain.Product;
import com.example.mystore.domain.ProductShort;
import com.example.mystore.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andre on 05/05/2018.
 */
@Service
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public Iterable<Product> listAll() {
        return productsRepository.findAll();
    }

    public Product getById(Long id) {
        return productsRepository.findOne(id);
    }

    public Iterable<ProductShort> listAllShort() {
        List<Product> products = (List<Product>) productsRepository.findAll();

        List<ProductShort> productShorts = new ArrayList<>();

        products.forEach(product -> productShorts.add(new ProductShort(product.getpBaseproduct(), product.getpVenue())));

        return productShorts;
    }

    public ProductShort getByPBaseproduct(Long id) {
        Product produto = productsRepository.findByPBaseproduct(id);

        ProductShort productShort = new ProductShort(produto.getpBaseproduct(), produto.getpVenue());

        return productShort;
    }

    public Iterable<Product> searchByName(String search) {
        return productsRepository.findByPVenueContainingIgnoreCase(search);
    }
}
