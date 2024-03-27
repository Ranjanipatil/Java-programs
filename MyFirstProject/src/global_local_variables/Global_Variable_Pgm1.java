package global_local_variables;

public class Global_Variable_Pgm1 {
static int z=100;//Global_Variable(blue in color)with static
byte age=25;
static int q=300;
short no=123;
long salary=12345;//non static global variable so to utilize in main method 
//(static) create object for it and call
static double pi=3.14;//global variable(blue in color)with static
static char gender='M';
static boolean answer;//global variables declared in single line
static float value4;
char s1='R';
static String name="Sampriti";
void add()
{
int a=100;//local variable (brown in color)
int b=20;
int ranjani;//local variable declared multi line 
ranjani=100;//
}
void sub()
{
	int a=30;
	a=10;
	int b=45;
}
static void multi()
{
	System.out.println(pi);//we can use (pi) here as 
	//it's declared in global variable
}
	public static void main(String[] args) 
	{
		System.out.println(pi);
		gender ='M';//we can declare the value
		//of global variable here
		System.out.println(gender);
		answer=true;
		System.out.println(answer);
		value4=3.4f;
		System.out.println(value4);
		System.out.println(name);
		Global_Variable_Pgm1 s1=new Global_Variable_Pgm1();//object creation
		System.out.println(s1.salary);//using reference variable 
		//global_variable_pgm1 s2=new global_variable_pgm1();
		z=800;
		System.out.println(z);
		s1.q=400;
		System.out.println(s1.q);
	}
}
