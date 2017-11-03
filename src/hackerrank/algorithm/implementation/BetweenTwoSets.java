package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class BetweenTwoSets {
	static int getTotalX(int[] a, int[] b) {
		int total = 0;
		int x = findHighestFromA(a);
		int menorB = findLowestFromB(b);
		
		while(x<=menorB){
/*			System.out.println("valor de x: "+x);
*/			int countA = 0;
			int countB = 0;
			for(int i = 0; i< a.length; i++){
				if(x%a[i] == 0){
/*					System.out.println("encontrado: "+x+ "valor a: "+ a[i]);
*/					countA++;
				}
			}
			System.out.println("contador: "+ countA);
			if(countA == a.length){
				
				for (int i : b) {
					if(i%x == 0){
/*						System.out.println("encontrado: "+x+" valor b: "+i );
*/						countB++;
					}
				}
				if(countB == b.length){
					
					total++;
				}
			}
			x++;
		}
		
		return total;
	}
	
	static int findHighestFromA(int[] a){
		int highestA = 0;
		
		for (int i = 0; i<a.length; i++){
			if(a[i] > highestA){
				highestA = a[i];
			}
		}
		
		return highestA;
	}
	
	static int findLowestFromB(int[] b){
		int lowest = 100;
		
		for (int i = 0; i<b.length; i++){
			if(b[i] < lowest){
				lowest = b[i];
			}
		}
		
		return lowest;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for(int b_i = 0; b_i < m; b_i++){
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}
}
