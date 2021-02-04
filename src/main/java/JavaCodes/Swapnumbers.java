package JavaCodes;

public class Swapnumbers {
	public static void main(String[] args) {
		int a=10,b=20,temp=0;
		//using third variable
		System.out.println("numbers before swap-> a"+a+"b->"+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("numbers after swap-> a"+a+"b->"+b);
		
		//withoud using third variable
		int x=30,y=40;
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("numbers after swap-> x"+x+"y->"+y);
		
				
		
	}

}
