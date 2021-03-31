package tn.esprit.spring.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Product;

@Repository
public interface IProductService {

	/**********************Creating add method that insert product into database***************/
	int addProduct(Product p);

	/****************Creating update method that upgrade product from database*****************/
	void updateProduct(Product p, int idProduct);

	/*******************Creating deleting method that remove product by id  from database*********/
	int deleteProduct(int idProduct);
	
	/***************Creating getAll method that retrieve all product from database **************/
	List<Product> getAllProducts(String keyword);

	/**************Creating getByid method that retrieve product detail from database************/
	Product getProductById(int id);

	/***************Creating getAll product by category method from database **************/
	List<Product> getProductsByCategory(String categoryName);
	
	int checkExpirationDate(Product p) ;

	/***************Creating getAll method that retrieve all product from database **************/
	List<Product> getAllProducts(int pageNo, int pageSize);
	
	public int findCategoryByProduct(int idp);
	
	List<Product> getAllProductsByPopularity();

	boolean checkBarCode(String s);

}
