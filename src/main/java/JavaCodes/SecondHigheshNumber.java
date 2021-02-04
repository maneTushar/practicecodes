package JavaCodes;
import java.util.*;

public class SecondHigheshNumber {

	public static void main(String[] args) {
	
		int arr[]= {10,200,40,25,66,500,80,23};
		Integer arr1[]= {10,200,40,25,66,500,80,23};
		int largest=0;
		int secondLargest=0;
		int thirdLargest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}else if(secondLargest>arr[i])
			{
				secondLargest=arr[i];
			}
		}
		
		System.out.println("second largest number->"+secondLargest);
		
		//Using collections
		List<Integer>list=Arrays.asList(arr1);
		Collections.sort(list);
		System.out.println("sorted list "+list);
		int thirdElement=list.get(arr1.length-2);
		System.out.println("thirdLargest->"+thirdElement);
				
	}
	
}
