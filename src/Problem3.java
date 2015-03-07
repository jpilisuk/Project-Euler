/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 
 */


public class Problem3 {

	public static void main(String[] args) {
		
		long starttime = System.nanoTime();
		long hugenum = 600851475143L;
		
		for (int i=3;i<10000;i+=2) {
			
			if (hugenum%i==0) {
				hugenum = hugenum/i;
				System.out.println("factor: " + i);
			}
			if(i > hugenum) {
				break;
			}
			
		}
		
		long endtime = System.nanoTime();
		double totaltime = endtime-starttime;
		System.out.println("answer took: " + totaltime/1000000 + "ms");
		
	}
	
}
