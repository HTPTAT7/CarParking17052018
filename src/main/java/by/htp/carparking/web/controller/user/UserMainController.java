package by.htp.carparking.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserMainController {
	
	
	@RequestMapping(value="/")
	public String mainPage(){
		return "user_main";
	}

}
