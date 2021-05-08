package homework5.dataAccess.abstracts;

import homework5.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	
	

}
