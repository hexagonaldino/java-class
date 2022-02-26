package d3;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요");
		int score = in.nextInt();
		in.close();
		if(score < 0|score > 100)
		{
			System.out.print("유효한 점수를 입력해 주세요");
			return;
		}
		char level;
		if(score >= 95)
		{
			System.out.print("A+");
		}else if(score >=90)
		{
			System.out.print("A");
		}else if(score >= 85)
		{
			System.out.print("B+");
		}else if(score >= 80)
		{
			System.out.print("B");
		}else
		{
			System.out.print("C");
		}

	}

}
