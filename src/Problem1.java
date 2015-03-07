/*
 * Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 * 
 */

public class Problem1 {

	public static void main(String[] args) {
		
		System.out.println("------------------------");		//
		System.out.println("using modulo");					//  this code is easier but is less efficient
		System.out.println("------------------------");		//
		
		long starttime = System.nanoTime();
		
		int sum=0;
		int j=0;
		while(j<1000) {
			if (j%3 == 0 || j%5 == 0) {
				sum+=j;
			}
			j++;
		}
		
		long endtime = System.nanoTime();
		long totaltime = endtime-starttime;
		
		System.out.println("answer is: " + sum);
		System.out.println("answer took: " + totaltime + "ns");

		System.out.println("------------------------");		//
		System.out.println("without using modulo");			// This code is a little longer but runs 3x as fast
		System.out.println("------------------------");		//
		
		starttime = System.nanoTime();
		
		int newsum=0;
		int i=0;
		
		while(i<1000)
		{
			newsum +=i;
			i+=3;
		}
		
		i=0;
		
		while(i<1000)
		{
			newsum +=i;
			i+=5;
		}
		
		i=0;
		
		while(i<1000)
		{
			newsum -=i;
			i+=15;
		}
		
		
		endtime = System.nanoTime();
		totaltime = endtime-starttime;
		
		System.out.println("answer is: " + newsum);
		System.out.println("answer took: " + totaltime + "ns");		
		
	}

}
