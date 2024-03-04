import java.util.Scanner;

//array to insert an  element
public class Array4 {
	
	public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter size of the array");
			int n=s.nextInt();
			int[] a=new int[n+1];
			System.out.print("Enter +n elements:");
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			System.out.print("enter an element to insert");
			int e=s.nextInt();
			System.out.print("enter the position of an Element to insert");
			int p=s.nextInt();
			for(int i=n;i<p;i--){
				a[i]=a[i-1];
			}
			a[p]=e;
		for(int b:a){
				System.out.println(b);
			}
	}

}
