package StringPrograms;

import java.util.Scanner;
public class ArrangingAlphabetical
{
    public static void main(String[] args)
    {
        int count;
        String temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Strings: ");
        count = scanner.nextInt();

        String str[] = new String[count];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Strings: ");
        for(int i = 0; i < count; i++)
        {
            str[i] = sc.nextLine();
        }
        scanner.close();
        sc.close();

        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.print("Alphabetical Order: ");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(str[i] + " | ");

        }
    }
}