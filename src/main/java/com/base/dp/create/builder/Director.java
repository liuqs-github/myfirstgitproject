package com.base.dp.create.builder;

public class Director {

	private ProductBuilder productBuilder;

	public ProductBuilder getProductBuilder() {
		return productBuilder;
	}

	public void setProductBuilder(ProductBuilder productBuilder) {
		this.productBuilder = productBuilder;
	}

	public Product produce(){
		productBuilder.collectInfo();
		productBuilder.buildComponenet();
		productBuilder.test();
		return productBuilder.getProduct();
	}
}
