package Array.Aug_10_21;

public class PerfectNumber {
public int perfectNum(int a[])
{
	int highestPerfectNum =0;
	int sum =0;
	for (int i = 0; i <= a[i]/2; i++) {
		if(a[i]%(i+1)==0)
		{
			sum +=(i);
		}
		if(sum==a[i])
		{
			highestPerfectNum = sum;
		}
	}
	return highestPerfectNum;
}

}
