package JavaCodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit=10;
		int a=0,b=0,c=1;
		for(int i=0;i<limit;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
	}
}
