package DataAcces.concrates;

import java.util.ArrayList;
import java.util.List;

import DataAcces.abstracts.UserDao;
import Entity.concrates.User;

public class AbcUserDao implements UserDao {
	//ABC herhangi bir dao yu temsil eder
	private List<User> users = new ArrayList<User>(); 
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Veriler sisteme eklendi...");
	}

	@Override
	public void update(User user) {
		System.out.println("Veriler sisteme güncellendi...");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Veriler sistemden silindi...");
		
		
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
			
		}
		System.out.println("bu id de ekli biri yok");
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
