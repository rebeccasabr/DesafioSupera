package br.com.supera.dto;

import java.util.List;

import br.com.supera.domain.Product;

public class GereciadorDoCarrinho {
	
	public List<Product> listProdutoAdicionado;
	

	public List<Product> getListProdutoAdicionado() {
		return listProdutoAdicionado;
	}

	public void setListProdutoAdicionado(List<Product> listProdutoAdicionado) {
		this.listProdutoAdicionado = listProdutoAdicionado;
	}

}
