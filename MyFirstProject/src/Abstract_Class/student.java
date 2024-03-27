package Abstract_Class;
abstract class university//grand parent class
{
	abstract void login();//Abstract method 1
	abstract void registartion();//Abstract method 2
	void method1()//nonstaticConcrete method 	
	{
		System.out.println("method 1");
	}
}
abstract class college extends university// parent class
{
	abstract void enroll();//abstract method 1
	abstract void fees();//abstract method 2`	1q	
	static void method2()//static Concrete method 
	{
		System.out.println("method 2");
	}
}
public class student extends college //child class  
{
	void method3()
	{
	System.out.println("method 3");//Concrete method1
	}	
	void method4()
	{
		System.out.println("method 4");//Concrete method2
	}

	public static void main(String[] args) {
student s1=new student();
s1.enroll();
s1.fees();
s1.login();
s1.registartion();
s1.method1();
method2();

s1.method3();
s1.method4();
}
void enroll() {
		
	System.out.println("enroll");	
	}

	
	void fees() {
		
		System.out.println("feees");
	}

	
	void login() {
		System.out.println("login");
		
	}

	
	void registartion() {
		System.out.println("registartion");
		
	}

}
