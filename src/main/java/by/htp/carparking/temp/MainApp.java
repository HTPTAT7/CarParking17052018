package by.htp.carparking.temp;

import java.util.List;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import by.htp.carparking.dao.BaseDao;
import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.hbm.SessionFactoryManager;
import by.htp.carparking.dao.impl.CarDaoDBImpl;
import by.htp.carparking.domain.Car;

public class MainApp {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("spring-beans.xml");
		CarDao dao = (CarDao) appContext.getBean("carDao");

		List<Car> cars = dao.readAll();

		for (Car car : cars) {
			System.out.println(car);
		}

	}

}
