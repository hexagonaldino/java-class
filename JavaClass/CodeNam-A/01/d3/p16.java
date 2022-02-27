package d3;

public class p16 {
	public static void main(String[] args) {
		int a=0;
		
		
		while(a!=100)
		{
			if(a%2!=0)
			{
				System.out.println(a);
			}
		a++;
		}
		
		a=0;
		
		
		while(a!=100)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		a++;
		}
		
		a=0;
		int i=0;
		
		int sum=0;
		while(i<=100)
		{
			sum = sum+i;
			i++;
		}
		
		System.out.println(sum);
		
		a=0;
		i=0;
		sum=0;
		
		while(i<=100)
		{
			if(i%2 != 0)
				sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		a=0;
		i=0;
		sum=0;
		
		while(i<=100)
		{
			if(i%2 == 0)
				sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		a=0;
		i=0;
		sum=0;
		
		while(i<=100)
		{
			if(i%3 == 0)
				sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		
		
		
	}
}
