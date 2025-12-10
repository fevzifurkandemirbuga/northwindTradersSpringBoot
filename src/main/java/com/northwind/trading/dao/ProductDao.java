package com.northwind.trading.dao;

import com.northwind.trading.model.Product;

import java.util.List;

public interface ProductDao {


    Product add(Product product);
    List<Product> getAll();


}
