package hackerrank.algorithm.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;


public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Long[] sumArr = {0l,0l,0l,0l,0l};
        Long sum;
        
        
        for(int i = 0; i<arr.length; i++){
            sum = 0l;
            for(int j = 0; j<5; j++){
                if(i!=j){
                    sum+=arr[j];
                }
            }
        
           sumArr[i] = sum;
        }
        
        Long min = sumArr[0];
        Long max = sumArr[0];
        
        for(int k = 0; k<5;k++){
            if(sumArr[k]<min){
                min = sumArr[k];
            }else if(max < sumArr[k]){
                max = sumArr[k];
            }
        }
        
        System.out.print(min+""+max);
        
    }
}
