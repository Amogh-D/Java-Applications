package BasicPrograms;

import java.util.Scanner;
class VowelOrConsonant
{
    public static void main(String[ ] arg)
    {
        boolean isVowel = false;;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char character = scanner.next().charAt(0);
        scanner.close();
        switch(character)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if(isVowel == true) {
            System.out.println(character + " is  a Vowel");
        }
        else {
            if((character >='a'&&character <='z')||(character >='A'&&character <='Z'))
                System.out.println(character +" is a Consonant");
            else
                System.out.println("Invalid input.");
        }
    }
}