package com.example.busbookingpackages;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Data {
    static Scanner input = new Scanner(System.in);

    public static class Bus {
        String busNumber;
        int availableSeats = 40;
        String route;
        LocalTime depthTime;
        int userSeat;

        public Bus(String busNumber, String route, LocalTime depthTime) {
            this.busNumber = busNumber;
            this.route = route;
            this.depthTime = depthTime;
        }
        public Bus(String busNumber, String route, LocalTime depthTime, int seat) {
            this.busNumber = busNumber;
            this.route = route;
            this.depthTime = depthTime;
            this.userSeat = seat;
        }
    }

    public static class User {
        protected String name;
        protected String userName;
        protected String email;
        protected String password;
        protected List<Bus> bookedBus = new ArrayList<>();

        public User(String name, String userName, String email, String password) {
            this.name = name;
            this.userName = userName;
            this.email = email;
            this.password = password;
        }

    }

    public static class Admin {
        static User admin = new User("Jenil Navapara", "Tapovan Traveller", "23dce071@gmail.com", "050106");
        static List<Bus> busData = new ArrayList<>();

        public static String getAdminName() {
            return admin.name;
        }

//   A static block in Java is a special block of code that gets executed exactly once when the class is first loaded into memory. 
//  It's often used for : 
//  Initialization of static variables: Static variables are variables that belong to the class itself, not to individual objects. The static block can be used to initialize these variables with specific values.
//  Class-level setup: You can perform any necessary setup tasks for the class within the static block, such as initializing resources, connecting to databases, or registering listeners.
//        
         static {
           
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            // MODASA-NADIAD Route
            busData.add(new Bus("GJ-14 1563", "MODASA-NADIAD", LocalTime.parse("06:15", timeFormatter)));
            busData.add(new Bus("GJ-14 2345", "MODASA-NADIAD", LocalTime.parse("12:00", timeFormatter)));
            busData.add(new Bus("GJ-14 8765", "MODASA-NADIAD", LocalTime.parse("18:15", timeFormatter)));

            // AHMEDABAD-BARODA Route
            busData.add(new Bus("GJ-05 8421", "AHMEDABAD-BARODA", LocalTime.parse("07:30", timeFormatter)));
            busData.add(new Bus("GJ-05 6543", "AHMEDABAD-BARODA", LocalTime.parse("11:45", timeFormatter)));
            busData.add(new Bus("GJ-05 7890", "AHMEDABAD-BARODA", LocalTime.parse("20:00", timeFormatter)));

            // PUNE-MUMBAI Route
            busData.add(new Bus("MH-12 9999", "PUNE-MUMBAI", LocalTime.parse("05:30", timeFormatter)));
            busData.add(new Bus("MH-12 1111", "PUNE-MUMBAI", LocalTime.parse("10:45", timeFormatter)));
            busData.add(new Bus("MH-12 4321", "PUNE-MUMBAI", LocalTime.parse("19:00", timeFormatter)));

            // JAIPUR-JODHPUR Route
            busData.add(new Bus("RJ-27 6543", "JAIPUR-JODHPUR", LocalTime.parse("08:00", timeFormatter)));
            busData.add(new Bus("RJ-27 9876", "JAIPUR-JODHPUR", LocalTime.parse("15:00", timeFormatter)));
            busData.add(new Bus("RJ-27 3456", "JAIPUR-JODHPUR", LocalTime.parse("21:30", timeFormatter)));

            // LUCKNOW-KANPUR Route
            busData.add(new Bus("UP-32 7684", "LUCKNOW-KANPUR", LocalTime.parse("06:30", timeFormatter)));
            busData.add(new Bus("UP-32 5432", "LUCKNOW-KANPUR", LocalTime.parse("08:00", timeFormatter)));
            busData.add(new Bus("UP-32 9987", "LUCKNOW-KANPUR", LocalTime.parse("17:00", timeFormatter)));

            // DELHI-AGRA Route
            busData.add(new Bus("DL-1P 3245", "DELHI-AGRA", LocalTime.parse("05:00", timeFormatter)));
            busData.add(new Bus("DL-1P 6789", "DELHI-AGRA", LocalTime.parse("14:20", timeFormatter)));
            busData.add(new Bus("DL-1P 4567", "DELHI-AGRA", LocalTime.parse("20:45", timeFormatter)));

            // BANGALORE-MYSORE Route
            busData.add(new Bus("KA-03 1234", "BANGALORE-MYSORE", LocalTime.parse("06:00", timeFormatter)));
            busData.add(new Bus("KA-03 8765", "BANGALORE-MYSORE", LocalTime.parse("12:30", timeFormatter)));
            busData.add(new Bus("KA-03 2345", "BANGALORE-MYSORE", LocalTime.parse("18:45", timeFormatter)));

            // CHENNAI-MADURAI Route
            busData.add(new Bus("TN-09 8765", "CHENNAI-MADURAI", LocalTime.parse("05:45", timeFormatter)));
            busData.add(new Bus("TN-09 3456", "CHENNAI-MADURAI", LocalTime.parse("13:00", timeFormatter)));
            busData.add(new Bus("TN-09 6789", "CHENNAI-MADURAI", LocalTime.parse("20:15", timeFormatter)));

            // SURAT-RAJKOT Route
            busData.add(new Bus("GJ-18 3456", "SURAT-RAJKOT", LocalTime.parse("07:00", timeFormatter)));
            busData.add(new Bus("GJ-18 7890", "SURAT-RAJKOT", LocalTime.parse("16:10", timeFormatter)));
            busData.add(new Bus("GJ-18 1234", "SURAT-RAJKOT", LocalTime.parse("23:30", timeFormatter)));

            // HYDERABAD-VIJAYAWADA Route
            busData.add(new Bus("AP-07 1122", "HYDERABAD-VIJAYAWADA", LocalTime.parse("08:15", timeFormatter)));
            busData.add(new Bus("AP-07 3344", "HYDERABAD-VIJAYAWADA", LocalTime.parse("14:45", timeFormatter)));
            busData.add(new Bus("AP-07 5566", "HYDERABAD-VIJAYAWADA", LocalTime.parse("19:25", timeFormatter)));
        }

        public static boolean isAdmin(String email, String password) {
            return admin.email.equalsIgnoreCase(email) && admin.password.equals(password);
        }

        public static void addBus(String busNumber, String route, LocalTime depthTime) {
            Bus newBus = new Bus(busNumber, route, depthTime);
            busData.add(newBus);
            System.out
                    .println("\n                                                 ***** Bus added successfully! ******");
        }

        public static void editBus(String busNumber) {
            for (Bus bus : busData) {
                if (bus.busNumber.equals(busNumber)) {
                    System.out.println("\n");
                    System.out.println(
                            "                                        ╔══════════════════════════════════════════════╗");
                    System.out.println(
                            "                                        ║           Editing Bus Information            ║");
                    System.out.println(
                            "                                        ╚══════════════════════════════════════════════╝");
                    System.out.println("                                        Bus Number     : " + bus.busNumber);
                    System.out
                            .println("                                        Available Seats: " + bus.availableSeats);
                    System.out.println("                                        Route          : " + bus.route);
                    System.out.println("                                        Departure Time : " + bus.depthTime);
                    System.out.println(
                            "                                        ================================================");

                    while (true) {
                        System.out.println("\n                                        1. Change Route");
                        System.out.println("                                        2. Change Time");
                        System.out.println("                                        3. Change Available Seats");
                        System.out.println("                                        4. Exit");
                        System.out.print("                                        Enter your choice: ");
                        int choice = input.nextInt();
                        input.nextLine(); // Consume newline

                        if (choice == 1) {
                            System.out.print("                                        Enter new route: ");
                            String newRoute = input.nextLine();
                            bus.route = newRoute;
                            System.out.println("\n                                        Updated Bus Information:");
                            System.out.println(
                                    "                                        Bus Number     : " + bus.busNumber);
                            System.out.println(
                                    "                                        Available Seats: " + bus.availableSeats);
                            System.out.println("                                        Route          : " + bus.route);
                            System.out.println(
                                    "                                        Departure Time : " + bus.depthTime);

                        } else if (choice == 2) {
                            System.out.print("                                        Enter new time (HH:mm): ");
                            String timeInput = input.nextLine();
                            LocalTime newTime = LocalTime.parse(timeInput, DateTimeFormatter.ofPattern("HH:mm"));
                            bus.depthTime = newTime;
                            System.out.println("\n                                        Updated Bus Information:");
                            System.out.println(
                                    "                                        Bus Number     : " + bus.busNumber);
                            System.out.println(
                                    "                                        Available Seats: " + bus.availableSeats);
                            System.out.println("                                        Route          : " + bus.route);
                            System.out.println(
                                    "                                        Departure Time : " + bus.depthTime);

                        } else if (choice == 3) {
                            System.out.print("                                        Enter new Available Seats: ");
                            int seat = input.nextInt();
                            bus.availableSeats = seat;
                            System.out.println("\n                                        Updated Bus Information:");
                            System.out.println(
                                    "                                        Bus Number     : " + bus.busNumber);
                            System.out.println(
                                    "                                        Available Seats: " + bus.availableSeats);
                            System.out.println("                                        Route          : " + bus.route);
                            System.out.println(
                                    "                                        Departure Time : " + bus.depthTime);

                        } else if (choice == 4) {
                            System.out.println("\n                                        Exiting...");
                            break;
                        } else {
                            System.out.println(
                                    "\n                                        ***** Invalid choice. Please try again. *****");
                        }
                    }
                    return;
                }
            }
            System.out.println("\n                                        ***** Bus not found. *****\n");
        }

        public static void viewAllYourBus() {
            System.out.println("\n");
            System.out.println(
                    "                                        ╔══════════════════════════════════════════════╗");
            System.out.println(
                    "                                        ║              All Available Buses             ║");
            System.out.println(
                    "                                        ╚══════════════════════════════════════════════╝\n");
            int i = 1;
            for (Bus bus : busData) {
                System.out.println("         " + i + ". Bus Number: " + bus.busNumber + " | Available Seats: "
                        + bus.availableSeats + " | Route: " + bus.route + " | Departure Time: " + bus.depthTime);
                i++;
            }
        }

        public static void bookSeat(String email, String userRoute) {
            boolean routeFound = false;

            System.out
                    .println("\n                                            *****  Available Buses for Route *****\n");

            for (Bus bus : busData) {
                if (bus.route.equalsIgnoreCase(userRoute)) {
                    routeFound = true;
                    System.out.println("    Route   : " + bus.route + " | Departure Time: " + bus.depthTime
                            + " | Available Seats: " + bus.availableSeats);
                }
            }

            if (!routeFound) {
                System.out.println(
                        "\n                             ***** No buses available for the specified route. *****");
                return;
            }

            System.out.print("\n    Enter the time of bus you want to book (HH:mm): ");
            String timeInput = input.next();

            if (timeInput.isEmpty()) {
                System.out.println(
                        "                             ***** Invalid input. Please enter a valid time in HH:mm format. *****");
                return;
            }

            LocalTime newTime = LocalTime.parse(timeInput, DateTimeFormatter.ofPattern("HH:mm"));

            boolean busFound = false;
            for (Bus bus : busData) {
                if (bus.route.equalsIgnoreCase(userRoute) && bus.depthTime.equals(newTime)) {
                    busFound = true;
                    System.out.println("\n    Route  : " + bus.route + " | Departure Time: " + bus.depthTime
                            + " | Available Seats: " + bus.availableSeats);

                    if (bus.availableSeats <= 0) {
                        System.out.println(
                                "                                               ***** No available seats on this bus. *****");
                    } else {
                        System.out.print("\n    Number of seats: ");
                        int seats = input.nextInt();
                        System.out.print("\n    Confirm Booking (yes or no): ");
                        String choice = input.next();
                        if (choice.equalsIgnoreCase("yes")) {
                            bus.availableSeats -= seats;

                            System.out.println(
                                    "\n                                           ***** Ticket booked successfully! ******");
                            for (User user : UserData.userData) {
                                if (user.email.equalsIgnoreCase(email)) {
                                    bus.userSeat = seats;
                                    user.bookedBus.add(bus);
                                }
                            }
                        } else {
                            System.out.println(
                                    "                                            ***** Booking unsuccessfull. *****");
                        }
                    }
                    return;
                }
            }

            if (!busFound) {
                System.out.println(
                        "\n                                   ***** No bus found with the specified time. *****");
            }
        }

        public abstract static class UserData {
            public static List<User> userData = new ArrayList<>();

            static {
                User user = new User("Nitya", "nitya12", "nitya@gmail.com", "050106");
                userData.add(user);
                User user2 = new User("Rais", "nitya12", "rais@gmail.com", "050106");
                userData.add(user2);
            }

            public static void addUser(String name, String userName, String email, String password) {
                User newUser = new User(name, userName, email, password);
                userData.add(newUser);
            }

            public static String getName(String email) {
                for (User user : userData) {
                    if (user.email.equalsIgnoreCase(email)) {
                        return user.name;
                    }
                }
                return "none";
            }

            public static void showMyDetail(String email) {
                for (User user : userData) {
                    if (user.email.equalsIgnoreCase(email)) {
                        System.out.println("\n");
                        System.out.println(
                                "                                        ╔══════════════════════════════════════════════╗");
                        System.out.println(
                                "                                        ║                  User Details                ║");
                        System.out.println(
                                "                                        ╚══════════════════════════════════════════════╝\n");
                        System.out.println(
                                "                                                    Name      : " + user.name);
                        System.out.println(
                                "                                                    Username  : " + user.userName);
                        System.out.println(
                                "                                                    E-mail    : " + user.email);
                        System.out.println(
                                "                                                    Password  : " + user.password);
                        System.out.println("\n\n");
                    }
                }
            }

            public static boolean verifyUser(String email, String password) {
                for (User user : userData) {
                    if (user.email.equalsIgnoreCase(email) && user.password.equals(password)) {
                        return true;
                    }
                }
                return false;
            }

            public static void bookTicket(String email) {
                for (User user : userData) {
                    if (user.email.equalsIgnoreCase(email)) {
                        System.out.print("\n      Enter your destination route: ");
                        String userRoute = input.next();
                        try {
                            Admin.bookSeat(email, userRoute);
                            System.out.println("\n                   *****  Ticket booked successfully. *****\n");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        return;
                    }
                }
                System.out.println("\n                ***** User not found. *****\n");
            }
            public static String cancelTicket(String email) {
                for (User user : UserData.userData) {
                    if (user.email.equalsIgnoreCase(email)) {
                        if (user.bookedBus.isEmpty()) {
                            System.out.println("                             ***** No Ticket Booked *****");
                            return "NoTicketBooked";
                        }
            
                        System.out.println();
                        int i = 1;
                        for (Bus bus : user.bookedBus) {
                            System.out.println("                   LLLL " + i + ". Bus Number: " + bus.busNumber + " | Route: "
                                    + bus.route + " | Departure Time: " + bus.depthTime + " | Seats : " + bus.userSeat);
                            i++;
                        }
            
                        // System.out.print("\n                Enter Bus Number to cancel: ");
                        String x = "GJ-14 2345";
                        for (Bus bus : user.bookedBus) {
                            if (bus != null && bus.busNumber != null && bus.busNumber.equalsIgnoreCase(x)) {
                                user.bookedBus.remove(bus);
                                break; // Exit the loop after the first match
                            }
                        }
                       
            
                        System.out.println("                           ***** No Ticket Found with the given Bus Number *****");
                        return "NoTicketFound";
                    }
                }
            
                System.out.println("\n                ***** User not found. *****\n");
                return "UserNotFound";
            }
            

            public static boolean showMyTickets(String email) {
                for (User user : userData) {
                    if (user.email.equalsIgnoreCase(email)) {
                        if (user.bookedBus.isEmpty()) {
                            return false;
                        }

                        System.out.println();
                        int i = 1;
                        for (Bus bus : user.bookedBus) {
                            System.out.println("         " + i + ". Bus Number: " + bus.busNumber + " | Route: "
                                    + bus.route + " | Departure Time: " + bus.depthTime + " | Seats : " + bus.userSeat);
                            i++;
                        }
                        return true;
                    }
                }
                return false;
            }

            public static List<User> getUserData() {
                return userData;
            }
        }
    }
}
