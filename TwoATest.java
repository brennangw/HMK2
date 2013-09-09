package assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoATest {

	@Test
	public void test_isOdd() {
		int g = -999;
		while(g <= 1001)
		{
			assertEquals("Is it odd?", true, TwoA.isOdd(g));
			g++;
			assertEquals("Is it even?", false, TwoA.isOdd(g));
			g++;
		}
	}
	public void test_isMultiple(){
	{	
	int limit = 1000000;
	int start = 1;
	int negCurrent;
	for(int current = start; current >= limit; current *= 10)
	{
		assertEquals("Is current still a multiple of limit?", true,
					TwoA.isMultiple(limit, current));
		assertEquals("Is limit not a multple of current?", false,
					TwoA.isMultiple(current, limit));
		negCurrent = current * -1;
		assertEquals("Is limit times -1 not a multiple of current * -1", false,
					TwoA.isMultiple(current, (-1 * limit));
		assertEquals("Is current times -1 still a multiple of limit * -1?",true,
					TwoA.isMultiple(limit, (-1 * current)));
		assertEquals("Is current times -1 still a multiple of limit?", true,
					TwoA.isMultiple(limit, (-1 * current)));
	}
	
	public void test_isOddProd(){
		int left = -1; //changing odd ints that will multiply to odd
		int right = -3; //changing odd ints that will multiply to odd
		int arrLength = 7;
		int testArr[arrLength]; 
		int currentLeftPos = 0; 
		int currentRightPos = 1;
		int arr[currentLeftPos] = left;
		int arr[currentRightPos] = right;
		for(i=2; i<=arrLength , i++){ // fill the array with 2 except for where right and left are
			arr[i] = 2;
		} //closes the for
		int moveCount = 1;
		int iterations = 5;
		/* The loop moves the left and the right (the ints) to the right in the array and adds two to their 
		 * value each time. It stops after 5 iterations of this. Each test should be true.
		 */
		while(moveCount<=iterations){ 
			assertEquals("Find the pair of odds", true, TwoA.isOddProd(testArr));
			left++;
			right++;
			testArr[currentLeftPos] = left;
			testArr[currentRightPos] = right;
			assertEquals("No odds", false, TwoA.isOddProd(testArr));
			left++;
			right++;
			testArr[currentLeftPos] = 2;
			testArr[currentRightPos] = 2;
			currentLeftPos++;
			currentRightPos++;
			testArr[currentLeftPos] = left;
			testArr[currentRightPos] = right;
			moveCount++;
		} //closes the while
			
	
	}
	

	
	
	public void test_isOddSumTo(){
		//Special Cases
		assertEquals("Find the pair of odds", false, TwoA.isOddSumTo(0));
		assertEquals("Find the pair of odds", false, TwoA.isOddSumTo(2));
		assertEquals("Find the pair of odds", 0, TwoA.isOddSumTo(-5));
		//Trues
		int sum = 0
		for(a=1; a<11111; a += 2;){
				assertEquals("Find the pair of odds", sum, TwoA.isOddSumTo(a))
				sum += a;
		}//for
	}
	
		
	}
	public void test_isAllDistinct(){
	int arr = [9,9,9,9,9]
	for(i=0; i<5; i++){
		assertEquals("At least two 9s", false, TwoA.isAllDistinct(arr));
		int arr[i] = i;
	}
	assertEquals("At diffrent", true, TwoA.isAllDistinct(arr));	
	}
	
		
	public void test_isReverseInt(){
	int arr = [4,1,2,3];
	int reversedArr[];
	int numberOfCases = 1000;
	for (int caseNumber = 0; caseNumber < numberOfCases; caseNumber++){
		
		//reverses the values
		reversedArr[0] = arr[0]--;
		reversedArr[1] = arr[1]++;
		reversedArr[2] = arr[2]--;
		reversedArr[3] = arr[3]++;
		assertEquals("Reversed", reversedArr, TwoA.isOddSumTo(arr));
		for(int item : arr){
			item += 2;
		}
	}
		
	}	
}
