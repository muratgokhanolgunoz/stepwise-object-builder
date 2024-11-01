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
        System.out.println("Journey:");
        System.out.println(" Port Of Loading: " + journey.getPortOfLoading());
        System.out.println(" Port Of Discharge: " + journey.getPortOfDischarge());
        System.out.println(" Departure DateTime: " + journey.getDepartureDateTime());
        System.out.println(" Arrival DateTime: " + journey.getArrivalDateTime());
        System.out.println(" Distance (km): " + journey.getDistanceKm());

        System.out.println();
        System.out.println("Drivers:");

        for (Driver driver : drivers) {
            System.out.println("- Name: " + driver.getName());
            System.out.println("  Lastname: " + driver.getLastname());
            System.out.println("  Identity Number: " + driver.getIdentityNumber());
            System.out.println("  License Number: " + driver.getLicenseNumber());
        }

        System.out.println();
        System.out.println("Cargos:");

        for (Cargo cargo : cargos) {
            System.out.println("- Description: " + cargo.getDescription());
            System.out.println("  Weight (kg): " + cargo.getWeight());
        }
    }
}