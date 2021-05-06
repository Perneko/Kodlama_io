package Business.concrates;

import java.util.List;

import Business.abstracts.LogInService;
import DataAcces.abstracts.UserDao;
import Entity.concrates.User;

public class LogInManager implements LogInService {
	private UserDao userdao;
	public LogInManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}
	@Override
	public void logIn(String eposta, String password) {
		List<User> users= userdao.getAll();
		for (User user : users) {
			if(user.getEMail()==eposta && user.getPassword()==password) {
				System.out.println("giriþ yapýldý");
				return;
			}
			
		}
		System.out.println("böyle bir kullanýcý yok");
		
		
	}

}
