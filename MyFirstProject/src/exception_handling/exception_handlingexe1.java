package exception_handling;
public class exception_handlingexe1 
{
	public static void main(String[] args) 
	{
		try
		{

			int c=1/0;//Infinity can't store so gives exception handling
		}
catch(Exception  a1)
		{
	System.out.println("i have handled one exception called AE");
		}
	}


}





//exception handling----0/1=0-----1/0=infinite can't be stored in
//int data type if u assign then it will give run time problem 
//y there is need of exception handling if i dint handle when then exception comes in the 
//Program it will not execute the program to maintain the continuity of the
//execution we need exception handling
//1.exception handling in java should be done in try and catch 
//2.where wherever the exception is coming or whichever line is giving exception should be 
//under try block 
//3.it must be handle in the catch block 
//4.writing try and catch block does not mean that exception will occur always 
//5.in case exception will occur TRY will not execute Catch block will execute
//6.in case exception will not occur Try will execute.
//7.for every try you have one catch or multiple catches 
//synatx 
/*try
 * {
 * }
 * catch(Exception Name refvaraible)//one catch or multiple catch
 * {
 * }
 * catch(exception Name2 refvariable)
 * {
 * }*/
