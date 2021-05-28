package br.com.supera.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.supera.domain.Carrinho;

@Component("carrinhoRepository")
public interface CarrinhoRepository extends CrudRepository<Carrinho, Integer>{ 

}
