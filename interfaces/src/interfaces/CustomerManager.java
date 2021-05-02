package interfaces;

public class CustomerManager {
	private Logger[] logger;
	
	public CustomerManager(Logger[] logger) {
		this.logger = logger;
		
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+ customer.getFirstName());
		
		
		Utils.runLoggers(logger, customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi "+ customer.getFirstName());
		
		Utils.runLoggers(logger, customer.getFirstName());
	
	}
}
