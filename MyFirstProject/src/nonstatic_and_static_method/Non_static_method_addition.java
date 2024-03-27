package nonstatic_and_static_method;

public class Non_static_method_addition {

	
	void add()
	{
	int a=10;
	int b=20;
    int sum =a+b;
    System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		Non_static_method_addition n1=new Non_static_method_addition();
		n1.add();
	}

}
