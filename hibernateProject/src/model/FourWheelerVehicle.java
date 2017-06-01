package model;

import javax.persistence.Entity;

@Entity
public class FourWheelerVehicle extends Vehicle{

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

	private String steeringHandle;
	
	
}
