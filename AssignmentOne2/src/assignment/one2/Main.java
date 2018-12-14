package assignment.one2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> group5 = new Stack<>();

        // This pushes new items to the Stack
        group5.push("Mango");
        group5.push("Orange");
        group5.push("Passion");
        group5.push("Pineapple");
        group5.push("Strawberry");
        group5.push("Apple");
        group5.push("Pawpaw");
        group5.push("Watermelon");


        System.out.println("Stack => " + group5);
        System.out.println();

        // This Pops items from the Stack
        String nameAtTop = group5.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + nameAtTop);
        System.out.println("Current Stack => " + group5);
        System.out.println();

        // This gets the item at the top of the stack without removing it
        nameAtTop = group5.peek();
        System.out.println("Stack.peek() => " + nameAtTop);
        System.out.println("Current Stack => " + group5);

    }
}
