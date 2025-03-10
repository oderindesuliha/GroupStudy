public class NumberofOccurrence{

	public static void main(String... args){

	String letters = "Hello World";
	char letter = 'o';
	int numberoccurrence = occurrence(letters,letter);
	System.out.print(numberoccurrence);

}

	public static int occurrence(String letters, char letter){
	int result = 0;
		for(int count = 0; count < letters.length(); count++){
		if(letters.charAt(count) == letter){
		result +=1;
	}
     }
		if (result != 0){
		
       } return result;
     } 


}