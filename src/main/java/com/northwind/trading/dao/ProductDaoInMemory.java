package com.northwind.trading.dao;

import com.northwind.trading.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class ProductDaoInMemory implements ProductDao {

    @Autowired
    private List<Product> products;
    private int productId=1;

//    public ProductDaoInMemory() {
//        this.products = new ArrayList<>();
//    }

    @Override
    public Product add(Product product) {
        product.setProductId(productId++);
        products.add(product);
        return product;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
