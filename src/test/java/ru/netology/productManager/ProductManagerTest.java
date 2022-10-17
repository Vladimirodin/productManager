package ru.netology.productManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    Product product1 = new Product(11, "Море", 100, "Море");
    Product product2 = new Product(22, "Горы", 200, "Горы");
    Product product3 = new Product(33, "Лес", 300, "Лес");
    Product product4 = new Product(44, "Лес", 500, "Лес");

    @Test
    public void addProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        manager.add(product2);

        Product[] expected = {product2};
        Product[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchMultipleProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = {product2};
        Product[] actual = manager.searchBy("Горы");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.removeById(11);


        Product[] expected = {product2, product3};
        Product[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);

        Product[] expected = {product3, product4};
        Product[] actual = manager.searchBy("Лес");

        Assertions.assertArrayEquals(expected, actual);
    }
}
