package com.kush.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kush.api.dao.ProductDAO;
import com.kush.beans.Category;
import com.kush.beans.Product;
import com.kush.beans.ProductType;

/**
 * DAO Implementation to fetch Product related data.
 * @author kush
 */
@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Override
	public List<Category> getCategoryType() {
		List<Category> categories = new ArrayList<Category>();
		List<ProductType> productTypes = new ArrayList<ProductType>();
		
		ProductType productType = new ProductType(1, "Tables", null);
		productTypes.add(productType);
		//productType = new ProductType(2, "SofaSet", null);
		//productTypes.add(productType);
		Category category = new Category(1, "living area", productTypes);
		categories.add(category);
		
		productTypes = new ArrayList<ProductType>();
		
		productType = new ProductType(3,"Beds", null);
		productTypes.add(productType);
		//productType = new ProductType(4,"Matress", null);
		//productTypes.add(productType);
		category = new Category(2, "bedroom", productTypes);
		categories.add(category);
		
		return categories;
	}

	@Override
	public List<Product> getCategoryProducts(int subCategoryId) {
		List<Product> productList = new ArrayList<Product>();
		Product product;
		
		if(subCategoryId==1) {
			product = new Product(1, "Teek Wood 4 Chairs Set", 650, 3, "Grey",
					"Beautiful pillow top luxurious table set.");
			productList.add(product);
		
			product = new Product(2, "Hard Wood 6 Chairs Set", 700, 2, "Black",
					"Wonderful and Strong Hard wood table set.");
			productList.add(product);
		
			product = new Product(3, "Birstrom wood 6 Chairs Set", 800, 6, "Black",
					"Beatiful Glass Top table set.");
			productList.add(product);
		} else if(subCategoryId==3){
		
			product = new Product(4, "Sleigh bed", 950, 4, "White",
					"Contemporary form of bed that is famous for its bold statement.");
			productList.add(product);
		
			product = new Product(5, "Trundle bed", 1100, 3, "Brown",
					"Designed to provide smart space saving solutions for your home");
			productList.add(product);
		
			product = new Product(6, "Four-poster Bed", 1200, 6, "Black",
					"Traditional-style antique bed constructed with high quality wood");
			productList.add(product);
		}
		return productList;
	}

	@Override
	public ProductType getProduct(int productId) {
		Product product = null;
		ProductType productType = null;
		switch(productId) {
			case 1:
				product = new Product(1, "Teek Wood 4 Chairs Set", 650, 3, "Grey",
						"Beautiful pillow top luxurious table set.");
				productType = new ProductType(1, "tables", product);
				break;
			case 2:
				product = new Product(2, "Hard Wood 6 Chairs Set", 700, 2, "Black",
						"Wonderful and Strong Hard wood table set.");
				productType = new ProductType(2, "tables", product);
				break;
			case 3:
				product = new Product(3, "Birstrom wood 6 Chairs Set", 800, 6, "Black",
						"Beatiful Glass Top table set.");
				productType = new ProductType(3, "tables", product);
				break;
			case 4:
				product = new Product(4, "Sleigh bed", 950, 4, "White",
						"Contemporary form of bed that is famous for its bold statement.");
				productType = new ProductType(4, "beds", product);
				break;
			case 5:
				product = new Product(5, "Trundle bed", 1100, 3, "Brown",
						"Designed to provide smart space saving solutions for your home");
				productType = new ProductType(5, "beds", product);
				break;
			case 6:
				product = new Product(6, "Four-poster Bed", 1200, 6, "Black",
						"Traditional-style antique bed constructed with high quality wood");
				productType = new ProductType(6, "beds", product);
				break;
		}
			
		return productType;
	}
}