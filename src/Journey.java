import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Journey {
    private String portOfLoading;
    private String portOfDischarge;
    private Date departureDateTime;
    private Date arrivalDateTime;
    private int distance;

    public Journey setPortOfLoading(String portOfLoading) {
        this.portOfLoading = portOfLoading;
        return this;
    }

    public String getPortOfLoading() {
        return this.portOfLoading;
    }

    public Journey setPortOfDischarge(String portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
        return this;
    }

    public String getPortOfDischarge() {
        return this.portOfDischarge;
    }

    public Journey setDepartureDateTime(String departureDateTime) throws ParseException {
        this.departureDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(departureDateTime);
        return this;
    }

    public Date getDepartureDateTime() {
        return this.departureDateTime;
    }

    public Journey setArrivalDateTime(String arrivalDateTime) throws ParseException {
        this.arrivalDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(arrivalDateTime);
        return this;
    }

    public Date getArrivalDateTime() {
        return this.arrivalDateTime;
    }

    public Journey setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public int getDistanceKm() {
        return this.distance;
    }
}