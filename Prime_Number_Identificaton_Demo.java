//Assignment 8.2
//Implement a class that checks whether a given number is a prime using both the Thread class and Runnable interface
//Expected Output
//Print whether a given number is a prime or not.


//  What is Prime number?
//As per definition, Number which is greater than 1 and has only 1 divider which
//is itself is called Prime number. Other numbers are called Composite Number. 
//Let’s take a look: 3, 5, 7, 11, 13 are prime numbers.


//In order to create , execute and run a simple Thread in Java , we need to perform few operations . 
//We can create a thread by two ways : 

//1 . First way is to create a thread by implementing Runnable Interface . Generally , Runnable Interface 
//has one method called as run . This run method performs the logic for our thread . We have to provide 
//implementation to this method from the Runnable Interface and execute it when we want to execute code in 
//threads.     
//2 . Second way is to extend Thread class in Java and override run method 


package assignment_8_2;
/*
 * This Assignment helped me to master the concepts of Threads and Runnable interface.
 */

//This class is checking that the number is prime or not and extending Thread class.
class PrimeByClass extends Thread
{
	int inputNumber;   //int variable to store the value of inputNumber.

	//Constructor.
	public PrimeByClass(int inputNumber) 
	{
		//Initializing instance variable by parameter passed in the constructor.
		this.inputNumber = inputNumber;
	}
	
	//run method that is overriding in this class.
	public void run()
	{
		int flag=0;
		try
		{
			//Using for loop, we are checking weather any number is dividing inputNumber or not.
			for(int i = 2 ; i <= inputNumber/2 ; i++)
			{
				//if number is dividing.
				if(inputNumber % i ==0 )
				{
					flag=1;    //change the flag value.
					break;     //break from the loop.
				}
			}
			
			//if value of flag is not changed then it is prime.
			if(flag == 0)
			{
				System.out.println(inputNumber+" is prime number -> Checking by Extending Thread Class");   //Printing Statement.
			}
			//if value of flag is changed then it is not prime.
			else
			{
				System.out.println(inputNumber+" is not prime number -> Checking by Extending Thread Class");   //Printing Statement.
			}
			
			Thread.sleep(1000);   //Calling Sleep to Thread.
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");   //Printing Statement.
		}
	}
	
}

//This class is checking that the number is prime or not and implementing Runnable interface.
class PrimeByInterface implements Runnable
{
	int inputNumber;   //int variable to store the value of inputNumber.

	//Constructor.
	public PrimeByInterface(int inputNumber) 
	{
		//Initializing instance variable by parameter passed in the constructor.
		this.inputNumber = inputNumber;
	}

	@Override
	//Overridden method run().
	public void run() 
	{
		int flag=0;
		try
		{
			//Using for loop, we are checking weather any number is deviding inputNumber or not.
			for(int i = 2 ; i <= inputNumber/2 ; i++)
			{
				//if number is dividing.
				if(inputNumber % i ==0 )
				{
					flag=1;    //change the flag value.
					break;     //break from the loop.
				}
			}
			
			//if value of flag is not changed then it is prime.
			if(flag == 0)
			{
				System.out.println(inputNumber+" is prime number -> Checking by implementing Runnable interface.");   //Printing Statement.
			}
			//if value of flag is changed then it is not prime.
			else
			{
				System.out.println(inputNumber+" is not prime number -> Checking by implementing Runnable interface.");   //Printing Statement.
			}
			
			Thread.sleep(1000);   //Calling Sleep to Thread.
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");   //Printing Statement.
		}
	}
	
}





