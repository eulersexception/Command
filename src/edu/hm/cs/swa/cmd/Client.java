package edu.hm.cs.swa.cmd;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("Please enter your calculation (e.g. 5 * 3 (please add a space after each integer))");
        Scanner scanner = new Scanner(System.in);
        int left = 0;
        int right = 0;
        String op = "+";

        if (scanner.hasNextInt()) {
            left = scanner.nextInt();
            System.out.println("Found Int value: "
                    + left);
        } else {
            System.out.println("Not found Int value: "
                    + scanner.next());
        }
        if (scanner.hasNext()) {
            op = scanner.next();
            System.out.println("Found Operator: "
                    + op);
        } else {
            System.out.println("Not found Operator value: "
                    + scanner.next());
        }
        if (scanner.hasNextInt()) {
            right = scanner.nextInt();
            System.out.println("Found Int value: "
                    + right);
        } else {
            System.out.println("Not found Int value: "
                    + scanner.next());
        }

        scanner.close();

        Calculator receiver = new Calculator();
        Invoker mathInvoker = new Invoker();

        System.out.print("Result: ");
        mathInvoker.setCommand(receiver, left, right, op);

    }
}