import java.util.Scanner;
public class WordCount2{

	public static void main(String...args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a word:");
        String sentence = input.nextLine();
	
	int wordCount = lengthOfLastWord(sentence);
	System.out.print(wordCount);

    }


public static int lengthOfLastWord(String sentence){
		
  int word = 0;
  String size = " ";

    for(int count = sentence.length()-1; count >= 0 ; count--){
	if(sentence.charAt(count) != size.charAt(0)){
		word++;
						
             } else { break; }
          }

	if (word > 0){
     	   
          } 
          return word;
	}
}