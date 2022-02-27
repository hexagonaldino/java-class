package d3;

public class p10 {
	public static void main(String[] args) {
		int i,j = 0,c;
		c = 2;
		for(i=1;i<=5;i++,c++)
		{
			
			for(j=c;j<=4+c;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.print("\n\n\n");
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.print("\n\n\n");

		for(i=1;j<=i;j++)
	{
		for(j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
