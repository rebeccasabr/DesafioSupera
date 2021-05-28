package br.com.supera.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.supera.domain.Product;

@Component("produtoRepository")
public interface ProdutoRepository  extends CrudRepository<Product, Integer>{

}
