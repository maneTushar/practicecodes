package JavaCodes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int c=0,a,temp;
		int n=1534;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("Armstrong number");
		}else
		{
			System.out.println("not a armstrong number");
		}
	}
}
