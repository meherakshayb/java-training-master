package com.mycompany.app.training;

//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
public class ThrowExceptionExample {

    public static void main(String[] args) {
        int n = 18;
        //trynumber(n);
        //n = 7;
        //trynumber(n);
    }

    public static void trynumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}


/* my program for understanding exception
 * 
 * package com.mycompany.app.training;

public class AgainException {
	
	int b=50;
	
	public void process() {
		
		//this.a=c;
		
		try {
		b= b/0;
		System.out.println("The value of b is: " +b);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
		System.out.println("This statement is after the exception was caught");
		
	}
	
	public static void main(String args[]) {
		
		AgainException ae = new AgainException();
		ae.process();
		
	}

}

 * 
 * */
