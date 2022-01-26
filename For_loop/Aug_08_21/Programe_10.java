package For_loop.Aug_08_21;

public class Programe_10 {
public static void main(String[] args) {
	int count =5;
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<count;j++)
		{
			System.out.print(" ");
			
		}
		
		for(int k=5;k>=i;k--)
		{
			System.out.print(k);
		}
		count--;
		System.out.println();
	}
}
}
