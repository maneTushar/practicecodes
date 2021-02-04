package JavaCodes;
import java.util.HashMap;

public class DuplicateCharactersInString {
public static void main(String[] args) {
	String str="Tuussssssshar";
	
	String[]arr=str.split("");
	String duplicate="";
	HashMap<String,Integer>map=new HashMap<String,Integer>();
	for(int i=0;i<str.length();i++)
	{
		if(map.containsKey(arr[i]))
		{
			int count=map.get(arr[i]);
			map.put(arr[i]+"", count+1);
		}else
		{
			map.put(arr[i]+"", 1);
		}
	}
	System.out.println(map);
	/*for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[j]);
				duplicate=arr[j]+"";
				count++;
				
				break;
			}
		}
		
	}*/
	
}
}
