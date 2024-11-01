import java.util.ArrayList;
import java.util.List;

class RoadTransport {
    private Journey journey;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Cargo> cargos = new ArrayList<>();

    RoadTransport() {

    }

    public static IJourneyStep create() {
        return new Builder();
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addCargo(Cargo cargo) {
        cargos.add(cargo);
    }

    public void print() {
        System.out.println("Port Of Loading: " + journey.getPortOfLoading());
        System.out.println("Port Of Discharge: " + journey.getPortOfDischarge());
        System.out.println("Departure DateTime: " + journey.getDepartureDateTime());
        System.out.println("Arrival DateTime: " + journey.getArrivalDateTime());
        System.out.println("Distance: " + journey.getDistanceKm() + "km");

        System.out.println();

        for (Driver driver : drivers) {
            System.out.println("Driver Name: " + driver.getName());
            System.out.println("Driver Lastname: " + driver.getLastname());
            System.out.println("Driver Identity Number: " + driver.getIdentityNumber());
            System.out.println("Driver License Number: " + driver.getLicenseNumber());
            System.out.println("---");
        }

        System.out.println();

        for (Cargo cargo : cargos) {
            System.out.println("Cargo Description: " + cargo.getDescription());
            System.out.println("Cargo Weight (kg): " + cargo.getWeight());
            System.out.println("---");
        }
    }
}