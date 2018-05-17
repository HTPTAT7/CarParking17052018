package by.htp.carparking.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

//@Component
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	@Qualifier(value="daoHBM")
	private CarDao carDao;

	public CarServiceImpl() {
	}
	
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	public List<Car> getCarsList() {
		return carDao.readAll();
		
		/*ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		return cars;*/
	}
}
