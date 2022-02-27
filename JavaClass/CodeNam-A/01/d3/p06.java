package d3;

public class p06 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<101;i++)
		{
			if(i%2==0)
			{
				sum1 = sum1+i;
			}else
			{
				sum2 = sum2+i;
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : "+sum1);
		System.out.print("È¦¼öÀÇ ÇÕ : "+sum2);

	}

}
