package d3;

import java.util.Scanner;

public class p20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 5개를 입력해 주세요");
		int sum = 0;
		for(int i=0;i<5;i++)
		{
			double n = scan.nextInt();
			if(n<=0)
			{
				continue;
			}else
			{
				sum += n;
			}
		}
		System.out.print("양수의 합은 : "+sum);
		scan.close();
	}

}
