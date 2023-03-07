
import java.io.*;
import java.util.Scanner;

public class SignUp {
    private String firstName;
    private String lastName;
    private String emailId;
    private String userName;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void signup() throws IOException {

        String bank;
        String name;
        String lastName;
        String emailId;
        String userName;
        String password;

        FileWriter ride = new FileWriter("D:\\eclipse-workspace\\BankAplication\\src\\SignUp.txt");
        BufferedWriter writer = new BufferedWriter(ride);
        Scanner sc = new Scanner(System.in);

        System.out.println("Create your account: \n");
        System.out.println("In which bank you need a Acount 1.ICICI  2.PNB 3.SBI  4.HDFC ");
        int choiseBank = sc.nextInt();

        if (choiseBank == 1) {
            bank = "ICICI";
            writer.write(bank);
        }
        if (choiseBank == 2) {
            bank = "PNB";
            writer.write(bank);
        }
        if (choiseBank == 3) {
            bank = "SBI";
            writer.write(bank);
        }
        if (choiseBank == 4) {
            bank = "HDFC";
            writer.write(bank);
        }
        writer.newLine();

        System.out.println("Enter Your FirstName: ");
        sc.nextLine();
        name = sc.nextLine();
        writer.write(name + " ");
        System.out.println("********************************* ");

        System.out.println("Enter Your LastName: ");
        lastName = sc.nextLine();
        writer.write(lastName);
        System.out.println("********************************* ");
        writer.newLine();

        System.out.println("Enter Your EmailId: ");
        emailId = sc.nextLine();
        writer.write(emailId);
        System.out.println("********************************* ");
        writer.newLine();

        System.out.println("Enter Your Username: ");
        userName = sc.nextLine();
        writer.write(userName);
        System.out.println("********************************* ");
        writer.newLine();

        System.out.println("Enter Your Password: ");
        password = sc.nextLine();
        writer.write(password);
        System.out.println("********************************* ");
        writer.newLine();

        FileReader read = new FileReader("D:\\eclipse-workspace\\BankAplication\\src\\SignUp.txt");
        BufferedReader reader = new BufferedReader(read);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }

        System.out.println("********************************* ");
        System.out.println("\n");
        System.out.println("Your Id Is creat: Now Login ");
        System.out.println("Do you want to login your account: Yes and No");
        String update = sc.nextLine();
        if (update.equals("Yes")) {
            Login login = new Login();
            login.login();
        }
    }
}
