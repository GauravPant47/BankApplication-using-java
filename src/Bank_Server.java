import java.io.*;
import java.util.Scanner;

import BackUpDataBank.BankAccount;

public class Bank_Server {

    public static void main(String[] args) throws IOException {
        /*
         * You have to set the path of the file before running the code.
         * File with path is in OpeningAccount and BankAccount
         */

        System.out.println("********Wellcome All Bank System********\n");
        System.out.println("Do You Want to Open Account: Yes and No");

        Scanner sc = new Scanner(System.in);
        String update = sc.nextLine();
        update = update.toLowerCase();
        if (update.equals("yes")) {
            SignUp sign = new SignUp();
            sign.signup();

        }

        if (update.equals("no")) {
            BankAccount acc = new BankAccount();
            acc.showMenu();

        }
    }
}