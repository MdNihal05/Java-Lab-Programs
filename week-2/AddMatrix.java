import java.util.*;

public class AddMatrix{
	public static void main(String... args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dimensions of matrix :");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] matrixA=new int[n][m];
		int[][] matrixB=new int[n][m];
		System.out.println("enter the elements of matrix A");
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j) matrixA[i][j]=sc.nextInt();
		}
		System.out.println("");
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j) System.out.print(matrixA[i][j]+" ");
			System.out.println("");
		}
		System.out.println("enter the elements of matrix B");
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j) matrixB[i][j]=sc.nextInt();
		}
		System.out.println("");
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j) System.out.print(matrixB[i][j]+" ");
			System.out.println("");
		}
		System.out.println("Resultant Matrix ");
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j) System.out.print(matrixA[i][j]+matrixB[i][j]+" ");
			System.out.println("");
		}
		
	}
}
