package Array.Aug_10_21;

public class AdjustMethod {
	public static int[] aDM(int[] a) {
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
		return b;
	}

}
