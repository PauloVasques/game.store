package br.com.supera.game.store.service;

import br.com.supera.game.store.entity.ProductEntity;
import br.com.supera.game.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    public Optional<ProductEntity> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<ProductEntity> sortByName() {
        return productRepository.sortByName();
    }

    public List<ProductEntity> sortByPrice() {
        return productRepository.sortByPrice();
    }

    public List<ProductEntity> sortByScore() {
        return productRepository.sortByScore();
    }
}
