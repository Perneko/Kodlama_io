package nLayeredDemo.business.concrates;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productdao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productdao,LoggerService loggerService) {
		super();
		this.productdao = productdao;
		this.loggerService= loggerService;
	}

	@Override
	public void add(Product product) {
		// i� kodlar� yaz�l�r
		if(product.getCatagoryid()==1) {
			System.out.println("Bu katagoride �r�n kabul edilmez");
			return;
		}
		this.productdao.add(product);
		this.loggerService.logToSystem(" �r�n eklendi "+product.getName());
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
