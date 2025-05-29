import java.util.Scanner;
public class Two {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of companies");
		int m=sc.nextInt();
		System.out.println("enter the no of employees");
		int n=sc.nextInt();
		String[][] arr=new String[m][n];
		for(int i=0;i<m;i++) {
			System.out.println("enter the name of the company no"+(i+1));
			for(int j=0;j<n;j++) {
				System.out.println("from the employees no"+(j+1));
				arr[i][j]=sc.next();
			}
	}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("the name of the employee no"+(j+1)+"from the company no"+(i+1));
			System.out.println(arr[i][j]);
			}
			
	}
		

}}
