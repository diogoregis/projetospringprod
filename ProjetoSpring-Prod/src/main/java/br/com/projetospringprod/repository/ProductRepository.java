package br.com.projetospringprod.repository;

import br.com.projetospringprod.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
