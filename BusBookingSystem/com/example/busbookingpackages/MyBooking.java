package com.example.busbookingpackages;

import com.example.busbookingpackages.Data.Admin.UserData;

public class MyBooking {
    public static void myBooking(String email) {
        System.out.println("\n");
        System.out.println("                                  ╔══════════════════════════════════════════════╗");
        System.out.println("                                  ║               My Bookings                    ║");
        System.out.println("                                  ╚══════════════════════════════════════════════╝\n");

        boolean hasBookings = UserData.showMyTickets(email);

        if (!hasBookings) {
            System.out.println("                                             ** No bookings found. **          ");
        }

        System.out.println("\n                                  ╔══════════════════════════════════════════════╗");
        System.out.println("                                  ║         End of Booking Details.              ║");
        System.out.println("                                  ╚══════════════════════════════════════════════╝");
    }
}
