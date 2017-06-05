package com.kush.api.dao;

import java.util.List;

import com.kush.beans.Category;
import com.kush.beans.Product;
import com.kush.beans.ProductType;

/**
 * DAO API to fetch product related Info
 * @author kush
 */
public interface ProductDAO {
	/**
	 * API to fetch category and product type
	 * @return list of category
	 */
	public List<Category> getCategoryType();
	
	/**
	 * API to fetch list of product belonging to particular sub category id.
	 * @param subCategoryId
	 * @return list of products
	 */
	public List<Product> getCategoryProducts(int subCategoryId);
	
	/**
	 * API to fetch list of product belong to particular sub category id.
	 * @param productId
	 * @return
	 */
	public ProductType getProduct(int productId);
	
}
