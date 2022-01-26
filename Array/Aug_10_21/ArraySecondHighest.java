package Array.Aug_10_21;

public class ArraySecondHighest {
public static void main(String[] args) {
	int a[] = new int[7];
	a[0]=3;
	a[1]=1;
	a[2]=5;
	a[3]=75;
	a[4]=22;
	a[5]=11;
	a[6]=4;
	
	int max = a[0];
	int secondMax = max;
	for (int i = 0; i < a.length; i++) {
		
		if(max < a[i])
		{
			secondMax = max;		
		max = a[i];
		}
		if(secondMax < a[i] && max >a[i])
			secondMax = a[i];
	}
	System.out.println(max);
	System.out.println(secondMax);
}
}
