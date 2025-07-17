package com.example.busbookingpackages;

import java.util.Scanner;
import com.example.busbookingpackages.Data.User;
import com.example.busbookingpackages.Data.Admin;
import com.example.busbookingpackages.Data.Admin.UserData;

public class NewBooking {
    public static void newBooking(String email) {
        Scanner input = new Scanner(System.in);
                boolean userFound = false;

                for (User user : UserData.userData) {
                    if (user.email.equalsIgnoreCase(email)) {
                        userFound = true;
                        System.out.println("\n");
                        System.out.println(
                                "                                        ╔══════════════════════════════════════════════╗");
                        System.out.println(
                                "                                        ║                 New Booking                  ║");
                        System.out.println(
                                "                                        ╚══════════════════════════════════════════════╝\n");

                        System.out.print("                                        Enter your destination route: ");
                        String userRoute = input.nextLine();

                        try {
                            Admin.bookSeat(email, userRoute);
                            System.out.println(
                                    "\n                                        ╔══════════════════════════════════════════════╗");
                            System.out.println(
                                    "                                        ║         Booking Process Complete.            ║");
                            System.out.println(
                                    "                                        ╚══════════════════════════════════════════════╝\n");
                        } catch (Exception e) {
                            System.out.println(
                                    "\n                                        ╔══════════════════════════════════════════════╗");
                            System.out.println("                                        ║      ***** ERROR: " + e.getMessage()
                                    + " *****        ║");
                            System.out.println(
                                    "                                        ╚══════════════════════════════════════════════╝\n");
                        }
                        break;
                    }
                }

                if (!userFound) {
                    System.out.println(
                            "\n                                        ╔══════════════════════════════════════════════╗");
                    System.out.println(
                            "                                        ║   ***** ERROR: User not found. *****         ║");
                    System.out.println(
                            "                                        ╚══════════════════════════════════════════════╝\n");
                }
        }
    }

