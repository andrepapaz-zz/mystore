package com.example.mystore.repositories;

import com.example.mystore.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andre on 05/05/2018.
 */
public interface ProductsRepository extends CrudRepository<Product, Long> {

    Product findByPBaseproduct(Long id);

    Iterable<Product> findByPVenueContainingIgnoreCase(String search);
}
