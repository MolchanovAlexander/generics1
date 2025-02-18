package org.example.stack;

import java.util.Stack;

public class StringStack {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Hello");


        stringStack.push("World2");
        stringStack.push("World1");
        stringStack.push("World0");

        System.out.println(stringStack);

        System.out.println(stringStack.peek());


        System.out.println( stringStack.pop());
        System.out.println( stringStack.peek());
    }
    public static void causeStackOverflow() {
        // Recursive call without a base condition
        causeStackOverflow();
    }
}

/*stack


1 - Stack<String> stringStack #abc123ffd Node top #123123dd Node n1 #123123dd
----------------
#abc123ffd : new Stack();
#123123dd : new Node("world2", null)  // top

#12312323dd : new Node("hello", null)
*/
