package hackerrank.test;

import java.util.Scanner;

public class OddNumbers {
	
	static int[] oddNumbers(int l, int r){
		
		int qtd = 0;
		int pos = 0;
		for(int i = l; i<=r; i++){
			if(i%2 > 0){
				qtd++;
			}
		}
		
		int[] oddNumbers = new int[qtd];
		
		for(int i = l; i<=r; i++){
			if(i%2 > 0){
				oddNumbers[pos] = i;
				pos++;
			}
		}
		
		
		return oddNumbers;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int l = in.nextInt();
		int r = in.nextInt();
		
		for(int i: oddNumbers(l,r)){
			System.out.println(i);
		}
	}

}
