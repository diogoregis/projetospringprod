package br.com.projetospringprod.repository;

import br.com.projetospringprod.model.Produtct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produtct, Long> {

}
