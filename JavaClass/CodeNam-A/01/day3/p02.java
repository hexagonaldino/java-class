package d3;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("2�ڸ��� ���� �Է�");
			int n = scanner.nextInt();
			if(n<=10|n>=99)
			{
				System.out.println("10���� 99���� ���� �Դϴ�");
				scanner.close();
				return;
			}
			int ten = n/10;
			int one = n%10;
			if(ten==one)
			{
				System.out.println("���� �ڸ��� ���� �ڸ��� �����ϴ�");
			}else
				
			{
				System.out.println("���� �ڸ��� ���� �ڸ��� ���� �ʽ��ϴ�");
			}
		}
	}

}
