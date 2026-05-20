package Planes;

import java.util.Objects;

public abstract class Plane {
	protected final PlaneSpecification specification;

    public Plane(PlaneSpecification specification) {
        this.specification = specification;
    }

	public String getModel() { return specification.getModel(); }
	public int getMaxSpeed() { return specification.maxSpeed; }
    public int getMaxFlightDistance() { return specification.maxFlightDistance; }
    public int getMaxLoadCapacity() { return specification.maxLoadCapacity; }

	@Override
	public String toString() {
		return "Plane{" +
				"model='" + model + '\'' +
				", maxSpeed=" + maxSpeed +
				", maxFlightDistance=" + maxFlightDistance +
				", maxLoadCapacity=" + maxLoadCapacity +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Plane))
			return false;
		Plane plane = (Plane) o;
		return maxSpeed == plane.maxSpeed &&
				maxFlightDistance == plane.maxFlightDistance &&
				maxLoadCapacity == plane.maxLoadCapacity &&
				Objects.equals(model, plane.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
	}
}
