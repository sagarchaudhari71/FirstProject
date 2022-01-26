package Array.Aug_10_21;

public class ArraySecondLowest {
	public static void main(String[] args) {
		int a[] = new int[7];
		a[0]=31;
		a[1]=12;
		a[2]=55;
		a[3]=75;
		a[4]=22;
		a[5]=11;
		a[6]=44;
		
		int min = a[0];
		int secondMin = min;
		for (int i = 0; i < a.length; i++) {
			
			if(min > a[i])
			{
				secondMin = min;		
			min = a[i];
			}
			if(secondMin > a[i] && min <a[i])
				secondMin = a[i];
		}
		System.out.println(min);
		System.out.println(secondMin);
	}
}
