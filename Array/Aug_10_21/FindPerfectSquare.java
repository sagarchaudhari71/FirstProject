package Array.Aug_10_21;

public class FindPerfectSquare {
public int[] findPerfectSquare(int a[]) {
	
	int d[]=new int[a.length];

for (int i = 0; i < a.length; i++) {
	
	for (int j = 1; j < a[i]; j++) {
	
		if((a[i]/j)==Math.sqrt(a[i])) {	
			d[i]=a[i];
			
		
		}
	}
		
}
return d;
}
}

