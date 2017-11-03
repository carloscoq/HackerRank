package hackerrank.algorithm.implementation;

import java.util.Scanner;

/**
 * @author Carlos
 * Solution of the challenge Breaking the Records - Algorithms
 *
 */
public class BreakingRecords {
	
	static int[] getRecord(int[] s){
        int highest = s[0];
        int lowest = s[0];
        int timeshighest = 0;
        int timesLowest = 0;
        
        for (int i : s) {
			if(i>highest){
				highest = i;
				timeshighest++;
			}else if(i<lowest){
				lowest = i;
				timesLowest++;
			}
		}
        
/*        System.out.println("times highest: "+ timeshighest);
        System.out.println("times lowest: "+timesLowest);*/
        
        return new int[]{timeshighest,timesLowest};
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
