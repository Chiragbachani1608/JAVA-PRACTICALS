import java.util.*;

class Countq8b
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str =sc.nextLine();
		int upper = 0, lower = 0, number = 0, special = 0;

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else
				special++;
		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
	}
}