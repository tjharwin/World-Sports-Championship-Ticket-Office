import java.util.ArrayList;
/**
 * A class for creating objects of Client.
 * 
 * @author Thomas Harwin
 * @version 1.0
 */
public class Client implements Comparable<Client>
{
    private String firstName;
    private String surname;
    private ArrayList<Booking> ticketsPurchased;

    /**
     * Constructor for objects of class Client
     */
    public Client(String firstName, String surname)
    {
        this.firstName = firstName;
        this.surname = surname;
    }

    /**
     * A method for setting client's full name
     * 
     * @param String firstName, String surname  The client's first name and surname.
     */
    public void setClientName(String firstName, String surname)
    {
        this.firstName = firstName;
        this.surname = surname;
    }

    /**
     * A method for returning a client's first name
     * 
     * @return     A client's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * A method for returning a client's surname
     * 
     * @return     A client's surname
     */
    public String getSurname()
    {
        return firstName;
    }

    /**
     * A toString method for concatonating a first name and surname into one string
     * 
     * @return     A string with firstName and surname combined
     */
    public String toString()
    {
        return firstName + " " + surname;
    }

    /**
     * A method for comparing a new client entry to the array list for the purpose of sorting
     * 
     * @param Client    An instance of Client.
     * @return     An integer for sorting in the ArrayList
     */
    public int compareTo(Client client)
    {
        int compareSurname = 0;
        int compareFirstName = 0;

        compareSurname = surname.compareTo(client.surname);
        if (compareSurname !=0){
            return compareSurname;
        }
        else{
            compareFirstName = firstName.compareTo(client.firstName);
        }
        return compareFirstName;
    }

    /**
     * A method for adding bookings made by a client to an array list
     * 
     * @param eventName, numberOfTickets    An event object and a number of tickets
     */
    public void addBooking(Booking booking)
    {
        ticketsPurchased.add(booking);
    }

    /**
     * A method for returning the tickets purchased by a client
     * 
     * @return A String featuring the event name and number of tickets purchased
     */
    public void printTickets()
    {
        if(ticketsPurchased == null){
            System.out.print(" ---- No bookings made");
        }
        else{
            for(Booking booking : ticketsPurchased){
                System.out.print(" ---- " + booking.getEventName());
                System.out.print(" ");
                System.out.println(" ---- " + booking.getNumberOfTicketsPurchased());
            }
        }
    }

    /**
     * A method for returning the tickets purchased by a client
     * 
     * @return A String featuring the event name and number of tickets purchased
     */
    public Booking getBooking(String eventName)
    {
        for(Booking booking : ticketsPurchased){
            if(eventName.equals(booking.getEventName())){
                return booking;
            }
        }
        //maybe add throw exception instead of null
        return null;
    }
}
