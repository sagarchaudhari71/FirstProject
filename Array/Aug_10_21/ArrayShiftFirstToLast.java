package Array.Aug_10_21;

public class ArrayShiftFirstToLast {
public static void main(String[] args) {
	int a[] = {3,4,6,8,2,9,4,32,77};
	int first = a[0];
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
	for (int i = 1; i < a.length; i++) {
		a[i-1] = a[i];
	}
	a[a.length-1] = first;
	System.out.println();
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
