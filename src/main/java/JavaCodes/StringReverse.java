package JavaCodes;

public class StringReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Tushar";
		
		char[]strChar=str.toCharArray();
		System.out.println("String before reverse->"+str);
		for(int i=strChar.length-1;i>=0;i--)
		{
			System.out.print(strChar[i]);
		}

	}

}
