package d3;

public class p19 {

	public static void main(String[] args) {
		int input=0;
		System.out.print("문장입력");
		System.out.print("입력을 마치려면 X를 입력해 주세요");
		
		try
		{
			do
			{
				input = System.in.read();
				System.out.println((char)input);
				
			}while(input != -1 && input !='X');
		}catch(Exception e)
		{
			System.out.println("IOException");
			e.printStackTrace();
		}
	}

}
