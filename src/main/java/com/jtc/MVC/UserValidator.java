package com.jtc.MVC;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class clazz) {
		System.out.println("Support in UserValidator");
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		System.out.println("Validate in UserValidator");
		User user = (User) command;
		
		if(user.getUsername()==null||user.getUsername().length()==0) {
			errors.rejectValue("username","errors.required",new Object[] {"Username"},"User Name is Required" );
		}
		
		if(user.getPassword()==null||user.getPassword().length()==0) {
			errors.rejectValue("password","errors.required",new Object[] {"Password"},"Password Mandatory" );
		}
		
	}

}
