//Assignment 8.2
//Implement a class that checks whether a given number is a prime using both the Thread class and Runnable interface
//Expected Output
//Print whether a given number is a prime or not.



package assignment_8_2;


public class Prime_Numbers_Demo {
	public static void main(String[] args) 
	{
		//Creating object of class PrimeByClass.
		PrimeByClass firstObject = new PrimeByClass(7);
		
		//creating object of class PrimeByInterface.
		PrimeByInterface tempObject = new PrimeByInterface(999);
		//We have to create Thread object and we have to pass above object in it.
		Thread secondObject = new Thread(tempObject);
		
		firstObject.start();    //Starting first Thread.
		secondObject.start();   //Starting second thread.
		
	}  //End of main function.                              
}