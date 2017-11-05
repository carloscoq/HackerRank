package hackerrank.amazon.test;

import java.util.Scanner;

public class DeliverySystem {
	
	static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		int minimum = 0;
		int sum = 0;
		int tempSum = 0;
		int numberOfPackages = packagesWeight.length;
		int numberOfTrips = 0;
		
		
		
		//quicksort(packagesWeight, 0, numberOfPackages-1);
		
		for (int i = 0; i < packagesWeight.length; i++) {
			sum = packagesWeight[i];
			if(!(i ==packagesWeight.length-1)){
				if(sum+packagesWeight[i+1] >= tripMaxWeight){
					numberOfTrips++;
					continue;
				}
			}
			System.out.println(packagesWeight[i]);
		}
		
		
		
		return minimum;
		
    }
	
	private static void quicksort(int[] packages, int low, int high){
		int i= low;
		int j = high;
		
		int pivot = packages[low + (high-low)/2];
		
		while(i<= j){
			
			while(packages[i] < pivot){
				i++;
			}
			
			while(packages[j] > pivot){
				j--;
			}
			
			if(i<= j){
				exchange(packages, i,j);
				i++;
				j--;
			}
		}
		
		if(low<j){
			quicksort(packages, low,j);
		}
		if(i<high){
			quicksort( packages, i,high);
		}
	}
	
	private static void exchange(int[] packages, int i, int j){
		int temp = packages[i];
		packages[i] = packages[j];
		packages[j] = temp;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tripMaxWeight = in.nextInt();
		int numberOfPackages = in.nextInt();
		
		int[] packagesWeight = new int[numberOfPackages];
		
		for (int i = 0; i<numberOfPackages; i++){
			packagesWeight[i] = in.nextInt();
		}
		
		int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);
		
		System.out.println(minimumNumberOfTrips);
	}
}
