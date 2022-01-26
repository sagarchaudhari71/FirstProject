package Array.Aug_10_21;

public class ArrayMain {
public static void main(String[] args) {
	int arr[]= {3,54,25,67,12,2,33,44,55,8};
	MethodSumOdd callMethod = new MethodSumOdd();
	int sum = callMethod.minElement(arr);
	System.out.println("the sum of ven element:"+sum);
	int maxavgodd = callMethod.maxavgOdd(arr);
	System.out.println("the sum of ven element:"+maxavgodd);
	int melement = callMethod.maxElement(arr);
	System.out.println("the sum of ven element:"+melement);
}
}
