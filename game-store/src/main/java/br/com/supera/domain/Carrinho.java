package br.com.supera.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name="TBL_CARRINHO")
@SequenceGenerator(name="tbl_carrinho_idcarrinho_seq", sequenceName="tbl_carrinho_idcarrinho_seq",initialValue=1, allocationSize=1)
@Entity
public class Carrinho implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	 @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_carrinho_idcarrinho_seq")
	@Column(name="idCarrinho")
	public Integer idCarrinho;
	
    @Column(name="valorFrete")
	public  BigDecimal valorFrete;
	
    @Column(name="idProduto")
	public List<Product> listProduto;
    
    @Column(name="valorTotal")
    public BigDecimal valorTotalCompras; 
    
    

	public BigDecimal getValorTotalCompras() {
		return valorTotalCompras;
	}

	public void setValorTotalCompras(BigDecimal valorTotalCompras) {
		this.valorTotalCompras = valorTotalCompras;
	}

	public Integer getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(Integer idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public List<Product> getListProduto() {
		return listProduto;
	}

	public void setListProduto(List<Product> listProduto) {
		this.listProduto = listProduto;
	}

}
