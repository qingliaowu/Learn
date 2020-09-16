package javabasics;

public class CarLoan {
    public static int carLoan = 10000;
    public static int loanLength = 3; //3 years
    public static int interestRate = 5; //an interest rate of 5% on the loan
    static int downPayment = 2000;


    public static void main(String[] args) {

        if(loanLength <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }else if(downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }else{
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}