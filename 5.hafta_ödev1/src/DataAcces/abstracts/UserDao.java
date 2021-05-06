package DataAcces.abstracts;

import java.util.List;

import Entity.concrates.User;



public interface UserDao {
	void add (User user);
	void update (User user);
	void delete (User user);
	User get (int id);
	List<User> getAll();
}
