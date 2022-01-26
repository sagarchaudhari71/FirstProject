package Array.Aug_10_21;

public class BinaryToDecimal {
public int toDecimal(long bin)
{
	int decimalNum = 0, i=0;
	while (bin>0) {
		decimalNum += Math.pow(2, i++)*(bin%10);
		bin /= 10;
		
	}
	return decimalNum;
}
public String toHexaDecimal(long bin)
{
	int decimalNum = toDecimal(bin);
	String hexNum = Integer.toHexString(decimalNum);
	hexNum = hexNum.toUpperCase();
	return hexNum;
}
}
