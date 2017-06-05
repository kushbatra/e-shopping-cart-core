package com.kush.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kush.api.dao.ProductDAO;
import com.kush.api.service.ProductService;
import com.kush.beans.Category;
import com.kush.beans.Product;
import com.kush.beans.ProductType;

/**
 * Service Implementation to fetch Product related data.
 * @author kush
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO itemsDAO;
	
	@Override
	public List<Category> getCategoryType() {
		List<Category> categoryType = itemsDAO.getCategoryType();
		return categoryType;
	}

	@Override
	public List<Product> getCategoryProductsInfo(int subCategoryId) {
		List<Product> productInfo = itemsDAO.getCategoryProducts(subCategoryId);
		return productInfo;
	}

	@Override
	public ProductType getProductInfo(int productId) {
		ProductType productType = itemsDAO.getProduct(productId);
		return productType;
	}
	
}