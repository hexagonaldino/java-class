package d3;

import java.util.Scanner;

public class p20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 5���� �Է��� �ּ���");
		int sum = 0;
		for(int i=0;i<5;i++)
		{
			double n = scan.nextInt();
			if(n<=0)
			{
				continue;
			}else
			{
				sum += n;
			}
		}
		System.out.print("����� ���� : "+sum);
		scan.close();
	}

}
