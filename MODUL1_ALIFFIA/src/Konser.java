public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String BandName;
    private String Date;
    private String Location;
    private float TicketPrice;

    public String getBandName() {
        return this.BandName;
    }

    public void setBandName(String BandName) {
        this.BandName = BandName;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getLocation() {
        return this.Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public float getTicketPrice() {
        return this.TicketPrice;
    }

    public void setTicketPrice(float TicketPrice) {
        this.TicketPrice = TicketPrice;
    }

    
}