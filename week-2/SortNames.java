import java.util.*;
    public class SortNames	
    {
    	public static void sort(String[] array)
    	{
    		int n=array.length;
    		for(int i=0;i<n-1;++i){
    			for(int j=i+1;j<n;++j){
    				if(array[i].compareTo(array[j])>0){
    					String temp=array[i];
    					array[i]=array[j];
    					array[j]=temp;
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
            String[] array = new String[n+1];
            System.out.println("Enter Array elements: ");
            for(int i=0; i<=n; i++)
            {
                array[i]=sc.nextLine();
            }
    		sort(array);
            for (int i=0; i<=n; i++)
            {
                System.out.print(array[i]+" ");
            }
        }
    }  
