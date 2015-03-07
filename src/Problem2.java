/*
 * Problem 2
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.
 * 
 */


public class Problem2 {
	
	public static void main(String[] Args) {
		
		long starttime = System.nanoTime();
		
		int f1,f2,f3,total;
		f1=1;
		f2=2;
		total=3;
		
		while (f2<4000000) {
			f3=f1+f2;
			
			if (f3%2==0) {
			total+=f3;
			}
			
			f1=f2;
			f2=f3;
		}
		
		long endtime = System.nanoTime();
		long totaltime = endtime-starttime;

		System.out.println("answer is: " + total);
		System.out.println("answer took: " + totaltime + "ns");
		
	}

}