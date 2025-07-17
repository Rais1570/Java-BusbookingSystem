package com.example.busbookingpackages;

import java.util.Scanner;
import com.example.busbookingpackages.Data.Admin.UserData;

public class RegisterPage {

    public static String registerPage() {
        Scanner input = new Scanner(System.in);
            System.out.println("\n");
            System.out
                    .println("                                        ╔═════════════════════════════════════════════════╗");
            System.out
                    .println("                                        ║                User Registration                ║");
            System.out
                    .println("                                        ╚═════════════════════════════════════════════════╝");

            System.out.print("\n                                             Enter Name        : ");
            String name = input.nextLine();

            System.out.print("\n                                             Enter User Name   : ");
            String username = input.nextLine();

            System.out.print("\n                                             Enter E-mail      : ");
            String email = input.nextLine();

            int password1;
            while (true) {
                System.out.print("\n                                            Enter Password    : ");
                password1 = input.nextInt();

                System.out.print("                                            Re-Enter Password : ");
                int password2 = input.nextInt();

                if (password1 == password2) {
                    break;
                } else {
                    System.out.println(
                            "\n                                 ****WARNING: Your passwords do not match. Please try again.***");
                }
            }

            String password = Integer.toString(password1);

            UserData.addUser(name, username, email, password);
            System.out.println("\n                                        ╔═════════════════════════════════════════╗");
            System.out.println("                                        ║         Registration Successfully       ║");
            System.out.println("                                        ╚═════════════════════════════════════════╝\n");

            return email;
        }

    }

