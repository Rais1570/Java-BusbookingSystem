package com.example.busbookingpackages;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Scanner;

import com.example.busbookingpackages.Data.Admin;

public class AdminPage {

    public static boolean adminPage(String name) {
        Scanner input = new Scanner(System.in);
                System.out.println("\n");
                System.out.println("                                        ╔══════════════════════════════════════════════╗");
                System.out.println(
                        "                                                    Welcome, " + Admin.getAdminName() + "!        ");
                System.out
                        .println("                                        ╚══════════════════════════════════════════════╝\n");

                System.out.println(
                        "                            ╔═══════════════════════════════════════════════════════════════════╗");
                System.out.println(
                        "                            ║                        Please select an option                    ║");
                System.out.println(
                        "                            ╚═══════════════════════════════════════════════════════════════════╝");
                System.out.println(
                        "                            ║    1. View All Your Buses                                         ║");
                System.out.println(
                        "                            ║    2. Add a New Bus                                               ║");
                System.out.println(
                        "                            ║    3. Edit a Bus                                                  ║");
                System.out.println(
                        "                            ║    4. Exit                                                        ║");
                System.out.println(
                        "                            ╚═══════════════════════════════════════════════════════════════════╝");

                System.out.print("\n                                          Enter your choice: ");
                int choice1 = input.nextInt();
                input.nextLine(); // Consume the newline character

                switch (choice1) {
                    case 1:
                        Admin.viewAllYourBus();
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println(
                                "                                        ╔══════════════════════════════════════════════╗");
                        System.out.println(
                                "                                        ║                 Add a New Bus                ║");
                        System.out.println(
                                "                                        ╚══════════════════════════════════════════════╝\n");

                        System.out.print("                                                Enter Bus Number: ");
                        String busNumber = input.nextLine();

                        System.out.print("                                                Enter Bus Route: ");
                        String busRoute = input.nextLine();

                        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

                        System.out.print("                                                Enter Departure Time (HH:mm): ");
                        String timeInput = input.nextLine();

                        LocalTime busTime = LocalTime.parse(timeInput, timeFormatter);
                        Admin.addBus(busNumber, busRoute, busTime);

                        break;
                    case 3:
                        System.out.println("\n\n");
                        System.out.println(
                                "                                        ╔══════════════════════════════════════════════╗");
                        System.out.println(
                                "                                        ║                   Edit a Bus                 ║");
                        System.out.println(
                                "                                        ╚══════════════════════════════════════════════╝\n");

                        System.out.print("                                              Enter Bus Number to Edit: ");
                        String busNumberToEdit = input.nextLine();

                        Admin.editBus(busNumberToEdit);
                        break;
                    case 4:
                        System.out.println("\n");
                        System.out.println(
                                "                                        ╔══════════════════════════════════════════════╗");
                        System.out.println(
                                "                                        ║               Exiting Admin Page             ║");
                        System.out.println(
                                "                                        ╚══════════════════════════════════════════════╝\n");
                        return true;
                    default:
                        System.out.println(
                                "\n                                        ╔══════════════════════════════════════════════╗");
                        System.out.println(
                                "                                        ║            Invalid choice. Please try again. ║");
                        System.out.println(
                                "                                        ╚══════════════════════════════════════════════╝");
                        break;
                }
                return false;
        }
       
  }
    
