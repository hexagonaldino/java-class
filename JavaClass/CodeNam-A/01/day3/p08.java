package d3;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int num1 = in.nextInt();
			if(num1 <0|num1 > 100)
			{
				System.out.println("��ȿ�� ���ڸ� �����ּ���");
				return;
			}
			int num2 = in.nextInt();
			if(num2 <0|num2 > 100)
			{
				System.out.println("��ȿ�� ���ڸ� �����ּ���");
				return;
			}
			int num3 = in.nextInt();
			if(num3 <0|num3 > 100)
			{
				System.out.println("��ȿ�� ���ڸ� �����ּ���");
				return;
			}
			int a = num1+num2+num3;
			
			
			
			
			
			
			
			if(a/3 <= 60)
			{
				System.out.print("����� ��� " + a/3 +"���� ���հ��Դϴ�");
			}else
			{
				System.out.print("����� ��� " + a/3 +"���� �հ��Դϴ�");
			}
			
		}
		
		

	}

}
