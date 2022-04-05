package ni.brisansoftware.demo.productservice.service;

import ni.brisansoftware.demo.productservice.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Optional<Product> findById(Long id);
    List<Product> findAll();
}
