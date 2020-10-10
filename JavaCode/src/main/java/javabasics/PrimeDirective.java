package javabasics;

// Import statement:
import java.util.ArrayList;


class PrimeDirective {

    // Add your methods here:

    public boolean isPrime(int number){

        if( number > 1 && number%number == 0){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    }

}