package by.htp.carparking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import by.htp.carparking.domain.Car;


public interface CarService {
	
	List<Car> getCarsList();

}
