package d3;

public class p05 {
	public static void main(String[] args) {
		for(int i=2;i<10;i++)
		{
			System.out.print(i+" ���� ����մϴ�");
			for(int j=1;j<10;j++)
			{
				System.out.print(i+"x"+j+"="+i*j+"\n");
			}
			System.out.print("");
		}
		int i;
		int j;
		int sum;
		for(i=0,j=1;i<100;i++,j++)
		{
			sum = i+j;
			System.out.print(i+"+"+j+"=\n");
		}
	}

}
