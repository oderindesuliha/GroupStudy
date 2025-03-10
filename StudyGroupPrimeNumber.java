public class StudyGroupPrimeNumber{

	public static void main(String... args){

	int number = -6;
	
	boolean myNum = isPrime(number);
	System.out.print(myNum);
	}

	public static boolean isPrime(int number){
	int num = 0;
	for(int count = 1; count <= number; count ++){
	 if (number % count == 0){
		num++;}
	
	}
	if (num == 2){
	return true;}
	return false;
}




}