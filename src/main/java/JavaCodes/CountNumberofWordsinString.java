package JavaCodes;
import java.util.HashMap;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		String str="My My name is Tushar Tushar";
		
		String[]splits=str.split(" ");
		HashMap<String,Integer>hashMap=new HashMap<String,Integer>();
		for(int i=0;i<splits.length;i++)
		{
			if(hashMap.containsKey(splits[i]))
			{
				int count=hashMap.get(splits[i]);
				hashMap.put(splits[i],count+1);
			}else
			{
				hashMap.put(splits[i],1);
			}
		}
		System.out.println(hashMap);
	}
}
