# Bus Booking System

A Java-based console application for bus ticket booking and management system.

## Features

- User Management
  - New user registration
  - Existing user login
  - Admin login functionality

- User Operations
  - Book new bus tickets
  - View booking history
  - Cancel tickets
  - Manage user profile

- Admin Operations
  - Manage bus routes
  - View bookings
  - System administration

## Project Structure

```
BusBookingSystem/
├── Index.java
└── com/
    └── example/
        └── busbookingpackages/
            ├── AdminPage.java
            ├── CancelTicket.java
            ├── Data.java
            ├── LoginPage.java
            ├── MyBooking.java
            ├── NewBooking.java
            ├── RegisterPage.java
            ├── UserOrAdmin.java
            └── UserPage.java
```

## How to Run

1. Make sure you have Java installed on your system
2. Clone this repository
3. Navigate to the project directory
4. Compile the Java files:
   ```
   javac Index.java
   ```
5. Run the application:
   ```
   java Index
   ```

## Usage

1. Start the application
2. Choose between User or Admin login
3. For new users:
   - Select "new" when prompted
   - Complete the registration process
4. For existing users:
   - Select "old" when prompted
   - Login with your credentials
5. Follow the on-screen instructions for booking, cancellation, or viewing tickets

## Technologies Used

- Java
- Object-Oriented Programming
- File Handling for Data Storage

## Author

- Raish Mansuri (23DCE067)
