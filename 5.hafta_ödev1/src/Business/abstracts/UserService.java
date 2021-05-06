package Business.abstracts;

import java.util.List;


import Entity.concrates.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	
}
