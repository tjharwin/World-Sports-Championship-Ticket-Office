/**
 * A class for creating objects of Event.
 * 
 * @author Thomas Harwin
 * @version 1.0
 */
public class Event implements Comparable<Event>
{
    private String eventName;
    private int ticketsAvailable;

    /**
     * Constructor for objects of class Event
     */
    public Event(String eventName, int ticketsAvailable)
    {
        this.eventName = eventName;
        this.ticketsAvailable = ticketsAvailable;
    }

    /**
     * A method for setting the event's name and tickets sold
     * 
     * @param String eventName, int ticketsAvailable     The event's name and amount of tickets available.
     */
    public void setEventName(String event)
    {
        this.eventName = eventName;
    }

    /**
     * A method for setting the event's name and tickets sold
     * 
     * @param String eventName, int ticketsAvailable     The event's name and amount of tickets available.
     */
    public void setTicketsAvailable(int ticketsAvailable)
    {
        this.ticketsAvailable = ticketsAvailable;
    }

    /**
     * A method for returning an event's name
     * 
     * @return     A event's name
     */
    public String getEventName()
    {
        return eventName;
    }

    /**
     * A method for returning the number of tickets sold for an event
     * 
     * @return     Amount of tickets available.
     */
    public int getTicketsAvailable()
    {
        return ticketsAvailable;
    }

    /**
     * A method for comparing a new event entry to the array list for the purpose of sorting
     * 
     * @param Event    An instance of Event.
     * @return     An integer for sorting in the ArrayList
     */ 
    public int compareTo(Event event)
    {
        return eventName.compareTo(event.eventName);
    }

}
