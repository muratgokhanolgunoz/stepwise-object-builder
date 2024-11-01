import java.text.ParseException;

@FunctionalInterface
interface IJourneyConsumer {
    void accept(Journey journey) throws ParseException;
}