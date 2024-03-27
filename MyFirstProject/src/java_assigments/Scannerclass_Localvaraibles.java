package java_assigments;
import java.util.Scanner;
public class Scannerclass_Localvaraibles {
	void add()
	{
		Scanner s1=new Scanner(System.in);
		int firstno=s1.nextInt();
		int secondno=s1.nextInt();
		System.out.println(firstno+secondno);
	}
	void sub()
	{
		Scanner s1=new Scanner(System.in);
		byte firstno=s1.nextByte();
		byte secondno=s1.nextByte();
		System.out.println(firstno-secondno);
	}

	void mul()
	{
		Scanner s1=new Scanner(System.in);
		short firstno=s1.nextShort();
		short secondno=s1.nextShort();
		System.out.println(firstno*secondno);
	}
	void div()
	{
		Scanner s1=new Scanner(System.in);
		long firstno=s1.nextLong();
		long secondno=s1.nextLong();
		System.out.println(firstno/secondno);
	}
	void modulo()
	{
		Scanner s1=new Scanner(System.in);
		float firstno=s1.nextFloat();
		float secondno=s1.nextFloat();
		System.out.println(firstno%secondno);

	}
	public static void main(String[] args) {

		Scannerclass_Localvaraibles n1=new Scannerclass_Localvaraibles();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
		n1.modulo();
	}

}
