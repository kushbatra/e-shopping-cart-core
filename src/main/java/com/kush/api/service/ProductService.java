package com.kush.api.service;

import java.util.List;

import com.kush.beans.Category;
import com.kush.beans.Product;
import com.kush.beans.ProductType;

/**
 * Service API to fetch product related Info
 * @author kush
 */
public interface ProductService {
	/**
	 * Service method to fetch category and product related data.
	 * @return list of category
	 */
	public List<Category> getCategoryType() throws Exception;
	
	/**
	 * Service method to fetch list of product belonging to particular sub category id.
	 * @param subCategoryId
	 * @return list of product
	 */
	public List<Product> getCategoryProductsInfo(int subCategoryId);
	
	/**
	 * Service method to fetch list of product belong to particular sub category id.
	 * @param productId
	 * @return product type
	 */
	public ProductType getProductInfo(int productId);
}
