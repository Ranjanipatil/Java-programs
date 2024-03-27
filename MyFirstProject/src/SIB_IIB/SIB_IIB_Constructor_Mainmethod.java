package SIB_IIB;

public class SIB_IIB_Constructor_Mainmethod {
	static 
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	SIB_IIB_Constructor_Mainmethod()
	{
	System.out.println("Constructor");	
	}
	public static void main(String[] args) {
		
System.out.println("main method");
SIB_IIB_Constructor_Mainmethod I1=new SIB_IIB_Constructor_Mainmethod();
SIB_IIB_Constructor_Mainmethod I2=new SIB_IIB_Constructor_Mainmethod();
	}

}
