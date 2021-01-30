import java.util.ArrayList;

public class FlightManager {

    private Passenger passenger;
//    private ArrayList<Passenger> passengers;
    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Passenger passenger, Flight flight){
        this.flight = flight;
        this.passenger = passenger;
        this.plane = new Plane(PlaneType.BOEING747);
//        this.passengers = new ArrayList<Passenger>();

    }

    public int bagWeightPerPassenger() {
        int totalBagAllowance = plane.getPlaneWeight() / 2;
        int singleBagAllowance = totalBagAllowance / plane.getPlaneCapacity();
        return singleBagAllowance;
    }

    public int getBagWeight(){
        return passenger.getBags() * bagWeightPerPassenger();
    }

    public int getRemainingHoldWeight() {
        int totalBagAllowance = plane.getPlaneWeight() / 2;
        return totalBagAllowance - getBagWeight();
    }
}
