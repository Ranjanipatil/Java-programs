//Creating one more object for SIB,IIB,CON,MM program
package java_assigments;
public class MM_SIB_IIB_Constructor6 {

	{
		System.out.println("My Instance initilazation block");//IIB
	}
	
static 
{
	System.out.println("My Static Intance Block");//SIB
}
MM_SIB_IIB_Constructor6()//Constructor
{
System.out.println("Constructor");
}

public static void main(String[] args) {
		System.out.println("My main method");//MM
		MM_SIB_IIB_Constructor6 s1=new MM_SIB_IIB_Constructor6();//1st object
		MM_SIB_IIB_Constructor6 s2=new MM_SIB_IIB_Constructor6();//2nd object to call the multiple
		//IIB and constructor
	}

}
