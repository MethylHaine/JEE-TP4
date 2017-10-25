package main.java.business;

import java.util.Collection;
import main.java.model.Product;

public interface ProductManager {

    Collection<Product> findAll();

    void save(Product p);

    Product find(int number);

}