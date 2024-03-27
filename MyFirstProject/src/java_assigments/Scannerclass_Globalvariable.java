package java_assigments;
import java.util.Scanner;
public class Scannerclass_Globalvariable {
Scanner s1=new Scanner(System.in);
int firstno;
int secodno;
void add()
{
int firstno=s1.nextInt();
int secondno=s1.nextInt();
System.out.println(firstno+secondno);
}
void mul()
{
byte firstno=s1.nextByte();
byte secondno=s1.nextByte();
System.out.println(firstno-secondno);
}
void div()
{
short firstno=s1.nextShort();
short secondno=s1.nextShort();
System.out.println(firstno*secondno);
}
void modulo()
{
long firstno=s1.nextLong();
long secondno=s1.nextLong();
System.out.println(firstno/secondno);
}

void sub()
{
float firstno=s1.nextFloat();
float secondno=s1.nextFloat();
System.out.println(firstno%secondno);
}
public static void main(String[] args) 
{	
	Scannerclass_Globalvariable s1=new Scannerclass_Globalvariable();	
	s1.add();
	s1.sub();
	s1.mul();
	s1.div();
	s1.modulo();
}

	
}
}
