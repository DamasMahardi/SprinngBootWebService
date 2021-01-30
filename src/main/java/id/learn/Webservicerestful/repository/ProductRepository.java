package id.learn.Webservicerestful.repository;

import id.learn.Webservicerestful.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
