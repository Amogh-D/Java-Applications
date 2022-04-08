package NumberPrograms;

import java.util.Scanner;
public class SwapNum
{
    public static void main(String args[])
    {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number #1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Number #2: ");
        num2 = scanner.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        scanner.close();

        System.out.println("First Num: " + num1);
        System.out.println("Second Num: " + num2);
    }
}