package com.miami.cse.natt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeviceDetectionController {

	@Autowired
	private UserRepository repository;
	
    @GetMapping("/deviceDetection")
    public String deviceDetection(){
        return "deviceDetection";
    }
    
    @RequestMapping("/deviceDetection/signup")
    public String signUpForm(Model model){
    	model.addAttribute("user", new User());
    	return "signup";
    }
    
    @PostMapping("/deviceDetection/signup")
    public String submitSignUp(@ModelAttribute User user){
    	repository.insert(user);
    	return "mainpage";
    }
    
    @RequestMapping("/deviceDetection/login")
    public String loginPage(Model model){
    	model.addAttribute("user", new Login());
    	return "login";
    }
    
    @PostMapping("/deviceDetection/login")
    public String postLogin(@ModelAttribute Login user1){
    	User user = repository.findByUserNameAndPassword(user1.getUserName(), user1.getPassword());
    	repository.save(user);
    	return "mainpage";
    }

}
