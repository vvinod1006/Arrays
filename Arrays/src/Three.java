import java.util.*;

public class Three {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of Organisation");
		int m=sc.nextInt();

		System.out.println("enter the no of companies");
		int n=sc.nextInt();
		System.out.println("enter the no of employees");
		int p=sc.nextInt();
		String[][][] arr=new String[m][n][p];
		for(int i=0;i<m;i++) {
			System.out.println("enter the name of organisation"+(i+1));
			for(int j=0;j<n;j++) {
				System.out.println("enter the name of company"+(j+1));
			for(int k=0;k<p;k++) {
				System.out.println("enter the name of employee"+(k+1));
				arr[i][j][k]=sc.next();
			}
	}}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<p;k++) {
				System.out.println("the name of the employee no"+(k+1)+"from the company no"+(j+1)+"from the organisation"+(i+1));
			System.out.println(arr[i][j][k]);
			}
			
	}}

	}

}
