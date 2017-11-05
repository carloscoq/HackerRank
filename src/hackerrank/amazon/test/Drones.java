package hackerrank.amazon.test;

import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Drones {

	
	/*
	 * Complete the function below.
	 */

	    static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
	    		List<Integer> selectedDrones = new ArrayList<>();
	    		
	    		int n = drones.size(); // auxiliary for sort
	    		int k = drones.size()-1; // auxiliary for selection
	    		  
	    		//quicksort the drones list
	    		quicksort (drones, 0, drones.size()-1);
	    		
	 	        //selects the greatest fliying drones, if not in maintenance
	    		while(selectedDrones.size() < numberOfRequiredDrones && k>=0){
	    			if(!inMaintenanceDrones.contains(drones.get(k).getId())){
	    				selectedDrones.add(drones.get(k).getId());
	    			}
	    			k--;

	    		}
	    		
	    		return selectedDrones;
	    }
	    
	    private static void quicksort( List<Drone> drones, int low, int high){
			int i= low;
			int j = high;
			
			Drone pivot = drones.get(low + (high-low)/2);
			
			while(i<= j){
				
				while(drones.get(i).getFlightRange() < pivot.getFlightRange()){
					i++;
				}
				
				while(drones.get(j).getFlightRange() > pivot.getFlightRange()){
					j--;
				}
				
				if(i<= j){
					Collections.swap(drones, i, j);
					/*exchange(i,j);*/
					i++;
					j--;
				}
			}
			
			if(low<j){
				quicksort(drones,low,j);
			}
			if(i<high){
				quicksort(drones,i,high);
			}
		}
	    
	    
	    
	    public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int numberOfDrones = in.nextInt();
			int numberOfRequiredDrones = in.nextInt();
			int numberOfDronesInMaintenance = in.nextInt();
			
			List<Drone> drones = new ArrayList<>();
			
			List<Integer> inMaintenanceDrones = new ArrayList<>();
			
			for(int i = 0; i<numberOfDrones; i++){
				drones.add(new Drone(in.nextInt(), in.nextInt()));
			}
			
			for(int i = 0; i<numberOfDronesInMaintenance; i++){
				inMaintenanceDrones.add(in.nextInt());
			}
			
			List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);
			
			for(int i = 0; i<greatestFlightRangeDrones.size(); i++){
				System.out.println(greatestFlightRangeDrones.get(i));
			}
			
		}
	    
	    private static class Drone{
	    	private int id;
	    	private int flightRange;
	    	
	    	public Drone(int id, int flightRange){
	    		this.id = id;
	    		this.flightRange = flightRange;
	    	}
	    	
	    	public int getId(){
	    		return id;
	    	}
	    	
	    	public int getFlightRange(){
	    		return flightRange;
	    	}
	    }
}
