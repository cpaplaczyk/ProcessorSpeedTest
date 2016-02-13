package programP1;
import java.util.*;

//  Created by Clayton Paplaczyk

public class P1 {
	public static void main(String[] args)
	{
		Calendar time, time2;
		int min, minEnd, sec, secEnd, millisec, millisecEnd;

		time = Calendar.getInstance();
		min = time.get(Calendar.MINUTE);
		sec = time.get(Calendar.SECOND); 
		millisec = time.get(Calendar.MILLISECOND);

		int n1 = 10000000; // choose this input number to obtain sensible execution time
		long start1 = time.get(Calendar.MILLISECOND);
		long sum1 = 0;
		for (int i = 0; i < n1; i++ )
		{
			sum1 = sum1 + 1234;
			if (i % 1000000 == 0) // 1000000, 2000000, 3000000, ...
				System.out.println("sum1 = " + sum1);
		}

		time2 = Calendar.getInstance();
		minEnd = time2.get(Calendar.MINUTE);
		secEnd = time2.get(Calendar.SECOND);
		millisecEnd = time2.get(Calendar.MILLISECOND);
		
		//Make sure seconds did not roll over.
		if(min == minEnd && sec == secEnd){
			long ExcutionTime1 = millisecEnd - start1;
			System.out.println("sum = " + sum1 + "Execution time = " + ExcutionTime1);
		}
		else
			System.out.println("Error, roll over");

	}

}
