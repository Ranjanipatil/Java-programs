//Create 5 static method and non static 
//method and call it inside main method 
package java_assigments;
public class Staticmethod_nonstaticmethod_pgm4 //class 
{

	static void method1()
	{
		System.out.println("static method 1");
	}

	static void method2()
	{
		System.out.println("static method 2");
	}
	static void method3()
	{
		System.out.println("static method 3");
	}

	static void method4()
	{
		System.out.println("static method 4");	
	}

	static void method5()
	{
		System.out.println("static method 5");
	}
	void method6()
	{
		System.out.println("nonstatic method6");
	}

	void method7()
	{
		System.out.println("nonstatic method7");
	}
	void method8()
	{
		System.out.println("nonstatic method8");
	}
void method9()
{
	System.out.println("nonstatic method9");
}
void method10()
{
	System.out.println("nonstatic method10");
}
	public static void main(String[] args) 
	{
method1();
method2();
method3();
method4();
method5();
Staticmethod_nonstaticmethod_pgm4 s1=new Staticmethod_nonstaticmethod_pgm4();
s1.method6();
s1.method7();
s1.method8();
s1.method9();
s1.method10();
	}

}
