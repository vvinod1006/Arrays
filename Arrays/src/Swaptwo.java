import java.util.*;
public class Swaptwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=0;
		int[] arr= {1,2,3,4,5,6};
		int[] val=new int [arr.length];
		for(int i=n;i<arr.length;i++) {
			val[temp]=arr[i];
			temp++;
	}
		for(int i=0;i<n;i++) {
			val[temp]=arr[i];
			temp++;
		}
		for(int num:val) {
			System.out.print(num+" 3");
		}
		}

}
