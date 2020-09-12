package javabasics;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+ balance);
    }

    public void deposit(int amountToDeposit){
        this.balance = balance + amountToDeposit;
    }

    public int withdraw (int amountToWithdraw){
        this.balance = balance - amountToWithdraw;
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        //Withdrawing:
        savings.withdraw(300);
        //int afterWithdraw = savings.balance - 300;
        savings.balance = savings.withdraw(300);

        System.out.println("You just withdrew "+ savings.withdraw(300));

        //Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();
        //Deposit:
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited "+600);

        //Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);
        savings.checkBalance();
        //Deposit:
        // int afterDeposit2 = savings.balance + 600;
        // savings.balance = afterDeposit2;
        // System.out.println("You just deposited "+600);

        savings.deposit(600);


        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

    }
}
