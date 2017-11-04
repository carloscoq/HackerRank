package hackerrank.algorithm.sorting;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Carlos
 *
 */
public class BigSorting {
	
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }
	        
	        Integer base = Integer.parseInt(unsorted[0]);
	        Integer temp = 1;
	        
	        for(int i = 0; i < unsorted.length; i++){
	        	for(int j = i; j<unsorted.length; j++){
	        		Integer t = Integer.parseInt(unsorted[j]);
	        		if(t < base){
	        			unsorted[j] = base.toString();
	        			unsorted[i] = t.toString();
	        			base = t;
	        		}
	        	}
	        }
	        
	        for (String string : unsorted) {
				System.out.println(string);
			}
	    }
}
