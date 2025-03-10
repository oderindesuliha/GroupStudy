public class ReverseOrder{

	public static void main(String... args){

	String letters = "ABCD";
	String reverse = reverseLetters(letters);
	System.out.print(reverse);

}

	public static String reverseLetters(String alphabets){
	String result = "";
		for(int count = alphabets.length()-1; count >= 0; count--){
		result += alphabets.charAt(count);	
		}
		return result;
}
}