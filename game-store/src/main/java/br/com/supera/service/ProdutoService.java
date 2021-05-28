package br.com.supera.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import br.com.supera.domain.Carrinho;
import br.com.supera.domain.Product;
import br.com.supera.dto.ValoresDoCheckoutDto;
import br.com.supera.repository.CarrinhoRepository;
import br.com.supera.repository.ProdutoRepository;

@Component("produtoService")
@Configuration
@ComponentScan("br.com.supera.service")
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	CarrinhoRepository carrinhoRepository;
	

	List<Product> productList = new ArrayList<Product>();


	
	public ProdutoService(List<Product> productList) {
		super();
		this.productList = productList;
	}
	
	
	
	
	public void adicionaProdutosAoCarrinho(Product produto) {
		
		Product produtoBanco = produtoRepository.findById(produto.getIdProduto()).get();
		
		if(!this.productList.contains(produtoBanco)) {
			this.productList.add(produtoBanco);
		}
	}
	
	public void removerProdutoAoCarrinho(Product produto) {
		
		if(this.productList.contains(produto)) {
			this.productList.remove(produto);
		}
		
	}
	
	public void finalizarCompra() {
		
		Carrinho carrinho = new Carrinho();
		
		BigDecimal valorFrete = new BigDecimal("10,00");
		BigDecimal subTotal = new BigDecimal("00,00");	
		
		
		for (Product product : this.productList) {
			subTotal.add(product.getPrice());
		}
		
		//MAIOR OU IGUAL A 250,00
		//if( subTotal.compareTo("250,00")) {
			carrinho.setValorTotalCompras(subTotal.add(valorFrete));
		//}else {
			//carrinho.setValorTotalCompras(subTotal);
		//}	
		
    	carrinho.setListProduto(this.productList);
		
		carrinhoRepository.save(carrinho);
	}
	
	
	public  ValoresDoCheckoutDto valoresExibidosNoCheckout() {
		
		ValoresDoCheckoutDto valoresDoCheckoutDto = new ValoresDoCheckoutDto();
		valoresDoCheckoutDto.setFrete(new BigDecimal("10,00"));
		
		for (Product product : this.productList) {
			
			valoresDoCheckoutDto.getSubTotal().add(product.getPrice());
			valoresDoCheckoutDto.getTotal().add(valoresDoCheckoutDto.getFrete()).add(product.getPrice());
		}	
		
		return valoresDoCheckoutDto;
		
	}

	public Product salvarProduto(Product produto) {
		Product produtoRetorno = null;
		try {
			produtoRetorno = produtoRepository.save(produto);			
			
		} catch (Exception e) {
			System.err.println("Erro ao adcionar o produto no carrinho: " + e.getMessage());
		}
		
		return produtoRetorno;
		
	}
	
	public Product removerProdutoNoCarrinho(Product produto) {	
		
		try {
			 produtoRepository.delete(produto);
		} catch (Exception e) {
			System.err.println("Erro ao remover o produto no carrinho: " + e.getMessage());
		}		
		
		return produto;
		
	}
	
	
	public void exibirValorCheckout() {	
		
		List<Product> listProduct = new ArrayList<Product>();
		try {
			
			listProduct = (List<Product>) produtoRepository.findAll();
			
			ValoresDoCheckoutDto valoresDoCheckout = new ValoresDoCheckoutDto();
			
			Integer  frete = 0;
			Integer  subTotal = 0;
			Integer total = 0;
			
			
		for (Product product : listProduct) {
			
			
//			valoresDoCheckout.setFrete(frete);
//			valoresDoCheckout.setSubTotal(subTotal);
//			valoresDoCheckout.setTotal(total);
			
		}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	

}
