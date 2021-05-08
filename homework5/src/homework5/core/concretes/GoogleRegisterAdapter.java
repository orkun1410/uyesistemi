package homework5.core.concretes;

import homework5.Google.GoogleRegister;
import homework5.core.abstracts.RegisterService;

public class GoogleRegisterAdapter implements RegisterService{

	@Override
	public void register(String message) {
		GoogleRegister googleRegister = new GoogleRegister();
		googleRegister.register();
		
	}

}
