
package atmmachine;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Sara Yosephina
 */
public class ATMMachine {
    
    public static void checkBalance(){
        System.out.println("your Current Balance is: " + BalanceInquiry.getBalance());
    }
    
    public static void withdrawMoney(){
        if(BalanceInquiry.balance == 0){
            System.out.println("Your Current Balance is ZERO");
            System.out.println("You cannot Withdraw");
            System.out.println("you need to Deposit money first");
            System.out.println();
        }
        else if( BalanceInquiry.balance <= 500){
            System.out.println("You do not have sufficient money to withdraw");
            System.out.println("check your balance to see your money in the bank");
            System.out.println();
        }
        else if(Withdraw.withdraw > BalanceInquiry.balance){
            System.out.println("The amount money you want to Withdraw is greater than your balance");
            System.out.println("Check your balance to see your money in the Bank");
            System.out.println();
        }
        else{
            BalanceInquiry.balance = BalanceInquiry.balance - Withdraw.withdraw;
            System.out.println("You withdraw the amount of Php" + Withdraw.withdraw);
            System.out.println();
        }
    }
    
    public static void depositMoney(){
        System.out.println("Yo deposited the amount of: " + Deposit.getDeposit());
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = 0;
        int choice = 0;
        
        System.out.println("===========================================");
        System.out.println("\twelcome to this simple ATM");
        System.out.println("===========================================");
        System.out.println();
        
        do{
            try{
                do{
                    System.out.println("Please Select ATM Transaction: ");
                    System.out.println("Press 1 Deposit");
                    System.out.println("Press 2 Withdraw");
                    System.out.println("Press 3 Balance Inquiry");
                    System.out.println("Press 4 exit");
                    System.out.println("");
                    
                    System.out.print("What would you like to do? ");
                    select = input.nextInt();
                    
                    if(select > 4){
                        System.out.print("Please select Correct Transaction" );
                    }
                    else{
                        switch(select){
                            case 1:
                                System.out.print("Enter the Amount of money to Deposit: ");
                                Deposit.deposit = input.nextDouble();
                                BalanceInquiry.balance = Deposit.deposit + BalanceInquiry.balance;
                                depositMoney();
                                break;
                                
                            case 2:
                                System.out.println("To Withdraw, make sure that you have sufficient in your account");
                                System.out.print("Input amount money to withdraw: ");
                                Withdraw.withdraw = input.nextDouble();
                                withdrawMoney();
                                break;
                               
                            case 3:
                                checkBalance();
                                break;
                                
                            default:
                                System.out.println("transaction Exited");
                                break;
                        }
                    }
                }
                    while(select>4);
                    do{
                        try{
                            System.out.println();
                            System.out.println("Would You like try Another Transaction? ");
                            System.out.println("Press '1' Yes \nPress '2' No");
                            System.out.println();
                            System.out.print("Enter Choice: ");
                            choice = input.nextInt();
                            
                            if(choice > 2){
                                System.out.println("Please Select Correct Choice.");
                            }
                        }
                            
                             catch(Exception e){
                                    System.out.println("Error Input! Please Enter Number Only");
                                    input = new Scanner(System.in);
                                    System.out.println("Enter Your Choice");
                                    select = input.nextInt();
                                    }
                    }
                    while(choice > 2);
                }
            
                        catch(Exception e){
                            System.out.println("Error Input! Please enter a number only!");
                            input = new Scanner(System.in);
                            System.out.println("Enter Your Choice");
                            select = input.nextInt();
                        }
        }
                        while(choice<=1);
                        System.out.println("thankyou for using this simple ATM Machine");
                        
        } 
}
       
