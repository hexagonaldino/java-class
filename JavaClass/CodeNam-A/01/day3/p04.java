package d3;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		

			Scanner in = new Scanner(System.in);
		
			int num1 = in.nextInt();
			int num2 = in.nextInt();
		
			if((num1+num2)%2 == 0)
			{
				System.out.print("짝수 입니다");
			}else
			{
				System.out.print("홀수 입니다");
			}
		
		
	}

}
