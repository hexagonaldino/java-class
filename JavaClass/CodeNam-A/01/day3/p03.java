package d3;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력해 주세요");
		int num = in.nextInt();
		in.close();
		
		if(num %2 == 0)
		{
			System.out.println("짝수 입니다");
			return;
		}else
		{
			System.out.println("홀수 입니다");
			return;
		}

	}

}
