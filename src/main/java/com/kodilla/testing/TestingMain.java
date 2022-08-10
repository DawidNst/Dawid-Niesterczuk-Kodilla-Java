package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        System.out.print("SimpleUser testing: ");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("TEST OK");
        } else {
            System.out.println("ERROR!");
        }
        System.out.println("6,2 - pierwszy test jednostkowy:");

        System.out.print("Calculator \"add\" testing: ");
        int addResult = Calculator.add(19, 15);

        if (addResult == 34) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }

        System.out.print("Calculator \"subtract\" testing: ");
        int subtractResult = Calculator.subtract(80, 40);

        if (subtractResult == 40) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }

    }
}