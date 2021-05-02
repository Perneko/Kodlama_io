package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin  = new IndividualCustomer();
		engin.CustomerNumber = "12345";
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.CustomerNumber="123";
		
		SendikaCustomer abx = new SendikaCustomer();
		abx.CustomerNumber="99999";
		
		CustomerManager manager = new CustomerManager();
		Customer[] customers= {engin,abx,hepsiburada};
		
		manager.addMultiple(customers);
		
		
	}

}
