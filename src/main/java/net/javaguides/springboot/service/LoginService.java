package net.javaguides.springboot.service;
import org.springframework.stereotype.Service;
@Service
public class LoginService {
	
	public boolean ValidateUser(String userid,String password)
	{
		return userid.equalsIgnoreCase("simplilearn") && password.equalsIgnoreCase("dummy");
	}


}






	
	

