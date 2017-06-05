package com.kush.beans;

/**
 * Bean to capture product type related fields
 * @author kush
 */
public class ProductType {
	
	private int productTypeId;
	private String productTypeName;
	private Product product;
	
	public ProductType(int pType, String productTypeName, Product p) {
		productTypeId = pType;
		this.productTypeName = productTypeName;
		product = p;
	}
	
	public int getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}