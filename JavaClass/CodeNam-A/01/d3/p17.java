package d3;

import java.util.Scanner;

public class p17 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char c = 'A';
		while(c<='Z')
		{
			System.out.print(c++);
		}
		
		while(true)
		{
			int scr = in.nextInt();
			if(scr<0||scr>100)
			{
				break;
			}else
			{
				if(scr>=80)
				{
					System.out.print("합격입니다");
				}else
				{
					System.out.print("불합격 입니다");
				}
			}
		}
	}

}
