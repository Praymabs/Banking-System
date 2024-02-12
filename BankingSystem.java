package bankingsystem;

import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        
        BankAccount obj1 = new BankAccount ("Prayma Bishshash","201-15-3168","01783658825");
        obj1.showMenu();
    }
    
}
class BankAccount
{
    int balance;
    int previousTransaction;
    String acc_name;
    String  acc_id;
    String acc_phone;
    
    BankAccount(String accname, String accid, String accphn)
    {
        acc_name = accname;
         acc_id = accid;
        acc_phone = accphn;
    }
    void deposit(int amout)
    {
        if (amout !=0)
        {
            int amount = 0;
            balance =+ amount;
            previousTransaction = amount;           
        }
    }
    void withdraw(int amount)
    {
        if (amount != 0)
        {
        balance -= amount;
        previousTransaction = -amount;
        }
    }
    void getPreviousTransaction()
    {
    if (previousTransaction > 0 )
    {
    System.out.println("Deposit : "+previousTransaction);
    }
    else if(previousTransaction < 0)
    {
        System.out.println("Withdrawn : "+Math.abs(previousTransaction));
    }
    else
    {
        System.out.println("No Transaction occoured");
    }
    }
    
    void showMenu()
    {   
        char options = '\0';
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome "+acc_name);
        System.out.println("Your ID is "+ acc_id);
        System.out.println("Your Phone Number is "+acc_phone);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transcations");
        System.out.println("E. Exit");
        char option;

        
        do
        {
            System.out.println("----------------------");
            System.out.println("Enter an option");
            System.out.println("----------------------");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
            
            switch(option)
                    {
                case 'A':
            System.out.println("*********************");
            System.out.println("Balance = "+balance);
            System.out.println("*********************");
            System.out.println("\n");
            break;
            
            
            case 'B':
            System.out.println("*********************");
            System.out.println("Enter an amount to deposit");
            System.out.println("*********************");
            int amount = scanner.nextInt();
            deposit(amount);
            System.out.println("\n");
            break;
                    
            
            case 'C':
            System.out.println("----------------------");
            System.out.println("Enter an amount to withdraw");
            System.out.println("----------------------");
            int amount2 = scanner.nextInt();
            withdraw(amount2);
            System.out.println("\n");
            break;
            
            case 'D':
            System.out.println("----------------------");
            getPreviousTransaction();
            System.out.println("----------------------");
            System.out.println("\n");
            break;
            
            case 'E':
                System.out.println("Exit");
                break;
            
            default :
                System.out.println("Invalid Option!!");
                System.out.println("Please Enter Again");
                break;
        }
    }
        while (option != 'E');
        System.out.println("Thanks for Using Our Service");
    }
}