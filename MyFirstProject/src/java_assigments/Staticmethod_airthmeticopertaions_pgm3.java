package java_assigments;
//Create 4 static method to perform arithmetic operations 
//and call it inside the main method
public class Staticmethod_airthmeticopertaions_pgm3 //class
{
static void add()//static method 1 
{
int a=12;
int b=20;
int sum =a+b;
System.out.println("sum="+sum);
}

static void sub(int a,int b)
{
	int sub=a-b;
	System.out.println("sub="+sub);
}
static void mul()
{
	int a=10;
	int b=20;
	int mul=a*b;
	System.out.println("mul="+mul);
}
static void div(int a,int b)
{
	int div=a%b;
	System.out.println("div="+div);
}
public static void main(String[] args)//main method 
{
		sub(100,20);
		add();
        mul();
        div(12,80);
} 

}
