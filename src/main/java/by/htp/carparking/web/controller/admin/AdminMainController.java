package by.htp.carparking.web.controller.admin;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import by.htp.carparking.service.impl.CarServiceImpl;

@Controller
@RequestMapping(value = "/admin")
public class AdminMainController {
	
	@Autowired
	private CarServiceImpl carServiceImpl;

	
	@RequestMapping(value="/")
	public String mainPage() {
	//	return "{\"name\" : \"John\"}";
		
		//ApplicationContext context = 
		//getBean();
		carServiceImpl.getCarsList();
		
		return "admin_main";
	}

	@RequestMapping(value="/json")
	public @ResponseBody String mainPageJson() {
		return "{\"name\" : \"John\"}";
		
	//	JSONObject json = new JSONObject();
	//	json.put("name", "John");
	//	return json.toJSONString();
	}
	@RequestMapping(value="/json2")
	public @ResponseBody String mainPageJson2(@RequestParam String login){
//		JSONParser parser=new JSONParser();
//		JSONObject jsonObj=(JSONObject) parser.parse(login);
//		String log=(String) jsonObj.get("login");
		
		return "{\"key\" : \"good login\"}";
		
	}
}
