package hackerrank.algorithm.warmup;

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite o numero");
        int n = in.nextInt();
        
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
            	System.out.println("digite o valor da posicao "+a_i+"-"+a_j);
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        Solution4 s = new Solution4();
        
        System.out.println(s.matrixComparator(n,a));
    }
    
    /**
     * @param n
     * @param a
     * @return
     */
    public int matrixComparator(int n, int[][] a){
        System.out.println("somando...");
    	int sumd1 = 0;
        int sumd2 = 0;
        
        for(int i = 0; i<n;i++){
                for(int j = 0; j<n;j++){
                    if(i==j){
                        sumd1 = sumd1+a[i][j];
                    }
                }
        }
        
        int c = n-1;
        
        for(int i = 0; i<n;i++){
        	sumd2 = sumd2+a[i][c];
        	c--;
        }
        System.out.println("soma d1:"+sumd1);
        System.out.println("soma d2:"+sumd2);
        
        return +Math.abs(sumd1-sumd2);
    }
}