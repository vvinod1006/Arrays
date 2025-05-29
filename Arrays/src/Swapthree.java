import java.util.Scanner;

public class Swapthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=0;
		int start=0;
		
		int[] arr= {1,2,3,4,5,6};
		int end=arr.length-1;
		while(start<n) {
			temp=arr[start];
			arr[start]=arr[n-1];
			arr[n-1]=temp;
			start++;
			n--;
		}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			
		}
			System.out.print(" ");
		while(n<end) {
			temp=arr[n];
			arr[n]=arr[end];
			arr[end]=temp;
			n++;
			end--;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print(" ");
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
