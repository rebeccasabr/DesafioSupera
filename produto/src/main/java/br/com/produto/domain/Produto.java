package br.com.produto.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="TBL_PRODUTOS")
@SequenceGenerator(name="tbl_produto_id_produto_seq", sequenceName="tbl_produto_id_produto_seq",initialValue=1, allocationSize=1)
@Entity
   public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
 @Id
 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_produto_id_produto_seq")
 
 @Column(name="idProduto")
 private Integer idProduto;
 
 @Column(name="nomeProduto")
 private String nomeProduto;
 
 @Column(name="Valor")
 private Double Valor;
 
 @Column(name="descricao")
 private String descricao;
 
 @Column(name="valorFrete")
 private Double valorFrete;

public Integer getIdProduto() {
	return idProduto;
}

public void setIdProduto(Integer idProduto) {
	this.idProduto = idProduto;
}

public String getNomeProduto() {
	return nomeProduto;
}

public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}

public Double getValor() {
	return Valor;
}

public void setValor(Double valor) {
	Valor = valor;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public Double getValorFrete() {
	return valorFrete;
}

public void setValorFrete(Double valorFrete) {
	this.valorFrete = valorFrete;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public Produto(Integer idProduto, String nomeProduto, Double valor, String descricao, Double valorFrete) {
	super();
	this.idProduto = idProduto;
	this.nomeProduto = nomeProduto;
	Valor = valor;
	this.descricao = descricao;
	this.valorFrete = valorFrete;
}

@Override
public String toString() {
	return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", Valor=" + Valor + ", descricao="
			+ descricao + ", valorFrete=" + valorFrete + "]";
}
 
 
 
 
 
 
	
	
}
