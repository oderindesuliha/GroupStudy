import java.util.Arrays;
public class convertNumber{

	public static void main(String... args){

	int[] numbers = {1,2,3,4,5,6};
	
	int[] myNumber = numberConvert(numbers);
	System.out.print(Arrays.toString(myNumber));
	}

	public static int[] numberConvert(int[] numbers){

	for (int count = 2; count < numbers.length; count ++){
	 if (numbers[count] % 2 == 0){
		numbers[count] = 0;

	   }  else {
                 numbers[count] = 1;
         }
      }
return numbers;
	 
}




}