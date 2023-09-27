package iterationControlStructure;
import java.io.*;
public class Assignment1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int n,num;
		System.out.println("Enter the number ");
		n=Integer.parseInt(ob.readLine());
		num=n;
		int rev=palin(n,0);
		if(rev==num)
			System.out.println(num+" is a Palindrome");
		else
			System.out.println(num+" is not a Palindrome");
	}
	public static int palin(int n,int rev){
		if(n==0)
			return rev;
		return palin(n/10, (rev*10)+(n%10));
	}
	
}
