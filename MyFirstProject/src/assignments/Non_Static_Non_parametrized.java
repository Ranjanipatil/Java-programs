package assignments;

public class Non_Static_Non_parametrized {

	void test()
	{
		int a= 20;
		int b=30;
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Non_Static_Non_parametrized R1 = new Non_Static_Non_parametrized();
		 R1.test();
	}
}
