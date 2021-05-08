package homework5.business.concretes;

import homework5.business.abstracts.UserService;
import homework5.core.abstracts.UserCheckService;
import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	UserCheckService userCheckService;
	
	
	public UserManager(UserCheckService userCheckService , UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.userDao =userDao;
	}
	
	
	@Override
	public void register(User user) {
		
		if (user.getFirstName()==null && user.getLastName() == null && user.getEmail()==null && user.getPassword()==null) {
			System.out.println("Temel bilgilerin tamamı zorunludur!!");
		}
		else if (!(userCheckService.checkUserName(user))) {
			System.out.println("-Ad ve soyad en az iki karakterden oluşmalıdır.");
			
		}
		else if (!userCheckService.checkUserEmail(user)) {
			System.out.println("-E-posta formatı yanlış veya bu e posta zaten kayıtlı lütfen kontrol ediniz.");
			
		}
		else if(!userCheckService.checkUserPassword(user)) {
			System.out.println("-Parola 6 karakterden küçük olamaz.");
			
		}
		
		else {
			userDao.register(user);
		}
		
		
		}
		
	

	@Override
	public void login(User user) {
		if (user.getEmail()==null && user.getPassword()==null) {
			System.out.println("E-posta ve parola zorunludur");
		}else {
			userDao.login(user);
		}
		
		
	}
	

}










//else if (!(userCheckService.checkUserName(user) && userCheckService.checkUserEmail(user) &&
		//userCheckService.checkUserPassword(user))) {
	//System.out.println("bu kuralları dikkate alarak tekrar kayıt olun!");
	//System.out.println("-Parola 6 karakterden küçük olamaz.");
	//System.out.println("-E-posta formatı yanlış tekrar deneyiniz. ");
	//System.out.println("-Ad ve soyad en az iki karakterden oluşmalıdır.");
	//System.out.println("-bu e posta zaten kayıtlı.");
