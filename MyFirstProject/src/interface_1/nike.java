package interface_1;

interface nike 
{
	void shoe();
}
interface puma extends nike
{
	void bag();
}
class palloutlet implements puma 
{
	public void shoe()
	{
		System.out.println("nike shoe");
	}
	public void bag()
	{
		System.out.println("puma bag");
	}
	public static void main(String[] args) {

		palloutlet o1=new palloutlet();
		o1.bag();
		o1.shoe();
	}
}