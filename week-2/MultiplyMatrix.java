import java.util.*;

public class MultiplyMatrix{
	public static void main(String... args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the dimensions of matrix A:");
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		
		int[][] matrixA=new int[n1][m1];
		
		int[][] matrixB=new int[n2][m2];
		System.out.println("enter the elements of matrix A");
		for(int i=0;i<n1;++i){
			for(int j=0;j<m1;++j) matrixA[i][j]=sc.nextInt();
		}
		
		System.out.println("");
		for(int i=0;i<n1;++i){
			for(int j=0;j<m1;++j) System.out.print(matrixA[i][j]+" ");
			System.out.println("");
		}
		System.out.println("enter the dimensions of matrix B:");
		int n2=sc.nextInt();
		int m2=sc.nextInt();
		
		System.out.println("enter the elements of matrix B");
		for(int i=0;i<n2;++i){
			for(int j=0;j<m2;++j) matrixB[i][j]=sc.nextInt();
		}
		
		System.out.println("");
		for(int i=0;i<n2;++i){
			for(int j=0;j<m2;++j) System.out.print(matrixB[i][j]+" ");
			System.out.println("");
		}
		
		System.out.println("Resultant Matrix ");
		for(int i=0;i<n1;++i){
			for(int j=0;j<m2;++j) {
				int sum=0;
				for(int k=0;k<n2;++k){
					sum+=matrixA[i][k]*matrixB[k][j];
				}
				System.out.print(sum+" ");
			}
			System.out.println("");
		}
		
	}
}
