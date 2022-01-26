package Array.Aug_10_21;

public class AmstongNumber {
public boolean amstrongNumber(int a)
{
	int originalNumber = a,remainder,result=0;
	
	while (originalNumber!=0) {
		remainder=originalNumber%10;
		result+=Math.pow(remainder, 3);
		originalNumber=originalNumber/10;
	}
	
	return b;
}
}
