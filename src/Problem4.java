/*
 * 


A palindromic number reads the same both ways. 

The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.


 * 
 */

public class Problem4 {
	
	public static void main(String[] args) {
		int maxpal=0;
		int maxi=0;
		int maxj=0;
		
		System.out.println("------------------------");		//
		System.out.println("using modulo");					// This code is a little less intuitive but runs 5x as fast
		System.out.println("------------------------");		//
		
		
		long starttime = System.nanoTime();
		
		for (int i=500;i<1000;i++){
			for(int j=500;j<1000;j++) {
				if (pal(i*j) && (i*j > maxpal)){
					maxpal=i*j;
					maxi=i;
					maxj=j;
				}
			}
		}
		
		long endtime = System.nanoTime();
		double totaltime = endtime-starttime;
		
		System.out.println("answer:" + maxpal + ", i=" + maxi + ",j=" + maxj);
		System.out.println("answer took: " + totaltime/1000000 + "ms");
		
		System.out.println("------------------------");			//
		System.out.println("turning to string and checking");	// This code is a little more intuitive but it is 5x more expensive
		System.out.println("------------------------");			//
		
		maxpal=0;
		maxi=0;
		maxj=0;
		
		starttime = System.nanoTime();
		
		for (int i=500;i<1000;i++){
			for(int j=500;j<1000;j++) {
				if (pal2(i*j) && (i*j > maxpal)){
					maxpal=i*j;
					maxi=i;
					maxj=j;
				}
			}
		}
		
		endtime = System.nanoTime();
		totaltime = endtime-starttime;
		
		System.out.println("answer:" + maxpal + ", i=" + maxi + ",j=" + maxj);
		System.out.println("answer took: " + totaltime/1000000 + "ms");
		
	}
	
	static boolean pal(int x) {
		
		int d1 = x%10;
		int d2 = (x%100-x%10)/10;
		int d3 = ((x%1000-x%100)/100);
		int d4 = ((x%10000-x%1000)/1000);
		int d5 = ((x%100000-x%10000)/10000);
		int d6 = ((x%1000000-x%100000)/100000);
		
		if(d1==d6 && d2==d5 && d3==d4) {
			return true;
		} else {
			return false;
		}
	}

	static boolean pal2(int x) {
		
		
		String pal = ""+x;
		
		if (pal.charAt(0)==pal.charAt(5) && pal.charAt(1)==pal.charAt(4) && pal.charAt(2)==pal.charAt(3)) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
