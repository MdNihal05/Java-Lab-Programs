import java.util.*;
public class quadratic{
	public static void main(String... args){
	    System.out.println("enter the value of a,b,c \n");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double d=b*b-4*a*c;
		double root1,root2;
		if(d<0){
			root1=(Math.sqrt(-d))/2*a;
			System.out.println("root 1: "+(-b)+"+i"+root1+"\n");
			System.out.println("root 2: "+(-b)+"-i"+root1+"\n");
		}else{
			root1=(-b+Math.sqrt(d))/2*a;
			root2=(-b+Math.sqrt(d))/2*a;
			System.out.println("root 1: "+root1+"\n");
			System.out.println("root 1: "+root2+"\n");
		}
	}
}
