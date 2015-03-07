/*
 
  
2520 is the smallest number that can be divided by 
each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is 
evenly divisible by all of the numbers from 1 to 20?
 
 */

public class Problem5 {
	
	public static void main(String[] args) {
		
		long starttime = System.nanoTime();
	
		for(int i=1;i<1000000000;i+=1) {		// brute force,  took about 500ms, will find better solution later
			if (ismult(i)) {
				System.out.println(i);
				break;
			}
		}
		
		long endtime = System.nanoTime();
		double totaltime = endtime-starttime;
		
		System.out.println("answer took: " + totaltime/1000000 + "ms");
		
	}
	
	static boolean ismult(long x) {
		
		for(int i=1;i<21;i++) {
			if (x%i != 0) {
				return false;
			}
		}
		
		return true;
	}

}
