import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Create a road transport operation
        RoadTransport roadTransport = RoadTransport.create()
                .setJourney(journey -> journey
                        .setPortOfLoading("TR - Istanbul")
                        .setPortOfDischarge("TR - Ankara")
                        .setDepartureDateTime("2024-11-01T12:30:00")
                        .setArrivalDateTime("2024-11-01T18:30:00")
                        .setDistance(450)
                )
                .addDriver(driver -> driver
                        .setName("Murat Gokhan")
                        .setLastname("Olgunoz")
                        .setIdentityNumber("12345678901")
                        .setLicenseNumber("TR123456")
                )
                .addDriver(driver -> driver
                        .setName("Hakan")
                        .setLastname("Olgunoz")
                        .setIdentityNumber("98765432109")
                        .setLicenseNumber("TR789456")
                )
                .addCargo(cargo -> cargo
                        .setDescription("Car Parts")
                        .setWeight(15000)
                )
                .addCargo(cargo -> cargo
                        .setDescription("Computer Parts")
                        .setWeight(1000)
                )
                .addCargo(cargo -> cargo
                        .setDescription("Foods")
                        .setWeight(5000)
                )
                .build();

        // Print transport information
        roadTransport.print();
    }
}