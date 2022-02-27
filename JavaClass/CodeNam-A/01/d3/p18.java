package d3;

public class p18 {
	public static void main(String[] args) {
		int i=0;
		do {
			
			i++;
		}while(i<10);
		System.out.println("");
		
		char c='A';
		do {
			
			c =(char)(c+1);
		}while(c<='Z');
		
		System.out.println();
		
		i=0;
		int sum = 0;
		
		do {
			
			sum = sum + i;
			i++;
		}while(i<=100);
		
		System.out.print(sum);
		
		
		System.out.println();
		
		i=0;
		sum = 0;
		
		do {
			
			sum = sum + i;
			i++;
		}while(i<=10);
		
		System.out.print(sum);
		
		
		
		
		

		
		System.out.println();
		
		i=0;
		sum = 0;
		
		do {
			
			if(i%2 != 0)
				sum = sum + i;
			i++;
		}while(i<=100);
		
		System.out.print(sum);
		
		
		
		
		System.out.println();
		
		i=0;
		sum = 0;
		
		do {
			
			if(i%2 == 0)
				sum = sum + i;
			i++;
		}while(i<=100);
		
		System.out.print(sum);
		
		
		
	}

}
