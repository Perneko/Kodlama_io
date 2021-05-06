

import Business.abstracts.LogInService;
import Business.abstracts.UserService;
import Business.concrates.LogInManager;
import Business.concrates.UserManager;

import DataAcces.concrates.AbcUserDao;
import Entity.abstracts.Entity;
import Entity.concrates.User;
import Gmail.GmailService;
import Gmail.LogInGmail;
import core.EmailLoggerAdapter;

public class Main {

	public static void main(String[] args) {
		
		User user1= new User(1, "Taha Emre", "UÐUR", "tahaemre17@gmail.com", "123456");// doðru çalýþcak
		User user2= new User(2, "Taha Emre", "UÐUR", "tahaemre17", "123456");//hatalý eposta
		User user3= new User(3, "Taha", "UÐUR", "tahaemre17@gmail.com", "123456");// ayný eposta
		User user4= new User(4, "Emre", "UÐUR", "tahaemre@gmail.com", "123456");	// doðru çalýþcak
		
		AbcUserDao abc= new AbcUserDao();
		UserService service = new UserManager(abc,new EmailLoggerAdapter());
		service.add(user1);
		service.add(user2);
		service.add(user3);
		service.add(user4);
		
		LogInService logService= new LogInManager(abc);
		logService.logIn("tahaemre17@gmail.com", "123456");
		
		GmailService gmailService= new LogInGmail();
		gmailService.LogIn("Hoþgeldiniz");
		

	}

}
