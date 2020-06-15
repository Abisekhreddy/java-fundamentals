package sample;

public class Fifth {

	public static void main(String[] args)
	{
		char c='A';
		if(c>=48 && c<=57)
			System.out.println("Digit");
		else if((c>=65 && c<=90) || (c>=97 && c>=122))
			System.out.println("alphabet");
		else
			System.out.println("special character");
	}

}
