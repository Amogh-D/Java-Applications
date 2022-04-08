package RecursionPrograms;

import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();
        int factorial = factorial(num);
        System.out.println("Factorial: " + factorial);
    }
    static int factorial(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        output = factorial(n-1)* n;
        return output;
    }
}