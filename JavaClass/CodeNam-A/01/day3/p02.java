package d3;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("2자리수 정수 입력");
			int n = scanner.nextInt();
			if(n<=10|n>=99)
			{
				System.out.println("10에서 99까지 정수 입니다");
				scanner.close();
				return;
			}
			int ten = n/10;
			int one = n%10;
			if(ten==one)
			{
				System.out.println("십의 자리와 일의 자리가 같습니다");
			}else
				
			{
				System.out.println("십의 자리와 일의 자리가 같지 않습니다");
			}
		}
	}

}
