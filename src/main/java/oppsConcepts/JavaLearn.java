package oppsConcepts;
// inheritence concepts
/*
public class JavaLearn {	
	public void sum(int a, int b) {
	System.out.println(	a+b);
	}
	public class Abc extends JavaLearn{
		
		@Override
		public void sum(int a,int b) {
			System.out.println(a*b);
		}}
		
    public static void main(String[] args) {
        // Creating an instance of the subclass Abc (which is static now)
        Abc a = new Abc();
        a.sum(2, 7); // This will print 14 (multiplication of 2 and 7)
    }	}
		
*/

public class JavaLearn {

    // Method to add two numbers
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    // Static inner class that extends JavaLearn
    public static class Abc extends JavaLearn {

        // Overriding the sum method to multiply instead of adding
        @Override
        public void sum(int a, int b) {
            System.out.println(a * b);
        }
    }

    // Main method should be static
    public static void main(String[] args) {
        // Creating an instance of the subclass Abc (which is static now)
        Abc a = new Abc();
        a.sum(2, 7);  // This will print 14 (multiplication of 2 and 7)
    }
}


	
	


