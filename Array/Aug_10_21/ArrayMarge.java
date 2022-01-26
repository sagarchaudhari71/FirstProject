package Array.Aug_10_21;

public class ArrayMarge {
public static void main(String[] args) {
	int a[] = {12,312,18,17,129,112};
	int b[] = {11,62,118,117,139,172,78,88,44};
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	int c[] = new int[a.length+b.length];
	for (int i = 0; i < a.length; i++) {
		c[i] = a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[a.length+i] = b[i];
	}
	System.out.println();
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
	}
}
}
