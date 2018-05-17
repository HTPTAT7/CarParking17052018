package by.htp.carparking.web.action.impl;

//import static by.htp.carparking.web.util.WebConstantDeclaration.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;

import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;
import by.htp.carparking.service.impl.CarServiceImpl;
import by.htp.carparking.web.action.BaseAction;

public class CarListViewAction implements BaseAction{
	
	private CarService carService; 
	

	public CarListViewAction() {
	}

	public void setCarService(CarService carService) {
		this.carService = carService;
	}


	public String executeAction(HttpServletRequest request) {
		
//		List<Car> cars = carService.getCarsList();
//		request.setAttribute(REQUEST_PARAM_CAR_LIST, cars);
		
//		return PAGE_USER_MAIN;
		return "";
	}

	
}
