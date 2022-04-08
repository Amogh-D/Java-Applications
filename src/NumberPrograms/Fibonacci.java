package NumberPrograms;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int count = 0, firstNum = 0, secondNum = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value: ");
        count = scanner.nextInt();
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(firstNum + " ");

            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}