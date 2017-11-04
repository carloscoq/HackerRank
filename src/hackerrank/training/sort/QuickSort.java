package hackerrank.training.sort;

public class QuickSort {

	private static int[] numbers;
	private static int number;
	
	
	public static void main(String[] args) {
		int[] values = new int[]{17,15,78,1,3,5,9,14,13,12,11,10,8,16,20,21,23,25,24};
		QuickSort quickSort = new QuickSort();
		
		quickSort.sort(values);
		
		for(int n: numbers){
			System.out.print(n+" ");
		}
	}
	
	public void sort(int[] values){
		numbers = values;
		number = values.length;
		
		quicksort(0, number-1);
	}
	
	private void quicksort(int low, int high){
		int i= low;
		int j = high;
		
		int pivot = numbers[low + (high-low)/2];
		
		while(i<= j){
			
			while(numbers[i] < pivot){
				i++;
			}
			
			while(numbers[j] > pivot){
				j--;
			}
			
			if(i<= j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		
		if(low<j){
			quicksort(low,j);
		}
		if(i<high){
			quicksort(i,high);
		}
	}
	
	private void exchange(int i, int j){
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		for(int n: numbers){
			System.out.print(n+ " ");
		}
		System.out.println("");
	}
}
