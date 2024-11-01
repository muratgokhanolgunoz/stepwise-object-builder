import java.text.ParseException;

interface IJourneyStep {
    IAfterJourneyStep setJourney(IJourneyConsumer consumer) throws ParseException;
}