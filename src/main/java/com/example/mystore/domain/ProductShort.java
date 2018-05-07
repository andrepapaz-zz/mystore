package com.example.mystore.domain;

/**
 * Created by andre on 07/05/2018.
 */
public class ProductShort {
    private Long id;
    private String name;

    public ProductShort() {
    }

    public ProductShort(Long aLong, String venue) {
        this.id = aLong;
        this.name = venue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
