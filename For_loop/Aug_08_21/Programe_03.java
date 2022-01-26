package For_loop.Aug_08_21;

public class Programe_03 {
	public static void main(String[] args) {
		int cnt=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=cnt;k++)
			{
				System.out.print(k);
				
			}
			cnt--;
			System.out.println();
		}
	}
}
