package StringPrograms;

import java.util.Stack;
import java.util.Scanner;
class Palindrome {

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("Input is Palidrome.");
        else
            System.out.println("Input is not Palidrome");

    }
}