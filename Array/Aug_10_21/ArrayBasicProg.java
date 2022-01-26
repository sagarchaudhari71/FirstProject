package Array.Aug_10_21;

public class ArrayBasicProg {
public static void main(String[] args) {
	int arr[] = {5,85,55,54,36,25,15,86,96,45};
	System.out.println("size of array is;"+arr.length);
	int total =0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==1) {
			total+=arr[i];
			int arrOdd[] = new int[arr.length];
			for (int j = 0; j < arrOdd.length; j++) {
				arrOdd[j]=arr[i];
			}
			System.out.println("the index  arr["+i+"] :"+arr[i]);
		}
	}
	System.out.println("the total is:"+total/arrO);
}
}
