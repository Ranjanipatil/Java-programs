//this keyword can used to assign value of local variable to global variables
//this keyword is only used in non static context
package thiskeyword;
public class this_keyword_exe1
{
String name;
int age;
double salary;
void student_detail(String name,int age,double salary)
{
System.out.println("I am " + name + " and my age is "+ age + " and my heavy salary is "+salary );
this.name=name;
this.age=age;
this.salary=salary;

}

public static void main(String[] args)
{
	this_keyword_exe1 t1=new this_keyword_exe1();
	t1.student_detail("Ram",21,456789.80);
	System.out.println(t1.name); //null
	System.out.println(t1.age);//0
	System.out.println(t1.salary);//0.0
	
	
}
}
