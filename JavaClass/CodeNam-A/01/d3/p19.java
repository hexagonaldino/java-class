package d3;

public class p19 {

	public static void main(String[] args) {
		int input=0;
		System.out.print("�����Է�");
		System.out.print("�Է��� ��ġ���� X�� �Է��� �ּ���");
		
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
