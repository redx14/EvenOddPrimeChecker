
package lab1;
public class Lab1 {

    public static void main(String[] args) {
        System.out.println("Testing...");

		MyInteger m1 = new MyInteger(10);
		MyInteger m2 = new MyInteger(19);
		MyInteger m3 = new MyInteger(-1);

		assertTrue("Test  0",m1.isEven());
		assertFalse("Test  1",m1.isOdd());
		assertFalse("Test  2",m1.isPrime());

		assertFalse("Test  3",m2.isEven());
		assertTrue("Test  4",m2.isOdd());
		assertTrue("Test  5",m2.isPrime());	

		assertFalse("Test  6",m3.isEven());
		assertTrue("Test  7",m3.isOdd());
		assertFalse("Test  8",m3.isPrime());		

		assertTrue("Test  9",MyInteger.isEven(2));
		assertFalse("Test 10",MyInteger.isOdd(2));
		assertTrue("Test 11",MyInteger.isPrime(17));

		assertTrue("Test 12",MyInteger.isEven(-2));
		assertFalse("Test 13",MyInteger.isOdd(-2));
		assertFalse("Test 14",MyInteger.isPrime(-17));		

		assertTrue("Test 15",MyInteger.isEven(m1));
		assertFalse("Test 16",MyInteger.isOdd(m1));
		assertFalse("Test 17",MyInteger.isPrime(m1));

		assertTrue("Test 18",m2.equals(19));
		assertFalse("Test 19",m2.equals(1));

		assertTrue("Test 20", 123 == MyInteger.parseInt(new char[]{'1','2','3'}));
		assertTrue("Test 21", 123 == MyInteger.parseInt("123"));
		assertTrue("Test 22", 19 == m2.getValue());

		System.out.println("Done.");
            
        
    }
 	public static void assertTrue(String s, boolean b) {
		if (!b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - PASSED");
		}
	}

	public static void assertFalse(String s, boolean b) {
		if (b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - PASSED");
		}
	}	
	public static void assertEquals(String s, boolean b) {
		if (b) {
			System.out.println(s + " - FAILED ***");
		} else {
			System.out.println(s + " - PASSED");
		}
	}   
}
    
