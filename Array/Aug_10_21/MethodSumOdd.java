package Array.Aug_10_21;

public class MethodSumOdd {
public int sumOdd(int arr[])
{
	int total =0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==1) {
			total +=arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
	return total;
}


public int sumEven(int arr[])
{
	int total =0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==0) {
			total +=arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
	return total;
}

public int avgOdd(int arr[])
{
	int count =0;
	int total =0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==1) {
			count++;
			total +=arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
	System.out.println(count);
	return total/count;
	
}

public int maxElement(int arr[])
{
	
	int max =arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(max<arr[i])
			max =arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		
	}
	
	return max;
	
}
public int minElement(int arr[])
{
	
	int min =arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(min>arr[i])
			min =arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		
	}
	
	return min;
	
}
public int maxavgOdd(int arr[])
{
	int count =0;
	int total =0;
	int max = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==1) {
			if(max<arr[i])
				max=arr[i];
			count++;
			total +=arr[i];
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
	System.out.println(count);
	return total/count;
	
}
}
