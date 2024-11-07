 package com.jtc.MVC;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginControlller {
	@Autowired
	private UserValidator uservalidator;
	
	@GetMapping("/showLogin.jtc")
	public String showLoginForm(Model model) throws ServletException {
		System.out.println("showLoginForm");
		User user = new User();
		user.setUsername("Ankur Singh");
		model.addAttribute("myuser", user);
		return "login";
	}
	
	@PostMapping("/verifyUser.jtc")
	public String verifyUser(@ModelAttribute("myuser") User user,BindingResult result) {
		System.out.println("verifyUser()");
		uservalidator.validate(user, result);
		if(result.hasErrors()) {
			System.out.println(result.getErrorCount());
			return "login";
			
		}
		String un = user.getUsername();
		String pw = user.getPassword();
		if(un.equals(pw)) 
			return "home";
		
		return "login";
	}
	
}
