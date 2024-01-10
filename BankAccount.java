import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private String name;
    private String type;

    public int getAccountNumber() {
        return accountNumber;
    }

    private int accountNumber;
    private int balance;
    Scanner scanner = new Scanner(System.in);

    BankAccount(){
        getinput();
    }

    void getinput(){
        System.out.print("Enter the name of the account: ");
        this.name = scanner.nextLine();
        System.out.print("Enter the type of the account: ");
        this.type = scanner.nextLine();
        this.accountNumber = accountGenerator();
        deposit();
        display();
        System.out.println("Account Successfully Created");
    }

    public int accountGenerator(){
        Random random = new Random();
        return random.nextInt(1000, 9999);
    }

    public void deposit(){
        System.out.print("Enter the amount to deposit: ");
        int amount = scanner.nextInt();
        this.balance = amount + this.balance;
    }

    public void deposit(int amount){
        this.balance = amount + this.balance;
    }

    public void display(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Name   : " + name);
        System.out.println("Account balance: " + balance);
        System.out.println("Account type   : " + type);
    }

    public String list(){
        return (type + "   " + name + " " + balance);
    }
}
