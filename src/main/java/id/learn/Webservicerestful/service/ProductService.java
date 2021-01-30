package id.learn.Webservicerestful.service;

import id.learn.Webservicerestful.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
    Product findProductById(Long id) throws Exception;
    Product saveorUpdateProduct(Product product);
    void deleteProduct(Long id);
}
