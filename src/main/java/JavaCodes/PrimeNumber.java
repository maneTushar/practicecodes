package JavaCodes;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=10;
		boolean isPrime=true;
		int temp=0;
		for(int i=2;i<number/2;i++)
		{
			temp=number%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
		
		//using while loop
		int j=2;
		int number1=11;
		boolean isPrime1=true;
		while(j<=number1/2)
		{
			if(number1%j==0)
			{
				isPrime1=false;
				break;
			}
			j++;
		}
		
		if(isPrime1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}
