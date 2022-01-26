package ExceptionHandling;

public class ArithmaticException {
public static void main(String[] args) {
	try {
		int data = 50/0;
		System.out.println(data);
		System.out.println("sagar chaudhari");
		
	}
	catch(Exception e) {
		// TODO: handle exception
		System.out.println("cant divided by zero.....");
	}
	
	int a= 50;
	int b= 0;
	int div;
	try {
		div = a/b;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println((double)a/(b+3));
	}
	
	int arr[] = new int[3];
	arr[0] = 12;
	arr[1] = 15;
	arr[2] = 17;
	
	try {
		System.out.println(arr[0]);
	    System.out.println(arr[4]);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("this index not found");
		System.out.println(e);
	}
}
}
