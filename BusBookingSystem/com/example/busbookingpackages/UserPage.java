package com.example.busbookingpackages;

import java.util.Scanner;

import com.example.busbookingpackages.Data.Admin.UserData;

public class UserPage {

    public static boolean userPage(String email) {
        Scanner input = new Scanner(System.in);{
                System.out.println("\n\n\n\n\n");
                System.out.println(
                        "═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
                System.out
                        .println("                                                        Welcome, " + UserData.getName(email));
                System.out.println(
                        "═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════\n");

                System.out.println(
                        "          ╔════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                System.out.println(
                        "          ║                                      Please select an option                                       ║");
                System.out.println(
                        "          ╚════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                System.out.println(
                        "          ║    1. New Booking                                                                                  ║");
                System.out.println(
                        "          ║    2. My Booking                                                                                   ║");
                System.out.println(
                        "          ║    3. Cancel Ticket                                                                                ║");
System.out.println(
                        "          ║    4. Show My Detail                                                                               ║");
                System.out.println(
                        "          ║    5. Exit                                                                                         ║");
                System.out.println(
                        "          ╚════════════════════════════════════════════════════════════════════════════════════════════════════╝");

                System.out.print("\n                                          Enter your choice: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        NewBooking.newBooking(email);
                        break;
                    case 2:
                        MyBooking.myBooking(email);
                        break;
                    case 3:
                        CancelTicket.cancelTicket(email);
                        break;
                    case 4:
                         UserData.showMyDetail(email);
                         break;
                      
                    case 5:
                        return true; 
                      
                   
                    default:
                        System.out.println(
                                "\n                             ╔══════════════════════════════════════════════════════════════════════╗");
                        System.out.println(
                                "                             ║  ***** Invalid choice. Please enter a number between 1 and 6. ****   ║");
                        System.out.println(
                                "                             ╚══════════════════════════════════════════════════════════════════════╝\n");
                }
        }

        return false;
    }
}
