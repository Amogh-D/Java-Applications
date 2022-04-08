package NumberPrograms;

import java.util.Scanner;
public class CheckPrime
{
    public static void main(String args[])
    {
        int temp;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scanner.nextInt();
        scanner.close();
        for(int i = 2;i<=num / 2; i++)
        {
            temp = num % i;
            if(temp == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime Number? " + isPrime);
        else
            System.out.println("Prime Number? " + isPrime);
    }
}