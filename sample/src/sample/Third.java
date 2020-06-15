package sample;

public class Third 
{
	public static void main(String[] args) 
	{
		if(args.length==0)
			System.out.println("no values");
		else
		{
			for(String x:args)
				System.out.println(x+",");
		}
	}

}
