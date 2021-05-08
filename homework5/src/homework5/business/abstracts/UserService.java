package homework5.business.abstracts;

import homework5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	

}
