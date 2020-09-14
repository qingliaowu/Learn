package javabasics;

public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    @Override
    public String toString(){
        return name;
    }

    void performTask(String task){
        System.out.println(name + " is performing task: "+task);
        batteryLevel -= 10;
    }

    public static void main(String[] args){

        Droid Codey = new Droid("Codey");
        System.out.println(Codey);

        Codey.performTask("aaa");
    }
}