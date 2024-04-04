package strings;
import java.util.Scanner;

public class Duplicate_Characters {

	public static void main(String[] args) 
	{
		String s1;
		System.out.println("Enter the Text :- ");
		Scanner sc = new Scanner(System.in);
		s1=sc.nextLine();
		int arr[]=new int[256];
		for(int i=0; i<s1.length(); i++)
		{
			arr[s1.charAt(i)]++;
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>1)
			{
				System.out.println((char)(i)+" Count = "+arr[i]);
			}
		}
		
	}

}
