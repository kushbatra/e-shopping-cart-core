package com.kush.beans;

/**
 * Bean to capture product related fields
 * @author kush
 */
public class Product {
	
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	private String color;
	private String description;
	
	public Product(int pId, String pName, int price, int quantity, String color, String description) {
		productId = pId;
		productName = pName;
		this.price = price;
		this.quantity = quantity;
		this.color =  color;
		this.description = description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}