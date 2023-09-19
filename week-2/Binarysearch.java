import java.util.*;
public class Binarysearch{
public static void sort(int[] array)
    {
    	int n=array.length;
    	for(int i=0;i<n-1;++i){
    		for(int j=i+1;j<n;++j){
    			if(array[i]>array[j]){
    				array[i]=(array[i]+array[j])-(array[j]=array[i]);
    			}
    		}
    	}
    	
    }
    	
	public static int binarysearch(int[] array,int key){
		int low=0,high=array.length;
		while(high-low>1){
			int mid=low+(high-low)/2;
			if(array[mid]==key) return mid;
			else if(array[mid]>key) high=mid;
			else low=mid;
		}
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
		sort(array);
		System.out.println("\n enter the key you want to search ");
		int key=sc.nextInt();
		int ans=binarysearch(array,key);
		if(ans>=0) System.out.println("element found at index "+ans);
		else System.out.println(" element not found ");
	
	}

}
