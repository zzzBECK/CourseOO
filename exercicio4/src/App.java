import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter account data");
            
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter the amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error!");
        }
        finally{
            sc.close();
        }
    }
}
