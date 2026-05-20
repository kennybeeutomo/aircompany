package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane {

	private int passengersCapacity;

	public PassengerPlane(PlaneSpecification specification, int passengersCapacity) {
		super(specification);
		this.passengersCapacity = passengersCapacity;
	}

	public int getPassengersCapacity() {
		return passengersCapacity;
	}

	@Override
	protected String buildDetails() {
		return ", passengersCapacity=" + passengersCapacity;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof PassengerPlane))
			return false;
		if (!super.equals(o))
			return false;
		PassengerPlane plane = (PassengerPlane) o;
		return passengersCapacity == plane.passengersCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), passengersCapacity);
	}
}
