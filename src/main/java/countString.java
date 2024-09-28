public class countString {
    static void countStringType(String str)
    {
        // Declare the variable vowels, consonant, digit
        // and special characters
        int wordCount = 1, vowels = 0, consonant = 0, count = 0;


        // str.length() function to count number of
        // character in given string.
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch == ' ') && (str.charAt(i + 1) != ' ')) {
                wordCount++; // incrementing the word count
            }
            if(str.charAt(i) != ' '){
                count++;
            }
            if ( (ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z') ) {

                // To handle upper case letters
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }

        }
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters without spaces: " + count);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);

    }

    // Driver function.
    static public void main (String[] args)
    {
        String str = "I am a SQA Engineer";

        countStringType(str);
    }
}
