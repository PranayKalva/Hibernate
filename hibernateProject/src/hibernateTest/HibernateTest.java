package hibernateTest;


import java.util.Date;

import model.Address;
import model.FourWheelerVehicle;
import model.TwoWheelerVehicle;
import model.UserDetails;
import model.Vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails ud = new UserDetails();
		ud.setUserName("AJAY");
		ud.setJoinedDate(new Date(02-18-2017));
		Address add1 = new Address();
		add1.setCity("Huntsville");
		add1.setState("AL");
		add1.setStreet("Brownston CT");
		add1.setZipcode("35763");
		Address add2 = new Address("KANSAS","MO","6625 W141 ST","64093");
		ud.getListOfAddresses().add(add1);
		ud.getListOfAddresses().add(add2);
 		ud.setDescription("Description of First Person goes here");
 		Vehicle vehicle = new Vehicle();
 		vehicle.setVehicleId(1);
 		vehicle.setVehicleName("Car");
 		
 		TwoWheelerVehicle twv = new TwoWheelerVehicle();
 		twv.setVehicleName("Porsche");
 		twv.setSteeringWheel("Car Steering");
 		
 		FourWheelerVehicle fwv = new FourWheelerVehicle();
 		fwv.setVehicleId(2);
 		fwv.setVehicleName("Bike");
 		fwv.setSteeringHandle("Bike Handle");
 		
 		ud.getVehicle().add(vehicle);
 		ud.getVehicle().add(twv);
 		ud.getVehicle().add(fwv);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(ud);
		session.save(twv);
		session.save(fwv);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		/*
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		UserDetails ud = new UserDetails();
		//ud = null;
		Session session = sf.openSession();
		session.beginTransaction();
		ud= (UserDetails) session.get(UserDetails.class,1);
		System.out.println("USER NAME IS "+ ud.getUserName().toUpperCase()+ " HE LIVES IN "+ud.getListOfAddresses());*/
	}
}
