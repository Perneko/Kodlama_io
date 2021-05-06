package Business.concrates;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import Business.abstracts.UserService;

import DataAcces.abstracts.UserDao;
import Entity.concrates.User;
import core.LoggerService;



public class UserManager implements UserService {
	private UserDao userdao;
	private LoggerService service;
	
	
	
	
	public UserManager(UserDao userdao,LoggerService service) {
		super();
		this.userdao = userdao;
		this.service=service;
		
	}

	@Override
	public void add(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("parola en az 6 karakterli olmal�d�r");
			return;
		}
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEMail());
		if(!matcher.matches()) {
			System.out.println("Ge�ersiz e-posta");
			return;
		}
		List<User> users= getAll();
		for (User user2 : users) {
			if(user2.getEMail()==user.getEMail()) {
				System.out.println("Daha �nce kullan�lm�� e-posta");
				return;
			}
		}
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("ad ve soyad en az 2 karakterden olu�mal�");
			return;
		}
		System.out.println("ba�ar�yla eklendi");
		service.message();
		userdao.add(user);
		
		
	}

	@Override
	public List<User> getAll() {
		
		return userdao.getAll();
	}

	@Override
	public void delete(User user) {
		userdao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userdao.update(user);
		
	}

}
