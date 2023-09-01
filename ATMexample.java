package stmpac;
import java.util.*;
public class ATMExample {
   public static void main(String args[] ) {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your account number:");
      String acc_no=sc.next();
      System.out.println("Enter Account Holder Name");
      String accusername = sc.next();
      System.out.println("Enter Pin Number");
      String pin_no=sc.next();
      int atm_balance = 500000, balance = 100000, withdraw;
      if(acc_no.length()==3&&accusername.length()<=10&&pin_no.length()==4){
      while(true){  
            System.out.println("\nATM\n");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Check Balance");
            System.out.println("Choose 3 for Check ATM Balance");
            System.out.println("Choose 4 for Deposit");
            System.out.println("Choose 5 for creating savings account");
            System.out.println("Choose 6 for Money Transfer");
            System.out.println("Choose 7 for EXIT"); 
            System.out.print("Choose the operation you want to perform!!");  
            int choice = sc.nextInt();  
            switch(choice){  
               case 1:  
                 System.out.print("Enter money to be withdrawn!!:");  
                 withdraw = sc.nextInt();  
                 if(balance >= withdraw&&atm_balance >= withdraw){  
                    balance = balance - withdraw;  
                    atm_balance = atm_balance - withdraw;
                    System.out.println("Please collect your money!!");  
                 }  
                 else{  
                    System.out.println("Insufficient Balance!!");  
                 }  
                 System.out.println("");  
                 break;  
              case 2:    
                System.out.println("Balance : "+balance);  
                System.out.println("");  
                break;  
              case 3:    
                System.out.println("ATM Balance : "+atm_balance);  
                System.out.println("");  
                break;
               case 4:  
                 System.out.print("Enter money to be deposited:");  
                 int deposit = sc.nextInt();  
                 balance = balance + deposit;  
                 System.out.println("Your Money has been successfully depsited");  
                 System.out.println("");  
                 break;  
              case 5:
                 System.out.println("Enter the New Account Number : ");
                 String accountNumber=sc.nextLine();
                 System.out.println("Enter the Customer Name : ");
                 String customerName=sc.nextLine();
                 System.out.println("Enter the New Pin Number : ");
                 String pinNumber=sc.nextLine();
                 System.out.println("Enter the Amount to Deposit : ");
                 int accountBalance=sc.nextInt();
                 if(accountBalance>=500){
                    System.out.println("Savings Account Created");
                 }
                 else{
                    System.out.println("Minimum Balance Must be 500 or above"); 
                 }
                 break;
              case 6:
                System.out.println("Enter the Account Number : ");
                String fromAccountNumber=sc.next();
                System.out.println("Enter the Pin Number : ");
                String fromPinNumber=sc.next();
                System.out.println("Enter the Account Number to make Transfer : ");
                String toAccountNumber=sc.next();
                System.out.println("Enter the Amount to Transfer : ");
                int transferAmount=sc.nextInt();
                if(transferAmount>0){
                  System.out.println("Amount Transferred!!");
                }
                else{
                  System.out.println("Invalid");
                }
                break;
                case 7:
                System.out.println("Terminated!!");
                System.exit(0);
                break;
                default:
                System.out.println("Please Enter valid option...");   
            }
        }
        }
        else{
        System.out.println("Invalid account number or Account Holder Name or Pin Number!!");
        }
    } 
}
