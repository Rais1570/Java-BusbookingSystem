package com.example.busbookingpackages;

import java.util.*;

public class UserOrAdmin {

    public static String UserorAdmin() {
        Scanner input = new Scanner(System.in);
            System.out.println(
                    "\n\n\n═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
            System.out.println("                                                           Welcome to the         ");
            System.out.println("                                                        Bus Booking System!       ");
            System.out.println(
                    "═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");

            System.out.println();
            System.out.println("\n                                                  ╔════════════════════════════╗");
            System.out.println("                                                  ║    1. USER    2. ADMIM     ║");
            System.out.println("                                                  ╚════════════════════════════╝");
            System.out.println();
            System.out.print("                                                  Please select an option : ");
            int answer = input.nextInt();

            if (answer == 1) {
                return "user";
            } else if (answer == 2) {
                return "admin";
            } else {
                return "none";
            }
        }
    }
    

