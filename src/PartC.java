// Part C

public class TwoATest {

    // Mutator
    public Rational squareRoot() {
	return 0;
    } // squareroot

    // Mutator 
    public Rational square() {
	return 0;
    }

    // Mutator
    public Rational square(){
	return 0;
    }

    // Observer
    public boolean even?(){
	return true;
    } // Odd or even?

    // Observer
    public boolean exact?(){
	return true;
    } // Int or non-int

    // Constructor
    public int gcd(){
	return Int
    } // Returns the greatest common dicisor

    // Constructor
    public int inverse(){
	return 0;
    }


    // Part D



    public class numberTest {

	@test
	public void testSquareAndRoot()
	int i = 0;
	while (i < 100){
	    assertEquals("sqrt(n^2) = n", i, squareRoot(square (i))));
	}
    }

    @test 
    public void testInverse(){
	int i = 0;
	while (i < 100){
	    assertEquals("inverse of inverse = same", i,
		    inverse(inverse(i)));
	}
    }
}



