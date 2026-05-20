import Planes.experimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class Airport {
	private List<? extends Plane> planes;

	private <T extends Plane> List<T> getPlanesByType(Class<T> type) {
		List<T> result = new ArrayList<>();
		for (Plane plane : this.planes) {
			if (type.isInstance(plane)) {
				result.add(type.cast(plane));
			}
		}
		return result;
	}

	public List<PassengerPlane> getPassengerPlane() {
		return getPlanesByType(PassengerPlane.class);
	}

	public List<MilitaryPlane> getMilitaryPlanes() {
		return getPlanesByType(MilitaryPlane.class);
	}

	public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
		List<PassengerPlane> passengerPlanes = getPassengerPlane();
		PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
		for (int i = 0; i < passengerPlanes.size(); i++) {
			if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
				planeWithMaxCapacity = passengerPlanes.get(i);
			}
		}

		return planeWithMaxCapacity;
	}

	private List<MilitaryPlane> getMilitaryPlanesByType(MilitaryType type) {
		List<MilitaryPlane> result = new ArrayList<>();
		List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
		for (MilitaryPlane plane : militaryPlanes) {
			if (plane.getType() == type) {
				result.add(plane);
			}
		}
		return result;
	}

	public List<MilitaryPlane> getTransportMilitaryPlanes() {
		return getMilitaryPlanesByType(MilitaryType.TRANSPORT);
	}

	public List<MilitaryPlane> getBomberMilitaryPlanes() {
		return getMilitaryPlanesByType(MilitaryType.BOMBER);
	}

	public List<experimentalPlane> getExperimentalPlanes() {
		return getPlanesByType(experimentalPlane.class);
	}

	public Airport sortByMaxDistance() {
		Collections.sort(planes, new Comparator<Plane>() {
			public int compare(Plane o1, Plane o2) {
				return o1.Get_Max_Flight_Distance() - o2.Get_Max_Flight_Distance();
			}
		});
		return this;
	}

	public Airport sortByMaxSpeed() {
		Collections.sort(planes, new Comparator<Plane>() {
			public int compare(Plane o1, Plane o2) {
				return o1.getMS() - o2.getMS();
			}
		});
		return this;
	}

	public Airport sortByMaxLoadCapacity() {
		Collections.sort(planes, new Comparator<Plane>() {
			public int compare(Plane o1, Plane o2) {
				return o1.getMinLoadCapacity() - o2.getMinLoadCapacity();
			}
		});
		return this;
	}

	public List<? extends Plane> getPlanes() {
		return planes;
	}

	@Override
	public String toString() {
		return "Airport{" +
				"Planes=" + planes.toString() +
				'}';
	}

	public Airport(List<? extends Plane> planes) {
		this.planes = planes;
	}

}
