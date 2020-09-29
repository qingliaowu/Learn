package javabasics;

public class Pig {


    public static int CalculateNumOfpig(int numOfbuckets, int minToDie, int minutesToTest) {
        int states = minutesToTest / minToDie + 1;
        return (int) Math.ceil(Math.log(numOfbuckets) / Math.log(states));
    }

    public static void main(String[] args){

        int numOfbuckets = 1000;
        int minToDie = 15;
        int minToTest = 60;

        int result = CalculateNumOfpig(numOfbuckets,minToDie,minToTest);
        System.out.println(result);

    }



}
