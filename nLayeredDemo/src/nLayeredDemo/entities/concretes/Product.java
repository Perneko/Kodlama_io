package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Emtity;

public class Product implements Emtity {
	private int id;
	private int catagoryid;
	private String name;
	private double unitPrice;
	private int unitInStocks;
	
	public Product() {
		
	}

	public Product(int id, int catagoryid, String name, double unitPrice, int unitInStocks) {
		super();
		this.id = id;
		this.catagoryid = catagoryid;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStocks = unitInStocks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCatagoryid() {
		return catagoryid;
	}

	public void setCatagoryid(int catagoryid) {
		this.catagoryid = catagoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStocks() {
		return unitInStocks;
	}

	public void setUnitInStocks(int unitInStocks) {
		this.unitInStocks = unitInStocks;
	}
	
}
