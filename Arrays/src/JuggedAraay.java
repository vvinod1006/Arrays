import java.util.*;
public class JuggedAraay {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.of companies");
	int m=sc.nextInt();
	String [][]arr=new String [m][];
	for(int i=0;i<m;i++) {
		System.out.println("enter the no.of employees");
		arr[i]=new String[sc.nextInt()];
	}
	for(int i=0;i<m;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("employee name"+(j+1)+"company name"+(i+1));
			arr[i][j]=sc.next();
		}
	}
	for(int i=0;i<m;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]);
		}
	}

	}

}
