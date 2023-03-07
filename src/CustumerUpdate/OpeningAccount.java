package CustumerUpdate;

import java.io.*;
import java.util.Scanner;

import BackUpDataBank.BankAccount;

public class OpeningAccount {

    String user;
    String name;
    String accountType;
    String dob;
    String password;

    public void createAcount() throws IOException {
        FileWriter ride = new FileWriter("D:\\eclipse-workspace\\BankAplication\\src\\NewAcount.txt", true);
        BufferedWriter bufWriet = new BufferedWriter(ride);
        Scanner sc = new Scanner(System.in);
       
        // System.out.println("Enter username: ");
        // sc.nextLine();
        // user = sc.nextLine();
        // bufWriet.write("Name: " + user);
        // bufWriet.newLine();

        System.out.println("Enter Your Name: ");
        sc.nextLine();
        name = sc.nextLine();
        bufWriet.write("Name: " + name);
        bufWriet.newLine();

        System.out.println("Enter Your Date Of Birth: ");
        dob = sc.nextLine();
        bufWriet.write("Date Of Birth: " + dob);
        bufWriet.newLine();

        System.out.println("Enter Your Account Type want to open: 1.Saving  2.Current");
        int choiseType = sc.nextInt();
        if (choiseType == 1) {
            accountType = "Saving";
            bufWriet.write("Account Type: " + accountType);
        }
        if (choiseType == 2) {
            accountType = "Current";
            bufWriet.write("Account Type: " + accountType);
        }

        // System.out.println("Chouse password: ");
        // password = sc.nextLine();
        // bufWriet.write("This is your password" + password);
        // bufWriet.newLine();

        bufWriet.write("Account Number:" + (int) (Math.random() * 1000000000));
        bufWriet.newLine();
        bufWriet.flush();
        bufWriet.close();
        System.out.println("*********************************");
        System.out.println("\n");

        FileReader reader = new FileReader("D:\\eclipse-workspace\\BankAplication\\src\\NewAcount.txt");
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();
        }

        // int userid = 0;
        // do {
        // System.out.println("Login your account ");
        // try {
        // int i = 3;
        // while (i < 0) {
        // System.out.println("Enter Username: ");

        // String username = sc.nextLine();
        // System.out.println("Enter Password: ");
        // String password1 = sc.nextLine();
        // if (user.equals(username) && password.equals(password1)) {
        // System.out.println("User is Successfully login ");
        // } else {
        // System.out.println("Invalid usarname or password try again: ");
        // }
        // i++;
        // }
        // } catch (Exception e) {
        // System.out.println("Try after sum time...");
        // }
        // } while (userid == 1);

        System.out.println("----------------------------------");
        System.out.println("\n");
        System.out.println("********************************");

        BankAccount ba = new BankAccount();
        ba.showMenu();
    }
}
