import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("$"+amount+" deposited successfully and your current balance is:$"+balance);
        }
        else
        {
            System.out.println("Please enter valid amount");
        }
    }
    public void withdrawl(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Successfully withdrawn $"+amount+" current balance is:$"+balance);
        }
        else if(amount>balance){
            System.out.println("Insufficient Bank Balance");
        }
        else{
            System.out.println("Please enter valid amount");
        }
    }
}
class ATM {
    private BankAccount account;
    private Scanner scanner;
    
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        boolean exit = false;
        
        while (!exit) {
            System.out.println(" ------------Welcome to ATM-----------");
            System.out.println("Select an option to continue our sevices");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawl amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawl(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}


public class ATMInterface {
     public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}

