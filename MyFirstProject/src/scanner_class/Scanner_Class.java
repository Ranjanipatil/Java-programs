package scanner_class;
import java.util.*;
public class Scanner_Class {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first no->");
		int firstno =s1.nextInt();
		System.out.println("Enter the second no->");
		int secondno=s1.nextInt();
		int sum=firstno + secondno;
		System.out.println("The addition of two number is "  + sum);
	}

}
