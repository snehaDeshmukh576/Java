//update element
public class Array2 {
	void update(int[] a){
		a[1]=82;
	}
	public static void main(String args[]){
		int a[]=new int[]{12,24,36,13};
		Array2 b=new Array2();
		b.update(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
