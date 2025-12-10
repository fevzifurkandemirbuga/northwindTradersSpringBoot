package com.northwind.trading.ui;

import com.northwind.trading.dao.ProductDao;
import com.northwind.trading.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserInterface implements CommandLineRunner {
    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product( "Laptop", 10, 999.99),
                new Product( "Wireless Mouse", 10, 24.99),
                new Product( "Mechanical Keyboard", 10, 79.99),
                new Product( "Office Chair", 20, 149.50),
                new Product( "Monitor 27-inch", 10, 229.99),
                new Product( "Bluetooth Speaker", 30, 59.99),
                new Product( "USB-C Charger", 10, 19.99),
                new Product( "Gaming Headset", 30, 89.99),
                new Product( "External SSD 1TB", 10, 129.99),
                new Product( "Webcam HD", 30, 49.99)
        ));

        products.forEach(productDao::add);


        productDao.getAll().forEach(System.out::println);


    }
}
