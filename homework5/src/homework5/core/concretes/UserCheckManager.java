package homework5.core.concretes;

import homework5.core.abstracts.UserCheckService;
import homework5.entities.concretes.User;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;



public class UserCheckManager implements UserCheckService{

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	List<User> users = new ArrayList<User>();
	List<User> usermail = new ArrayList<User>();
	
	
	
	@Override
	public boolean checkUserName(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2){
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkUserEmail(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(user.getEmail()).find()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkUserPassword(User user) {
		if (user.getPassword().length()>=6) {
			return true;
		}else {
			return false;
		}
	}
	

}
