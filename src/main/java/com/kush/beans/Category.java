package com.kush.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Bean to capture category related fields
 * @author kush
 */
public class Category implements Serializable{
	
	private static final long serialVersionUID = 2800752478826476806L;
	
	private int categoryId;
	private String categoryName;
	private List<ProductType> productType;
	
	public Category(int cId, String catName, List<ProductType> productType) {
		categoryId = cId;
		categoryName = catName;
		this.productType = productType;
		
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<ProductType> getProductType() {
		return productType;
	}
	public void setProductType(List<ProductType> productType) {
		this.productType = productType;
	}
	
}