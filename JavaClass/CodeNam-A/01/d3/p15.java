package d3;

public class p15 {

	public static void main(String[] args) {
		int i=0;
		while(i<=100)
		{
			int j=0;
			while(j<=100)
			{
				System.out.print(i+"+"+j+"="+(i+j));
				j++;
			}
			i++;
		}
		
		int a=1;
		while(a<5)
		{
			System.out.print("편재 a의 값 : "+a);
			a++;
			System.out.print("현제 a++의 값 : "+a);
		}
	}

}
