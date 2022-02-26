package d3;

import java.util.Scanner;

public class p1 
{

//	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요 : ");
		int score = scanner.nextInt();
		if(score >= 80)
		{
			System.out.println("축하합니다! 합격하셨습니다");
		}
		else
		{
			System.out.println("당신은 불합격 입니다");
		}
		scanner.close();
	}

}
