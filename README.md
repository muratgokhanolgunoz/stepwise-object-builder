# Stepwise Object Builder

This project demonstrates a builder model for a road transportation scenario where a user can define a journey, add drivers and add cargo step by step. The code uses functional interfaces and a streamlined API to create a complete `RoadTransport` object. `RoadTransport was chosen as the scenario to illustrate the Builder Pattern, Method Chaining and Fluent Interfaces constructs`.

## Features
- Define a journey with route and departure date-time.
- Add multiple drivers to the journey.
- Add multiple cargos to the journey.
- Stepwise builder pattern implementation with enforced order.

## Classes and Structure
### Main Class
- The entry point of the application where the `RoadTransport` object is created using the builder pattern.

### RoadTransport Class
- Represents the entire road transport operation, including the journey, drivers, and cargos.
- Methods to print transport information.

### Builder Class
- Implements the step interfaces (`IJourneyStep`, `IAfterJourneyStep`, `IAfterDriverStep`, `IAfterCargoStep`) to enforce the order of setting journey, adding drivers, and adding cargos.
- Provides a `Fluent Interfaces` to build a `RoadTransport` instance.

### Step Interfaces
- `IJourneyStep`: The first step in defining the journey.
- `IAfterJourneyStep`: Defines the next step to add a driver.
- `IAfterDriverStep`: Allows adding another driver or moving to add cargos.
- `IAfterCargoStep`: Allows adding more cargos or building the final `RoadTransport` instance.

### Usage Example
```java
public class Main {
    public static void main(String[] args) {
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
```

## Prerequisites
- Java 8 or higher

## Running the Application
1. Clone the repository.
2. Compile the Java files.
3. Run the `Main` class.

## Example Output
```
Journey:
 Port Of Loading: TR - Istanbul
 Port Of Discharge: TR - Ankara
 Departure DateTime: Fri Nov 01 12:30:00 TRT 2024
 Arrival DateTime: Fri Nov 01 18:30:00 TRT 2024
 Distance (km): 450

Drivers:
- Name: Murat Gokhan
  Lastname: Olgunoz
  Identity Number: 12345678901
  License Number: TR123456
- Name: Hakan
  Lastname: Olgunoz
  Identity Number: 98765432109
  License Number: TR789456

Cargos:
- Description: Car Parts
  Weight (kg): 15000
- Description: Computer Parts
  Weight (kg): 1000
- Description: Foods
  Weight (kg): 5000
```
