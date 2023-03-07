package BackUpDataBank;

import java.io.*;
import java.util.Scanner;

public class BankAccount extends IOException {
    int balance;
    int transactionAmount;
    String customerName;
    String customerId;
    String accountType;
    double totalInterest;

    void calculateInterest(double balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Account Type want to open: 1.Saving  2.Current");
        int choiseOfInterest = sc.nextInt();

        if (choiseOfInterest == 1) {
            accountType = "Saving";
            int r = 7;
            int t;
            System.out.println("Enter year to calculate interest: ");
            t = sc.nextInt();

            System.out.println("");
            /*
             * :Interest on a monthly basis = Daily Balance * (Number of days) *Interest /
             * (Days in the year)
             */
            double interest = balance * 30 * (r / 100) / (365 * t);
            totalInterest = interest - balance;
            System.out.println("Total Interest in 1-year: " + totalInterest);
        }
        if (choiseOfInterest == 2) {
            accountType = "Current";
            int r = 6;
            int y;
            System.out.println("Enter year to calculate interest: ");
            y = sc.nextInt();
            /*
             * Here's the simple interest formula: Interest = P x R x T.
             * P = Principal amount (the beginning balance).
             * R = Interest rate (usually per year, expressed as a decimal).
             * T = Number of time periods (generally one-year time periods).
             */
            double interest = balance * r * y;
            totalInterest = interest - balance;
            System.out.println("Total Interest in 1-year: " + totalInterest);
            sc.close();

        }
        System.out.println("<--------------------------------->");
        System.out.println("\n");
        System.out.println("<--------------------------------->");

    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            System.out.println("Balance after deposit: " + balance);
            transactionAmount = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            System.out.println("Balance after withdraw: " + balance);
            transactionAmount = -amount;
        }
    }

    void getTransactionAmount() {
        FileOutputStream out;
        try {
            out = new FileOutputStream("D:\\eclipse-workspace\\BankAplication\\src\\BackUpDataBank//DataSheet.Txt");
            PrintStream ps = new PrintStream(out);

            if (transactionAmount > 0) {
                ps.append("Deposited: " + transactionAmount);
                System.out.println("Deposited: " + transactionAmount);
            } else if (transactionAmount < 0) {
                ps.append("Withdraw" + transactionAmount);
                System.out.println("Withdraw: " + Math.abs(transactionAmount));
            } else {
                System.out.println("No Transaction occurred");
            }
            ps.close();
        } catch (Exception e) {
            System.out.println("Error in date " + e);
        }
    }

    public void showMenu() {

        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome main Page: \n");
        System.out.println("A. Chack Balance");
        System.out.println("B. Deposited Amount");
        System.out.println("C. Withdraw Amount");
        System.out.println("D. Previous transaction");
        System.out.println("E. Calculate Interest");
        System.out.println("F. Exit");

        do {
            System.out.println("*********************************");
            System.out.println("Enter an Options");
            System.out.println("*********************************");
            option = sc.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("<--------------------------------->");
                    System.out.println("Balance = " + balance + "\n");
                    break;

                case 'B':
                    System.out.println("<--------------------------------->");
                    System.out.println("Enter amount to deppsit");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("<--------------------------------->");
                    System.out.println("Enter amount to Withdraw");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("<--------------------------------->");
                    getTransactionAmount();
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("<--------------------------------->");
                    calculateInterest(balance);
                    System.out.println("\n");
                    break;
                case 'F':
                    System.out.println("<--------------------------------->");
                    break;

                default:
                    System.out.println("Invalid Option select! Plese Try Again: ");
                    break;
            }

        } while (option != 'f');
        System.out.println("Thank You for using our sevrices");
        System.out.println("************************************");
        sc.close();

    }
}
