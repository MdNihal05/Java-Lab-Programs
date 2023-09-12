import java.util.*;
public class palindrome {

	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number \n");
		int n=sc.nextInt();
		int dup=n,rev=0;
		while(dup>0){
			rev*=10;
			rev+=dup%10;
			dup/=10;
		}
		if(n==rev) System.out.println("palindrome\n");
		else System.out.println("not a Palindrome\n");
	}
}
