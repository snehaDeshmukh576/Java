import java.util.*;
public class Array5 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array size");;
		int n=s.nextInt();
		int numbers[]=new int[n];
		
		for(int i=0;i<numbers.length;i++){
			numbers[i]=s.nextInt();
		}
		int x=s.nextInt();
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==x){
				System.out.println("x found at index:"+i);
			}
		}
	}
	

}
