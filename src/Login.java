import java.io.IOException;
import java.util.Scanner;
import CustumerUpdate.OpeningAccount;

public class Login {
    void login() {
        Scanner scc = new Scanner(System.in);
        System.out.println("************************/n");
        System.out.println("Welcome Pelese Fill your Ditals: /");
        System.out.println("--------------------------------------");
        System.out.println("Enter user Id: ");
        String userName1;
        userName1 = scc.nextLine();
        System.out.println("Enter user Password: ");
        String password1;
        password1 = scc.nextLine();
        SignUp sc = new SignUp();

        if (userName1 == sc.getFirstName() && password1 == sc.getPassword()) {
            System.out.println("You Password wrong pelese try again: ");
        }
        System.out.println("Welcome to our potal ");

        try {
            OpeningAccount oa = new OpeningAccount();
            oa.createAcount();
        } catch (IOException e) {
            System.out.println();
        }

    }

}
