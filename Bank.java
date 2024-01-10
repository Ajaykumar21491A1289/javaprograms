import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    public static int count = 1;
    HashMap<Integer, BankAccount> list = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Bank(){
        while (true){
            menu();
        }
    }

    public void menu(){
        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. Display Account");
        System.out.println("4. Transfer Amount");
        System.out.println("5. List All Acounts");
        System.out.print("Enter the selection: ");
        int selection = scanner.nextInt();
        if (selection == 1){
            BankAccount b1 = new BankAccount();
            list.put(b1.getAccountNumber(), b1);
        }

        if (selection == 2){
            System.out.print("Enter the Account Number: ");
            int num = scanner.nextInt();
            list.remove(num);
        }

        if (selection == 3){
            System.out.print("Enter the account Number: ");
            int disp = scanner.nextInt();
            BankAccount obj = list.get(disp);
            obj.display();


        }

        if (selection == 4){
            transfer();
        }
        if (selection == 5){
            for (HashMap.Entry<Integer, BankAccount> entry : list.entrySet()) {
                Integer key = entry.getKey();
                BankAccount value = entry.getValue();
                String data = value.list();
                System.out.println("Key: " + key + ", Value: " + data);
            }
        }
    }

    public void transfer(){
        System.out.print("Enter senders Account number: ");
        int send = scanner.nextInt();
        System.out.print("Enter Recivers Account number: ");
        int receive = scanner.nextInt();
        System.out.println("Amount to be transfered");
        int amount = scanner.nextInt();
        BankAccount s = list.get(send);
        BankAccount r = list.get(receive);
        s.deposit(~(amount - 1));
        r.deposit(amount);
    }
}
