import java.util.*;
public class Largest{
	public static void main(String [] args) {
		int []arr= {1,2,5,3,7,4};
		int l=arr[0];
		int s=arr[0];
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<l) {
			l=arr[i];
		
			
			}
			if(s<arr[i]) {
			s=arr[i];
			
			
		}
			 sum= sum+arr[i];
		}
		
		System.out.println(sum/arr.length);

		System.out.println("largest"+s );
		System.out.println("Smallest"+l);
	}
}
