package homework5.dataAccess.concretes;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("baþarýlý bir þekilde kayýt oldunuz " + user.getFirstName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("baþarýlý bir þekilde giriþ yapýldý. " + user.getFirstName());
		
		
	}

}
