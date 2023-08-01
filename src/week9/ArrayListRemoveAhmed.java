package week9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAhmed {

        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("Ahmed");
            names.add("John");
            names.add("Eric");
            names.add("Ahmed");

            names.removeIf(name -> name.equals("Ahmed"));

            System.out.println("List without Ahmed: " + names);
        }
    }


/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */