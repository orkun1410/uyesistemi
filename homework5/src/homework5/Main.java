package homework5;


import homework5.business.abstracts.UserService;
import homework5.business.concretes.UserManager;
import homework5.core.abstracts.UserCheckService;
import homework5.core.concretes.UserCheckManager;
import homework5.dataAccess.concretes.HibernateUserDao;
import homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new UserCheckManager(), new HibernateUserDao());
		User user1 = new User(1, "orkun", "tiryaki", "abc@gmail.com", "123456789");
		User user2 = new User(2, "ahmet", "tiryaki", "aot.gmail.com", "123456789");
		User user3 = new User(3, "mehmet", "yýlmaz", "abcdef@hotmail.com", "123");
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);
		userService.login(user1);
		userService.login(user2);
		userService.login(user3);

	}

}
