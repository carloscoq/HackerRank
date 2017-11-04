package hackerrank.test;

import java.util.Scanner;

/**
 * @author Carlos
 * 
 * 
 *
 */
public class FindNumber {
	
	static String findNumber(int[] arr, int k){
		String found = "NO";
		for (int i : arr) {
			if(k == i){
				found = "YES";
			}
		}
		
		return found;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int qtd = in.nextInt();
		int[] arr = new int[qtd];

		for (int i = 0; i<qtd; i++){
			arr[i] = in.nextInt();
		}

		int n = in.nextInt();
		
		System.out.println(findNumber(arr, n));

	}
}
