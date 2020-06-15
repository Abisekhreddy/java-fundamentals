package sample;

public class Reverse
{
	public static void main(String[] args)
	{
		int rem,rev=0,temp;
		int n=1234;
		temp=n;
		while(n !=0)
		{
			rem=n % 10;
			rev=rev * 10 +rem;
			n=n/10;
		}
		System.out.println(temp);
	}

}
