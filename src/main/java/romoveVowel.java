public class romoveVowel {
    public static void main(String[] args)
    {
      String givenStr = "I am a SQA Engineer";
        for (int i = 0; i < givenStr.length(); i++) {
            if (givenStr.charAt(i) == 'a' || givenStr.charAt(i) == 'e'
                    || givenStr.charAt(i) == 'i' || givenStr.charAt(i) == 'o'
                    || givenStr.charAt(i) == 'u' || givenStr.charAt(i) == 'A'
                    || givenStr.charAt(i) == 'E' || givenStr.charAt(i) == 'I'
                    || givenStr.charAt(i) == 'O'
                    || givenStr.charAt(i) == 'U') {
                continue;
            }
            else {
                System.out.print(givenStr.charAt(i));
            }
        }
    }
}
