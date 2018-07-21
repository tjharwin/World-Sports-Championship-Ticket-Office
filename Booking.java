
/**
 * A class for creating objects of Booking.
 *
 * @author Thomas Harwin
 * @version 1.0
 */
public class Booking
{
    private String eventName;
    private int numberOfTicketsPurchased;

    /**
     * Constructor for objects of class Booking
     */
    public Booking(String eventName, int numberOfTickets)
    {
        this.eventName = eventName;
        numberOfTicketsPurchased = 0;
    }

    /**
     * A method for returning a booking's event name
     * 
     * @return     A booking's event name
     */
    public String getEventName()
    {
        return eventName;
    }

    /**
     * A method for returning the number of tickets purchased in a booking
     * 
     * @return     The amount of tickets purchased in a booking
     */
    public int getNumberOfTicketsPurchased()
    {
        return numberOfTicketsPurchased;
    }
}
