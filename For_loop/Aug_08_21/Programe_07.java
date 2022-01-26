package For_loop.Aug_08_21;

public class Programe_07 {
	public static void main(String[] args) {
		int count =5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<count;j++)
			{
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			count--;
			System.out.println();
		}
	}

}
