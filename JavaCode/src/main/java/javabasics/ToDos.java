package javabasics;

import java.util.ArrayList;

class ToDos {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        // Add more to-dos here:
        String toDo2 = "task2";
        String toDo3 = "Task3";


        // Add to-dos to toDoList

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);

        System.out.println(toDoList);


    }

}