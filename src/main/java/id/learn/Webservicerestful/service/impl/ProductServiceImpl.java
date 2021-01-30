package id.learn.Webservicerestful.service.impl;

import id.learn.Webservicerestful.model.Product;
import id.learn.Webservicerestful.repository.ProductRepository;
import id.learn.Webservicerestful.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(Long id) throws Exception {
        Product product= productRepository.findById(id).orElse(new Product());
        return product;
    }

    @Override
    public Product saveorUpdateProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElse(new Product());
        productRepository.delete(product);

    }
}
