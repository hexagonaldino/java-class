package d3;

public class p04 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 100;i++)
		{
			sum += i ;
			System.out.print(i);
			if(i<=99)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print("\n\n");
				System.out.print(sum);
			}
		}
	}

}
