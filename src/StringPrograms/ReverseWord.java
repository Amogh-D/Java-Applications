package StringPrograms;

public class ReverseWord
{
    public void reverseWord(String str)
    {
        String[] empty = str.split(" ");
        String rString = " ";
        for (int i = 0; i < empty.length; i++)
        {
            String word = empty[i];
            String rWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                rWord = rWord + word.charAt(j);
            }
            rString = rString + rWord + " ";
        }
        System.out.println(str);
        System.out.println(rString);
    }
    public static void main(String[] args)
    {
        ReverseWord object = new ReverseWord();
        object.reverseWord("My name is Amogh Dhumal");
        object.reverseWord("I love computer science ");
    }
}