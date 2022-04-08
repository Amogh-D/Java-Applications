package RecursionPrograms;

import java.util.Scanner;
public class ReverseNum
{
    public static void main(String args[])
    {
        long num = 0;
        int reversenum =0;
        System.out.println("Input Number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = (int) (reversenum + num % 10);
            num = num/10;
        }

        System.out.println("Reversed Number: "+reversenum);
    }
}
