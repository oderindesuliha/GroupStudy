import java.util.Scanner;

public class ReverseIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println("Enter a character");
        char character = input.next().charAt(0);

     	String reversed = lastAndReverseIndex(word, character);
        System.out.println(reversed);
    }

    public static String lastAndReverseIndex(String word,char ch ) {
         String newWord = "";

         for(int index = 0; index < word.length(); index++) {
             if(word.charAt(index) == ch) {
                 for(int count = index; count >=0; count--) {
                     newWord += word.charAt(count);
                 }

             }
         }
         for (int count = newWord.length(); count < word.length(); count++) {
             newWord += word.charAt(count);
         }

        return newWord;
    }
}