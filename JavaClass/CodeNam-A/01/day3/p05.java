package d3;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("���� �Է��ϼ���");
			int num = in.nextInt();
			
			{
				if(num%10 == 0)
				{
					System.out.println("10�� ����Դϴ�");
				}else
				{
					System.out.println("10�� ����� �ƴմϴ�");
				}
			}
		}

	}

}
