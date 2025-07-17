package com.example.busbookingpackages;

import java.util.Scanner;
import com.example.busbookingpackages.Data.Admin;
import com.example.busbookingpackages.Data.Admin.UserData;

public class LoginPage {

    public static String loginPage(String person) {
        Scanner input = new Scanner(System.in);{
                System.out.println("\n");
                System.out.println("                                        ╔══════════════════════════════════════════════╗");
                System.out.println("                                        ║                 Login Page                   ║");
                System.out
                        .println("                                        ╚══════════════════════════════════════════════╝\n");

                System.out.print("                                            Enter E-mail : ");
                String email = input.nextLine();
                System.out.print("\n                                            Enter Password : ");
                String password = input.nextLine();

                boolean isAuthenticated = false;

                if ("admin".equalsIgnoreCase(person)) {
                    isAuthenticated = Admin.isAdmin(email, password);
                } else if ("user".equalsIgnoreCase(person)) {
                    isAuthenticated = UserData.verifyUser(email, password);
                }

                if (isAuthenticated) {
                    System.out.println(
                            "\n                                        ╔══════════════════════════════════════════════╗");
                    System.out.println(
                            "                                        ║      *****  Login Successful!  *****         ║");
                    System.out.println(
                            "                                        ╚══════════════════════════════════════════════╝\n");
                    return email;
                } else {
                    System.out.println(
                            "\n                                        ╔══════════════════════════════════════════════╗");
                    System.out.println(
                            "                                        ║         *****  Login Failed!  *****          ║");
                    System.out.println(
                            "                                        ╚══════════════════════════════════════════════╝\n");
                    return "none";
                }
        }
    }
}
