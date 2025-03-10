import java.util.Arrays;
public class reverseNumber{

	public static void main(String... args){

	int[] input1 = {3,1,5};
	int[] input2 = {8,6,4,7};
	
	int[] myNumber = numberConvert(input1,input2);
	System.out.print(Arrays.toString(myNumber));
	}

	public static int[] numberConvert(int[] input1, int[] input2){
	int[] input = new int[input1.length + input2.length];
	for (int count = 0; count < input1.length; count++){
			input[count] = input1[count];
	}
		for (int counter =0 ; counter < input2.length; counter++){
		  	input[counter + input1.length] = input2[counter];
         }
      
		return input;
	 
}

   


}