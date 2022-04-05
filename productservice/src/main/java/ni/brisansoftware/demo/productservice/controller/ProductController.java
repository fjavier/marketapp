package ni.brisansoftware.demo.productservice.controller;

import ni.brisansoftware.demo.productservice.entity.Product;
import ni.brisansoftware.demo.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Long id){
        return new ResponseEntity<Product>(this.productService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll(){
        return new ResponseEntity<List<Product>>(this.productService.findAll(), HttpStatus.OK);
    }
}
