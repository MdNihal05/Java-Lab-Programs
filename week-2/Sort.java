import java.util.*;
    public class Sort	
    {
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
    	
        public static void main(String[] args)
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Array Size:");
            n=sc.nextInt();
            int[] array = new int[n];
            System.out.println("Enter Array elements: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
    		sort(array);
            for (int i=0; i<n; i++)
            {
                System.out.print(array[i]+" ");
            }
        }
    }  
