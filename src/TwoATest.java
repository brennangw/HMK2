import static org.junit.Assert.*;

import org.junit.Test;

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

	@Test
	public void test_isMultiple(){
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
					TwoA.isMultiple(current, (-1 * limit)));
			assertEquals("Is current times -1 still a multiple of limit * -1?",true,
					TwoA.isMultiple(limit, (-1 * current)));
			assertEquals("Is current times -1 still a multiple of limit?", true,
					TwoA.isMultiple(limit, (-1 * current)));
		}
	}

	@Test
	public void test_isOddProd(){
		assertEquals("Find the pair of odds", 9, TwoA.oddSumTo(7));
		assertEquals("Find the pair of odds", 0, TwoA.oddSumTo(0));
		assertEquals("Find the pair of odds", 0, TwoA.oddSumTo(1));
		assertEquals("Find the pair of odds", 25, TwoA.oddSumTo(11));
	}



	@Test
	public void test_isOddSumTo(){
		//Special Cases
		assertEquals("Find the pair of odds", 0, TwoA.oddSumTo(0));
		assertEquals("Find the pair of odds", 1, TwoA.oddSumTo(2));
		assertEquals("Find the pair of odds", 0, TwoA.oddSumTo(-5));
		//Trues
		int sum = 0;
		for(int a=1; a<11111; a += 2){
			assertEquals("Find the pair of odds", sum, TwoA.oddSumTo(a));
			sum += a;
		}//for
	}


	@Test
	public void test_isAllDistinct(){
		int[] arr = {9,8,7,6,5};


		int trials = 1000000;
		int trialCount;
		for (trialCount = 0; trialCount < trials; trialCount++){
			assertEquals("At diffrent", true, TwoA.allDistinct(arr));
			for (int element : arr){
				element++;	
			}

		}
		assertEquals("At diffrent", true, TwoA.allDistinct(arr));

		int[] arrSame = {9,9,9,9,9};

		for (trialCount = 0; trialCount < trials; trialCount++){
			assertEquals("At diffrent", false, TwoA.allDistinct(arrSame));
			for (int element : arrSame){
				element++;	
			}

		}
		assertEquals("At diffrent", false, TwoA.allDistinct(arrSame));


	}

	@Test
	public void test_isReverseInt(){

		int[] intTestOneElementArray = {1};
		TwoA.reverseInts(intTestOneElementArray);
		int[] intCheckOneElementArray = {1};
		assertArrayEquals(intCheckOneElementArray , intTestOneElementArray);

		int[] intTestEvenArray = {4,5};
		TwoA.reverseInts(intTestEvenArray);
		int[] intCheckEvenArray = {5,4};
		assertArrayEquals(intCheckEvenArray , intTestEvenArray);	

		int[] intTestOddArray = {1,2,3};
		TwoA.reverseInts(intTestOddArray);
		int[] intCheckOddArray = {3,2,1};
		assertArrayEquals(intCheckOddArray , intTestOddArray);		


	}
}
