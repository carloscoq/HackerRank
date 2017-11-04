package hackerrank.algorithm.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Carlos
 * 
 * Solution to the challenge Dynamic Programing - Equal
 *
 */
public class Equal {
	 public static void main(String args[] ) throws Exception {

		 Scanner in = new Scanner(System.in);
		 
		 int testsNumber = in.nextInt();
		 List<List<Integer>> testCases = new ArrayList<>();
		 List<Integer> testCase = new ArrayList<>();
		 
		 for (int i = 0; i<testsNumber; i++){
			 int qtdCol = in.nextInt();
			 for (int j = 0; j< qtdCol; j++){
				testCase.add(in.nextInt());
			 }
			 testCases.add(testCase);
			 testCase.clear();
			 
		 }		 
		 in.close();
		 
		 
		 
	    }
}
