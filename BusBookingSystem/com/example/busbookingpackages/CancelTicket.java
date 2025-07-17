package com.example.busbookingpackages;

import com.example.busbookingpackages.Data.Admin.UserData;
import com.example.busbookingpackages.Data.Admin;
import com.example.busbookingpackages.Data.Bus;
import com.example.busbookingpackages.Data.User;
import java.util.*;

public class CancelTicket {
    public static String cancelTicket(String email){
                Scanner input = new Scanner(System.in);
                    for (User user : UserData.userData) {
                        if (user.email.equalsIgnoreCase(email)) {
                            if (user.bookedBus.isEmpty()) {
                                System.out.println("                             ***** No Ticket Booked *****");
                                return "NoTicketBooked";
                            }
      
                            System.out.println();
                            int i = 1;
                            for (Bus bus : user.bookedBus) {
                                System.out.println("                    " + i + ". Bus Number: " + bus.busNumber + " | Route: "
                                        + bus.route + " | Departure Time: " + bus.depthTime + " | Seats : " + bus.userSeat);
                                i++;
                            }
      
                            System.out.print("\n                                Enter Bus Number to cancel: ");
                            String x = input.nextLine();
                            
                            for (Bus bus : user.bookedBus) {
                                if(bus.busNumber.equalsIgnoreCase(x)){
                                    user.bookedBus.remove(bus);
                                   
                                        for (Bus b : Admin.busData) {
                                            if(b.busNumber.equalsIgnoreCase(x)){
                                            
                                                b.availableSeats+=bus.userSeat;
                                        
                                    }
                                    x="ticket cancel";
                                    break;
                                
                                }
                            }
                           
                            if(x != "ticket cancel"){
                            System.out.println("                           ***** No Ticket Found with the given Bus Number *****");
                            return "NoTicketFound";
                        }else{
                            System.out.println("\n                                ***** Ticket cancel successfully *****");
                            return "ticketCancelSuccessfully";
                        }
                    }
                    System.out.println("\n                ***** User not found. *****\n");
                    return "UserNotFound";
                     
                }
                    

       
          
        
            }
       
            return email;
    }

}