package by.htp.carparking.dao.hbm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;

//@Component
@Repository(value="daoHBM")
public class CarDaoHibernateImpl implements CarDao {

	@Override
	public void create(Car entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Car read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> readAll() {

		/*
		 * Session session = SessionFactoryManager
		 * .getSessionFactory().openSession();
		 * 
		 * Criteria criteria = session.createCriteria(Car.class);
		 * 
		 * return criteria.list();
		 */
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		return cars;
	}

	@Override
	public void update(Car entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
