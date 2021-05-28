package br.com.supera.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name="TBL_PRODUTO")
@SequenceGenerator(name="tbl_produto_idproduto_seq", sequenceName="tbl_produto_idproduto_seq",initialValue=1, allocationSize=1)
@Entity
public class Product implements Serializable{
	
	   private static final long serialVersionUID = 1L;

	   @Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_produto_idproduto_seq")
	   @Column(name="idProduto")
	   public Integer idProduto;

	   @Column(name="name")
	   public String name;

	   @Column(name="price")
	   public BigDecimal price;

	   @Column(name="score")
	   public Integer score;

	   @Column(name="image")
	   public String image;
	
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
   
   
   
   

}