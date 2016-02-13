package programP2;
import java.util.*;

//  Created by Clayton Paplaczyk

public class P2 {
	public static void main(String[] args)
	{
		Calendar time, time2;
		int min, minEnd, sec, secEnd, millisec, millisecEnd;

		time = Calendar.getInstance();
		min = time.get(Calendar.MINUTE);
		sec = time.get(Calendar.SECOND); 
		millisec = time.get(Calendar.MILLISECOND);

		int n2 = 10000000; // choose this input number to obtain sensible execution time
		long start2 = time.get(Calendar.MILLISECOND);
		double sum2 = 0;
		for (int j = 0; j < n2; j++)
		{
			sum2 = sum2 + 0.4321;
			if (j % 1000000 == 0) // 1000000, 2000000, 3000000, ...
				System.out.println("sum2 = " + sum2);
		}

		time2 = Calendar.getInstance();
		minEnd = time2.get(Calendar.MINUTE);
		secEnd = time2.get(Calendar.SECOND);
		millisecEnd = time2.get(Calendar.MILLISECOND);
		

		//Make sure seconds did not roll over.
		if(min == minEnd && sec == secEnd){
			long ExcutionTime2 = millisecEnd - start2;
			System.out.println("sum = " + sum2 + "Execution time = " + ExcutionTime2);
		}
		else
			System.out.println("Error, roll over");
	}
}
