package br.com.supera.game.store.controller;

import br.com.supera.game.store.entity.ProductEntity;
import br.com.supera.game.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ECommerceController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public List<ProductEntity> findProducts() {

        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Optional<ProductEntity> findById(@PathVariable Long id) {

        return productService.findById(id);
    }
}
