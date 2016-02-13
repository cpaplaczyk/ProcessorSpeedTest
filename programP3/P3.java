package programP3;

import java.util.Calendar;

//  Created by Clayton Paplaczyk

public class P3 {
	public static void main(String[] args)
	{
		Calendar time, time2;
		int min, minEnd, sec, secEnd, millisec, millisecEnd;

		time = Calendar.getInstance();
		min = time.get(Calendar.MINUTE);
		sec = time.get(Calendar.SECOND); 
		millisec = time.get(Calendar.MILLISECOND);

		int n3 = 10000000; // choose this input number to obtain sensible execution time
		double[] A = new double[10000000];
		for (int k = 0; k < n3; k++)
		{
			A[k] = 0.4321;
		}
		long start3 = time.get(Calendar.MILLISECOND);
		double sum3 = 0;
		for (int k = 0; k < n3; k++)
		{
			sum3 = sum3 + A[k];
			if (k % 1000000 == 0) // 1000000, 2000000, 3000000, ...
				System.out.println("sum3 = " + sum3);
		}

		time2 = Calendar.getInstance();
		minEnd = time2.get(Calendar.MINUTE);
		secEnd = time2.get(Calendar.SECOND);
		millisecEnd = time2.get(Calendar.MILLISECOND);

		//Make sure seconds did not roll over.
		if(min == minEnd && sec == secEnd){
			long ExcutionTime3 = millisecEnd - start3;
			System.out.println("sum = " + sum3 + "Execution time = " + ExcutionTime3);
		}
		else
			System.out.println("Error, roll over");

	}

}
