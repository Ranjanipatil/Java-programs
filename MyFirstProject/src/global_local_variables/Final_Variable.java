//Make use of Final variable with the global and local variables
package global_local_variables;
public class Final_Variable {
	final static double pi=3.14;//global variable 
	//using final keyword won't allow you to change the value 
	
public static void main(String[] args) 
	{
		//int a=100;//local variable
		//a=200;//local variable
	//System.out.println(a);//out put will be a=200
	//pi =6;
	//System.out.println(pi);out put will be pi=6
	final int a=100;//using final keyword it's not possible to 
	//change the value of a
	System.out.println(a);
	System.out.println(pi);
}
}