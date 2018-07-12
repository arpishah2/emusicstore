package com.emusicstore.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.emusicstore.model.Product;

public class ProductDao {
	private List<Product> productList;

	public List<Product> getProductList() {
		Product product1 = new Product();
		product1.setProductId("P1");
		product1.setProductName("Guitar");
		product1.setProductCategory("Instrument");
		product1.setProductDescription("This is an amazing Guitar");
		product1.setProductPrice(1200);
		product1.setProductCondition("new");
		product1.setProductStatus("active");
		product1.setUnitInStock(11);
		product1.setProductManufacturer("Fender");
		
		
		Product product2 = new Product();
		product2.setProductId("P2");
		product2.setProductName("Record1");
		product2.setProductCategory("Record");
		product2.setProductDescription("This is an amazing mix of 20th century");
		product2.setProductPrice(25);
		product2.setProductCondition("new");
		product2.setProductStatus("active");
		product2.setUnitInStock(51);
		product2.setProductManufacturer("EMI");
		
		Product product3 = new Product();
		product3.setProductId("P3");
		product3.setProductName("Speaker1");
		product3.setProductCategory("Accessory");
		product3.setProductDescription("This is a polk shelf speaker");
		product3.setProductPrice(355);
		product3.setProductCondition("new");
		product3.setProductStatus("active");
		product3.setUnitInStock(9);
		product3.setProductManufacturer("Polk");
		
		productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}
	
	public Product getProductById(String productId) throws IOException{
		for(Product product : getProductList()){
			if(product.getProductId().equals(productId)){
				return product;
			}
		}
		throw new IOException("Product with productId "+productId +"is not present");
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
}
