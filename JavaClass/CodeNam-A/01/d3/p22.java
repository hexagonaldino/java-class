package d3;

import java.util.Scanner;

public class p22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("exit�� �Է��ϸ� �����մϴ�");
		while(true)
		{
			System.out.print(">>");
			String text = scan.nextLine();
			if(text.equals("exit"))
			{
				break;
			}
		}
		System.out.print("�����մϴ�");
		scan.close();
	}

}
