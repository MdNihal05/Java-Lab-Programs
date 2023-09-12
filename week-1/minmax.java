import java.util.*;
public class minmax{
	public static void main(String... args){
		System.out.println("enter the number of elements \n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE;
		System.out.println("enter the elements \n");
		for(int i=0;i<n;++i){
			int x=sc.nextInt();
			if(mn>x) mn=x;
			if(mx<x) mx=x;
		}
		System.out.println("Maximum is :"+mx+" and minimum is : "+mn);
	}

}
