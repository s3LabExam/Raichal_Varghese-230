import java.util.*;
public class addmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the matrix:");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		System.out.println("Enter the matrix a:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int[][] b=new int[n][n];
		System.out.println("Enter the matrix b:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int[][] c=new int[n][n];
		System.out.println("Resultant Matrix:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
