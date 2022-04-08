package StringPrograms;

public class CountVC {

    public static void main(String[] args) {
        String str = "amoghdhumal";
        int vowelCount = 0;
        int consonantCount = 0;

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount++;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                consonantCount++;
            }
        }

        System.out.println("# of Vowels: " + vowelCount);
        System.out.println("# of Consonants: " + consonantCount);
    }
}