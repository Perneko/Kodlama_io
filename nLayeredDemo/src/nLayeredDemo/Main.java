package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrates.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAcces.concrates.AbcProductDao;

import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		//ToDo : Spring
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product = new Product(1,2,"elma",12,50);
		productService.add(product);

	}

}
