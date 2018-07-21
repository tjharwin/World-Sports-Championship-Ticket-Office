import java.io.*;
import java.util.*;
/**
 * The main method for running the Interactive System program.
 * 
 * @author Thomas Harwin 
 * @version 1.0
 */
public class Main
{

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("                                     ,,        ,,                                                                     "); 
        System.out.println(" `7MMF'     A     `7MF'            `7MM      `7MM       .M'''bgd                             mm                        ");
        System.out.println("   `MA     ,MA     ,V                MM        MM      ,MI    'Y                             MM                       "); 
        System.out.println("    VM:   ,VVM:   ,V ,pW'Wq.`7Mb,od8 MM   ,M''bMM      `MMb.   `7MMpdMAo.  ,pW'Wq.`7Mb,od8 mmMMmm ,pP'Ybd             "); 
        System.out.println("     MM.  M' MM.  M'6W'   `Wb MM' `' MM ,AP    MM        `YMMNq. MM   `Wb 6W'   `Wb MM' `'   MM   8I   `'             "); 
        System.out.println("     `MM A'  `MM A' 8M     M8 MM     MM 8MI    MM      .     `MM MM    M8 8M     M8 MM       MM   `YMMMa.             "); 
        System.out.println("      :MM;    :MM;  YA.   ,A9 MM     MM `Mb    MM      Mb     dM MM   ,AP YA.   ,A9 MM       MM   L.   I8             "); 
        System.out.println("       VF      VF    `Ybmd9'.JMML. .JMML.`Wbmd`MML.    P`Ybmmd'  MMbmmd'   `Ybmd9'.JMML.     `MbmoM9mmmP'             "); 
        System.out.println("                                                                 MM                                                   "); 
        System.out.println("                                                               .JMML.                                                 "); 
        System.out.println("                                                                                                                      "); 
        System.out.println("               ,,                                             ,,                              ,,         ,,           "); 
        System.out.println("   .g8'''bgd `7MM                                             db                            `7MM         db           "); 
        System.out.println(" .dP'     `M   MM                                                                             MM                      "); 
        System.out.println(" dM'       `   MMpMMMb.   ,6'Yb. `7MMpMMMb.pMMMb. `7MMpdMAo.`7MM  ,pW'Wq.`7MMpMMMb.  ,pP'Ybd  MMpMMMb. `7MM `7MMpdMAo."); 
        System.out.println(" MM            MM    MM  8)   MM   MM    MM    MM   MM   `Wb  MM 6W'   `Wb MM    MM  8I   `'  MM    MM   MM   MM   `Wb"); 
        System.out.println(" MM.           MM    MM   ,pm9MM   MM    MM    MM   MM    M8  MM 8M     M8 MM    MM  `YMMMa.  MM    MM   MM   MM    M8"); 
        System.out.println(" `Mb.     ,'   MM    MM  8M   MM   MM    MM    MM   MM   ,AP  MM YA.   ,A9 MM    MM  L.   I8  MM    MM   MM   MM   ,AP"); 
        System.out.println("   `'bmmmd'  .JMML  JMML.`Moo9^Yo.JMML  JMML  JMML. MMbmmd' .JMML.`Ybmd9'.JMML  JMML.M9mmmP'.JMML  JMML.JMML. MMbmmd' "); 
        System.out.println("                                                    MM                                                        MM      "); 
        System.out.println("                                                  .JMML.                                                    .JMML.    ");  
        System.out.println("                                                                                                                      ");
        System.out.println("                                                                         -:---`                                       ");
        System.out.println("                                   ./:`                                        .---`                                  ");
        System.out.println("                        `:syyo/-. `NMMs                   sh+                      -+ho.                              ");
        System.out.println("                     +sys+:.:shMMmdMNm:                   NMN                 .mNd-  mN+                              ");
        System.out.println("                     s+`     `dMMMMMd.  /m-              oNMMds`              `yMMhosMm`                              ");
        System.out.println("                             hMMMMMyhm//d:         `::` .MmMMMMo               oMMMMh:`                               ");
        System.out.println("                           .yMMMNo.  /md.         +MMMN:/N.hMMMm`              .mMMMy                                 ");
        System.out.println("                          .NMMMN+.                hMMMMssm`yMMMMd               oMMMm                                 ");
        System.out.println("                          .NMMMMMMm+               -:::hNMMMMMMMm               hMMMd                                 ");
        System.out.println("                         .mMm+--+NMy                    :MMd/sMh-              `MMMMM-                                ");
        System.out.println("                       `sNm/   `hm/                    `NN/ -Md                 hMMMM/                                ");
        System.out.println("                      /ds-    `hs`                      hN   mN`               `dMMMN`                                ");
        System.out.println("                    -md`     .mM+                       oN:  om               /NMdmMm                                 ");
        System.out.println("                     /y       `/so                     omo-  +N.           ./hMMs`NMy                                 ");
        System.out.println("                                                             oo.           dMmo`  NM:                                 ");
        System.out.println("                                                                          `y+    `Nm`                                 ");         

        //Scans the input file and puts Event & Client details into their array lists

        Scanner inputFile = new Scanner(new FileReader("H:\\MSc Computer Sciences\\CSC8001\\Interactive System\\inputfile.txt"));

        SortedArrayList<Event> eventList = new SortedArrayList<Event>();
        SortedArrayList<Client> clientList = new SortedArrayList<Client>();

        int amountOfEvents = Integer.parseInt(inputFile.nextLine());

        for (int i = 0; i < amountOfEvents; i++){
            String eventName = inputFile.nextLine();
            int ticketsAvailable = Integer.parseInt(inputFile.nextLine());
            Event newEvent = new Event(eventName, ticketsAvailable);
            eventList.add(newEvent);
        }

        int amountOfClients = Integer.parseInt(inputFile.nextLine());

        for (int i = 0; i < amountOfClients; i++){
            String fullName = inputFile.nextLine();
            String[] nameParts = fullName.split(" ");
            Client newClient = new Client(nameParts[0], nameParts[1]);
            clientList.add(newClient);
        }

        //Takes input from the keyboard for menu selection
        Scanner keyboard = new Scanner(System.in);
        printMenu();
        char ch = '\0';

        do{
            ch = keyboard.next().charAt(0);
            switch(ch)
            {
                //Finish running the program
                case 'f':
                System.out.println("Thank you for using the World Sports Championship management system");
                break;

                //Display information about all the events

                case 'e':
                displayEvents(eventList);
                printMenu();
                break;

                //Display information about all the clients

                case 'c':
                displayClients(clientList);
                printMenu();
                break;

                //Update the stored data when tickets are bought by one of the registered clients

                case 'b':
                try{
                    purchaseTicket(eventList, clientList);
                }
                catch (IOException e){
                    System.out.println("Error! Unable to write letter");
                }
                printMenu();
                break;

                // //Update the stored data when a registered client cancels/returns a ticket(s)

                case 'r':
                cancelTicket(eventList, clientList);
                printMenu();
                break;

                default: System.out.println("Invalid entry, please try again");
            }
        }while (ch != 'f');
    }

    /**
     * A method for printing the menu to the console
     */
    private static void printMenu()
    {
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("=====MENU=====");
        System.out.println("f - Finish running the program");
        System.out.println("e - Display information about all the events");
        System.out.println("c - Display information about all the clients");
        System.out.println("b - Update the stored data when tickets are bought by one of the registered clients");
        System.out.println("r - Update the stored data when a registered client cancels/returns a ticket(s)");
        System.out.println("------------------------------");
        System.out.println("Type a letter and press Enter");
    }

    /**
     * A method for displaying a list of registered events
     */
    private static void displayEvents(SortedArrayList<Event> eventList)
    {
        System.out.println("The details of the events in the World Sports Championship are as follows:");
        System.out.println("===============================================");
        System.out.println("- Event Name ---- Amount of tickets available -");
        System.out.println("===============================================");
        for (Event event : eventList){
            System.out.println(event.getEventName() + " ---- " + event.getTicketsAvailable());   
        }
    }

    /**
     * A method for displaying a list of registered clients
     */
    private static void displayClients(SortedArrayList<Client> clientList)
    {
        System.out.println("The details of the clients in the World Sports Championship are as follows:");
        System.out.println("====================================================");
        System.out.println("- Client Name ---- Event Name ----- No. of Tickets -");
        System.out.println("====================================================");
        for (Client client : clientList){
            System.out.print(client.toString());
            client.printTickets();
            System.out.println(" ");
        }
    }

    /**
     * A method for allowing a registered Client to purchase a ticket
     */
    private static void purchaseTicket(SortedArrayList<Event> eventList, SortedArrayList<Client> clientList) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the client who you would like to purchase tickets for:");
        String scannedClientName = keyboard.nextLine();

        boolean foundClient = false;

        for(Client client : clientList){
            if(scannedClientName.equals(client.toString())){
                foundClient = true;
                System.out.println("Enter the name of the event you wish to purchase tickets for:");
                String scannedEventName = keyboard.nextLine();

                boolean foundEvent = false;

                for (Event event: eventList){
                    if(scannedEventName.equals(event.getEventName())){
                        foundEvent = true;
                        System.out.println("Please specify how many tickets you wish to purchase for this client for this event:");
                        int ticketsRequired = Integer.parseInt(keyboard.nextLine());

                        if(ticketsRequired <= event.getTicketsAvailable()){
                                    if(ticketsPurchased == null){
            System.out.print(" ---- No bookings made");
        }
                            Booking newBooking = new Booking(event.getEventName(), ticketsRequired);
                            client.addBooking(newBooking);
                            System.out.println(ticketsRequired + " tickets for " + event.getEventName() + " have been booked for " + client.toString() + ".");
                            event.setTicketsAvailable(event.getTicketsAvailable() - ticketsRequired);
                        }
                        else{
                            PrintWriter outputFile = new PrintWriter(new FileWriter("H:\\MSc Computer Sciences\\CSC8001\\Interactive System\\output.txt"));
                            outputFile.println("Dear " + client.toString() + ",");
                            outputFile.println("");
                            outputFile.println("Thank you for your recent enquiry regarding tickets for the" + event.getEventName() + " at the World Sports Championship.");
                            outputFile.println("");
                            outputFile.println("Unfortunately there are no longer tickets available for this event, therefore, we have been unable to process your booking on this occassion.");
                            outputFile.println("");
                            outputFile.println("We apologise for any inconvenience this may have caused.");
                            outputFile.println("");
                            outputFile.println("Yours sincerely.");
                            outputFile.println("");
                            outputFile.println("Secretary of the Box Office");
                            outputFile.close();
                        }
                    }
                }
                if (foundEvent == false){
                    System.out.println("Error! You must enter the name of an existing event.");
                }
            }
        } 
        if (foundClient == false){
            System.out.println("Error! You must enter the name of an existing client.");
        }
    }

    /**
     * A method for allowing a registered Client to cancel the booking of a ticket
     */
    private static void cancelTicket(SortedArrayList<Event> eventList, SortedArrayList<Client> clientList)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the client who you would like to cancel tickets for:");
        String scannedClientName = keyboard.nextLine();
        boolean foundClient = false;

        for(Client client : clientList){
            if(scannedClientName.equals(client.toString())){
                foundClient = true;
                System.out.println("Enter the name of the event you wish to cancel tickets for:");
                String scannedEventName = keyboard.nextLine();
                boolean foundEvent = false;

                for (Event event: eventList){
                    if(scannedEventName.equals(event.getEventName())){
                        Booking booking = client.getBooking(event.getEventName());
                        if (booking != null){
                            int ticketsBooked = booking.getNumberOfTicketsPurchased();
                            event.setTicketsAvailable(event.getTicketsAvailable() + ticketsBooked);
                            System.out.println(ticketsBooked + " tickets for " + event.getEventName() + " have been cancelled for " + client.toString() + ".");
                        }
                        else{
                            System.out.println("Error! You must enter a valid booking.");
                        }
                    }
                }
                if (foundEvent == false){
                    System.out.println("Error! You must enter the name of an existing event.");
                }
            }
        }
        if (foundClient == false){
            System.out.println("Error! You must enter the name of an existing client.");
        } 
    }
}

