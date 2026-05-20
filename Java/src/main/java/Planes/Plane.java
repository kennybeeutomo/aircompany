package Planes;

import java.util.Objects;

public abstract class Plane {
	protected final PlaneSpecification specification;

	public Plane(PlaneSpecification specification) {
		this.specification = specification;
	}

	public String getModel() {
		return specification.getModel();
	}

	public int getMaxSpeed() {
		return specification.getMaxSpeed();
	}

	public int getMaxFlightDistance() {
		return specification.getMaxFlightDistance();
	}

	public int getMaxLoadCapacity() {
		return specification.getMaxLoadCapacity();
	}

	@Override
	public String toString() {
		return "Plane{" +
				"model='" + getModel() + '\'' +
				", maxSpeed=" + getMaxSpeed() +
				", maxFlightDistance=" + getMaxFlightDistance() +
				", maxLoadCapacity=" + getMaxLoadCapacity() +
				buildDetails() +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Plane))
			return false;
		Plane plane = (Plane) o;
		return getMaxSpeed() == plane.getMaxSpeed() &&
				getMaxFlightDistance() == plane.getMaxFlightDistance() &&
				getMaxLoadCapacity() == plane.getMaxLoadCapacity() &&
				Objects.equals(getModel(), plane.getModel());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getModel(), getMaxSpeed(), getMaxFlightDistance(), getMaxLoadCapacity());
	}

	protected String buildDetails() {
		return "";
	}
}
