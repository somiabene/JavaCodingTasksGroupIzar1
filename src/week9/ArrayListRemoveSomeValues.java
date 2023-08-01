package week9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveSomeValues {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(103);
            numbers.add(2);
            numbers.add(89);
            numbers.add(4);
            numbers.add(5);
            numbers.add(231);


            numbers.removeIf(number -> number > 100);

            System.out.println("List after removing values greater than 100: " + numbers);
        }
    }


/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */