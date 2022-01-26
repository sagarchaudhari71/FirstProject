package Array.Aug_10_21;

public class AmstrongMain {
public static void main(String[] args) {
	//AmstongNumber aN = new AmstongNumber();
	//System.out.println(aN.amstrongNumber(371));
	FindPerfectSquare square = new FindPerfectSquare();
	PerfectNumber pNum = new PerfectNumber();
	int a[]= {4,6,9,5,16,12,25,28,23,36,15,35,37,39};
	int b[]=square.findPerfectSquare(a);
	for (int i = 0; i < b.length; i++) {
		if(b[i]>0)
		System.out.println(b[i]);
	}
	System.out.println("---------------------------------");
	int c = pNum.perfectNum(a);
	System.out.println(c);
}
}
