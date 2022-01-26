package For_loop.Aug_08_21;

public class Programe_06 {
public static void main(String[] args) {
	int count = 5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
			
		}
		for(int k=count;k>=1;k--)
		{
			System.out.print(k);
		}
		count--;
		System.out.println();
	}
}
}
