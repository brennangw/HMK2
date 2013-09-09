public class TwoA {

	public static boolean isOdd(int num)
	{
		// I would really want to "return num & 1;", but ints != booleans 
		if ((num & 1) == 1)
		{
			return true;
		} //end it
		else 
		{
			return false;
		} //end else
		//Does it have the last bit in common with 1? Y, then it is odd. N, then it is even
	} //end isOdd

	public static boolean isMultiple(int a, int b)
	{
		// I would really love to put "return !(a % b)", but it complained
		// I really wish that ints and booleans could be used together
		if (0 == (a % b)){
			return true;
		} //end if
		else{
			return false;
		} //end else	
	} //end isMultiple

	public static int oddSumTo(int n)
	{
		int current = n;
		int sum = 0;


		if (!isOdd(n)){
			current--; 
		}
		else{
			current -= 2;
		}

		while(current > 0)
		{
			sum += current;
			current -= 2;
		}
		return sum;
	}

	public static boolean isOddProd(int ints[])
	{

		boolean containsOneOdd = false; //this is used so once it is true if another odd is found we can sat that contains multiple odds it true
		boolean containsMultiOdds = false;

		for(int item: ints){ 
			if (TwoA.isOdd(item)){
				if (containsOneOdd){
					containsMultiOdds = true;
				}
				else {
					containsOneOdd = true; 
				}
			}

		}
		return containsMultiOdds;
	}

	public static boolean allDistinct(int ints[]){

		for (int i : ints){
			if(TwoA.intInArr(i, ints))
			{

			}

		}
		return true;
	}
	//checks to see if the int is in the array 
	public static boolean intInArr(int num, int ints[]){
		boolean isAnotherHere = false;
		for (int i : ints){
			if(i == num){
				isAnotherHere = true;
			}
		}
		return isAnotherHere;
	}

	public static Object reverseInts(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
}
