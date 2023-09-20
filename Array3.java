import java.util.*;
public class Array3 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.print("Enter"+n+"Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=0;j<a.length;j++){
			System.out.println(a);
		}
	}

}
