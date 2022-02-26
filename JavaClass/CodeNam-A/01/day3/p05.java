package d3;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("수를 입력하세요");
			int num = in.nextInt();
			
			{
				if(num%10 == 0)
				{
					System.out.println("10의 배수입니다");
				}else
				{
					System.out.println("10의 배수가 아닙니다");
				}
			}
		}

	}

}
