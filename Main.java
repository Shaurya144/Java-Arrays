// ArrayLists are used because they have many functions you can use 

// Firstly how to make an array
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Products = new ArrayList<String>();
        // Now we have an empty list called Products
        // You can add elements to the Array using .add()

        Products.add("Banana");
        Products.add("Potatos");
        Products.add("Sweets");
        Products.add("Microscope");

        System.out.println(Products); // [Banana, Potatos, Sweets, Microscope]

        // You can also Add elements to a certain index
        Products.add(0, "Rocket");

        // To get an element at a certain point in an Array you use .get(index)
        Products.get(3); // Potatoes

        // To change an Item you use .set(index, change)
        Products.set(4, "Salad");

        // You can remove elements using .remove(index)
        Products.remove(5);

        // To remove all you use .clear()
        // To get the number of elements you use .size()

        // Looping Through a List
        for (int i = 0; i < Products.size(); i++) {
            System.out.println(Products.get(i));
        }

        // Arrays can also store Numbers
        ArrayList<Integer> MyNumbers = new ArrayList<Integer>();

        MyNumbers.add(235);
        MyNumbers.add(4);
        MyNumbers.add(319);
        MyNumbers.add(17);
        MyNumbers.add(51);

        Collections.sort(MyNumbers); // arranges them in ascending order
        System.out.println(MyNumbers);

    }
}