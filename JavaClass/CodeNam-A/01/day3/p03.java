package d3;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �Է��� �ּ���");
		int num = in.nextInt();
		in.close();
		
		if(num %2 == 0)
		{
			System.out.println("¦�� �Դϴ�");
			return;
		}else
		{
			System.out.println("Ȧ�� �Դϴ�");
			return;
		}

	}

}
