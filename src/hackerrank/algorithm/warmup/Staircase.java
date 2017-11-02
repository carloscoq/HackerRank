package hackerrank.algorithm.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Staircase s = new Staircase();
        
        for(int i=1;i<=n;i++){
            s.printSpaces(n-i,i);
        }
    }
    
    public void printSpaces(int i,int k){
        String s = "";
        String h = "";
        for(int j=i;j>0;j--){
            s+=" ";
        }
        for(int x = 0; x<k;x++){
            h+="#";
        }
        System.out.println(s+h);
    }
}
