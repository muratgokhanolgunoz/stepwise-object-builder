import java.text.ParseException;

class Builder implements IJourneyStep, IAfterJourneyStep, IAfterDriverStep, IAfterCargoStep {
    private final RoadTransport roadTransport = new RoadTransport();

    @Override
    public IAfterJourneyStep setJourney(IJourneyConsumer consumer) throws ParseException {
        Journey journey = new Journey();
        consumer.accept(journey);
        roadTransport.setJourney(journey);

        return this;
    }

    @Override
    public IAfterDriverStep addDriver(IDriverConsumer consumer) {
        Driver driver = new Driver();
        consumer.accept(driver);
        roadTransport.addDriver(driver);

        return this;
    }

    @Override
    public IAfterCargoStep addCargo(ICargoConsumer consumer) {
        Cargo cargo = new Cargo();
        consumer.accept(cargo);
        roadTransport.addCargo(cargo);

        return this;
    }

    @Override
    public RoadTransport build() {
        return roadTransport;
    }
}