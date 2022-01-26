package Array.Aug_10_21;

public class AdjustenValue {
	public static void main(String[] args) {
		int a[] = { 11, 7, 8, 12, 14, 21 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int b[] = new int[a.length - 1];
		int count;
		for (int i = 0; i < b.length; i++) {
			if (a[i] > a[i + 1]) {
				count = a[i] - a[i + 1];
			} else {
				count = a[i + 1] - a[i];
			}
			b[i] = count;
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
