
public class Main 
{

	public static void main(String[] args) 
	{
		int n = 1;
		while(n<=10000)
		{
			System.out.println(n + " " + Functions.g1(n) + " " + Functions.g2(n) + " " + Functions.f1(n) + " " + Functions.f2(n));
			n++;
		}
	}

}
