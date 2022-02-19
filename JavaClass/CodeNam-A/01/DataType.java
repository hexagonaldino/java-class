
public class DataType {

	public static void main(String[] args) {

		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9+1.8);
		System.out.println((int)2.9+(int)1.8);

		System.out.println("");
		
		int a = 10;
		int c = 20;
		
		double a1 = 3.1;
		double b1 = 2.1;
		
		System.out.println((int)c/a);
		System.out.println((double)c/a);
		
		System.out.println("");
		
		System.out.println(b1/a1);
		System.out.println(b1+a1);
		
		System.out.println("");
		
		System.out.println((float)(b1/a1));
		System.out.println((double)(b1/a1));
		
	}

}
