import java.util.Scanner;

public class TwoJuggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of Organisations");
		int m=sc.nextInt();
		String [][][]arr=new String [m][][];
		for(int i=0;i<m;i++) {
			System.out.println("enter the no.of companiees");
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the no.of employees");
				arr[i][j]=new String[sc.nextInt()];
			}

	}
			for(int i=0;i<m;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("employee name"+(k+1)+"company name"+(j+1)+"organisation"+(i+1));
					arr[i][j][k]=sc.next();
				}}
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}}
			}
	}}
