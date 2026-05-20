package Planes;

public class PlaneSpecification {
    private final String model;
    private final Speed maxSpeed;            
    private final Distance maxFlightDistance;
    private final Weight maxLoadCapacity;

    public PlaneSpecification(String model, Speed maxSpeed, Distance maxFlightDistance, Weight maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() { return model; }
    public int getMaxSpeed() { return maxSpeed.getValue(); }
    public int getMaxFlightDistance() { return maxFlightDistance.getValue(); }
    public int getMaxLoadCapacity() { return maxLoadCapacity.getValue(); }
}