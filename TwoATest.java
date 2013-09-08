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
	
	
	}
	public void test_isOddSumTo(){
	
		
	}
	public void test_isAllDistinct(){
	
		
	}
	public void test_isReverseInt(){
	
		
	}	
}
