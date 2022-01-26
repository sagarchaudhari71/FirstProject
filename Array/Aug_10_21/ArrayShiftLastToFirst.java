package Array.Aug_10_21;

public class ArrayShiftLastToFirst {
	public static void main(String[] args) {
		int a[] = {3,4,6,8,2,9,4,32,77};
		int last = a[a.length-1];
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		for (int i = a.length-2; i>=0; i--) {
			a[i+1] = a[i];
		}
		a[0] = last;
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
