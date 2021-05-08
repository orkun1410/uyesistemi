package homework5.core.abstracts;

import homework5.entities.concretes.User;

public interface UserCheckService {
	boolean checkUserName(User user);
	boolean checkUserEmail(User user);
	boolean checkUserPassword(User user);

}
