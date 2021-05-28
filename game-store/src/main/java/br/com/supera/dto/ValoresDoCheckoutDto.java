package br.com.supera.dto;

import java.math.BigDecimal;

public class ValoresDoCheckoutDto {
	
	private BigDecimal frete;
	

	private BigDecimal subTotal;	
	
	private BigDecimal total;
	
	
	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	

	


	
	

}
