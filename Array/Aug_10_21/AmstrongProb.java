package Array.Aug_10_21;

public class AmstrongProb {
public static void main(String[] args) {
  for (int i = 1; i < 999; i++) {
	

	int originalNumber = i,remainder,result=0;
	
	while (originalNumber>0) {
		remainder=originalNumber%10;
		result+=Math.pow(remainder, 3);
		originalNumber=originalNumber/10;
	}
	
if(result==i) {
	System.out.println(i+" is Amstrong number");
}


}
}
}