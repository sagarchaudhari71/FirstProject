package For_loop.Aug_08_21;

public class Programe_05 {
	public static void main(String[] args) {
		int count = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=count;k--)
			{
				System.out.print(k);
				
			}
			count++;
			System.out.println();
		}
	}

}
