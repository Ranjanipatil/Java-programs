
package assignments;//adding of 5 static 
//and non stactic methos and call them inside the main method 

import net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System;

public class CallStaticMethod_Add_Sub_Mul_Div_InsideMainMethod {

	static void add()
	{
		System.out.println("Addttion");

	}
	static void sub()
	{
		System.out.println("Substraction"); 

	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Division");
	}
	void add1()
	{
		System.out.println("Addttion1");

	}
	void sub1()
	{
		System.out.println("Substraction1"); 

	}
	void mul1()
	{
		System.out.println("Multiplication1");
	}
	void div1()
	{
		System.out.println("Division1");
	}
	public static void main(String[] args) 
	{
		//System.out.println("Mian method");
		add();
		sub();
		mul();
		div();
		CallStaticMethod_Add_Sub_Mul_Div_InsideMainMethod S1=new CallStaticMethod_Add_Sub_Mul_Div_InsideMainMethod ();
		S1.mul1();
		S1.div1();
		S1.sub1();
		S1.add1();
	}

}
