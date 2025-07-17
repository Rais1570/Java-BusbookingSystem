
import java.util.*;
import com.example.busbookingpackages.*;

public class Index {

    public static void main(String args[]) {

       
        Scanner input = new Scanner(System.in);{
            while (true) {

                String who = UserOrAdmin.UserorAdmin();
                System.out.println();
                if (who.equals("user")) {

                    System.out.print("                                            Are you an old customer or new ? : ");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("old")) {

                        String email = "none";
                        while (email == "none") {
                            email = LoginPage.loginPage("user");
                            if (email == "none") {
                                System.out.println(
                                        "\n                                               ***** User does not exits *****");

                            }
                        }
                        while (true) {

                            boolean brk = UserPage.userPage(email);

                            if (brk == true)
                                break;
                        }

                    } else if (choice.equalsIgnoreCase("new")) {

                        String email = RegisterPage.registerPage();

                        while (true) {

                            boolean brk1 = UserPage.userPage(email);

                            if (brk1 == true)
                                break;
                        }

                    }

                } else if (who.equals("admin")) {
                    String adminName = LoginPage.loginPage("admin");
                    if (adminName == "none") {
                        System.out.println("                                        ***** Admin does not exits *****");
                        break;
                    }
                    while (true) {
                        boolean Break = AdminPage.adminPage(adminName);
                        if (Break == true) {
                            break;
                        }

                    }

                } else if (who.equals("none")) {

                }

            }
        }
    }
}
