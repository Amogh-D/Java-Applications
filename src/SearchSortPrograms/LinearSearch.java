package SearchSortPrograms;

import java.util.Scanner;
public class LinearSearch
{
    public static void main(String args[])
    {
        int counter, num, item, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter # of Elements: ");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Enter List of Integers: ");
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Enter Search: ");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++)
        {
            if (array[counter] == item)
            {
                System.out.println("(" + item + ") is at " + (counter+1));

                break;
            }
        }
        if (counter == num)
            System.out.println("Not in List. ");
    }
}