package d3;

import java.util.Scanner;

public class p1 
{

//	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� : ");
		int score = scanner.nextInt();
		if(score >= 80)
		{
			System.out.println("�����մϴ�! �հ��ϼ̽��ϴ�");
		}
		else
		{
			System.out.println("����� ���հ� �Դϴ�");
		}
		scanner.close();
	}

}
