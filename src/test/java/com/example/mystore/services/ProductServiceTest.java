package com.example.mystore.services;

import com.example.mystore.application.ProductApiController;
import com.example.mystore.application.ProductController;
import com.example.mystore.domain.Product;
import com.example.mystore.domain.ProductShort;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andre on 07/05/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductApiController controller;

    @Test
    public void hasMoreThan5Products() {
        List<Product> products = (List<Product>) productService.listAll();

        assertTrue(products.size() > 5);
    }

    @Test
    public void findProd8796093054977() {

        ProductShort productShort = controller.getById(8796093054977L);

        assertEquals(java.util.Optional.of(8796093054977L), productShort.getId());
        assertEquals("hybris Munich, Germany", productShort.getName());
    }
}