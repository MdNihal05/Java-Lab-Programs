import java.util.*;
public class Linearsearch{
	public static int linearsearch(int[] array,int key){
		
		int n=array.length;
		for(int i=0;i<n;++i) if(array[i]==key) return i;
		return -1;
	
	}

	public static void main(String... args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int[]  array=new int[n];
		System.out.println("enter the elements in array");
		for(int i=0;i<n;++i){
			array[i]=sc.nextInt();
		}
		System.out.println("\n enter the key you want to search ");
		int key=sc.nextInt();
		int ans=linearsearch(array,key);
		if(ans>=0) System.out.println("element found at index "+ans);
		else System.out.println(" element not found ");
	
	}

}
