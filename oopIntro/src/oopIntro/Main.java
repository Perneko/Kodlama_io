package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo 15",1500,"16 gb",10);
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova 16");
		product2.setName("16 gb");
		product2.setUnitPrice(16000);
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Catogory catogory1 = new Catogory();
		Catogory catogory2 = new Catogory();
		
		catogory1.setId(1);
		catogory1.setName("içecek");
		
		catogory2.setId(2);
		catogory2.setName("yiyecek");
		
		System.out.println(catogory1.getName());
		System.out.println(catogory2.getName());

	}
}
