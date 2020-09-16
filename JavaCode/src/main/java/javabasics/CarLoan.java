package javabasics;

public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3; //3 years
    int interestRate = 5; //an interest rate of 5% on the loan
    int downPayment = 2000;

    public CarLoan(int carLoan, int loanLength, int interestRate,int downPayment){
        this.carLoan = carLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;

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

    public static void main(String[] args) {

        CarLoan carLoan = new CarLoan(10000, 3, 5, 2000);

    }
}