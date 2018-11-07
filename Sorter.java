package net.lunatecs;

public class Sorter {
	
	public static void main(String[] args) {
		
		System.out.println("Sorter Active and Alive");
		//This line along with many others will be used to keep track of which systems are properly working
		
		Sorter sortArray = new Sorter();
				
		sortArray.sort();
		
		int[] arr = {7,0,3,2,2,2
				};
		
		if (arr.length > 1) {
			
			System.out.println("initializing sort");
			
			//Sets up score-board array
			int[]wins;
			wins = new int[arr.length];
			
				for(int pos = 0; pos < arr.length; pos++) {

					//resets score to 0 for use of another number
					
					for(int fighter = 0; fighter < arr.length; fighter++ ) {
						//System.out.println("Fighters Ready");
						//Experimentation shows that the line "Fighters Ready" should print the array length cubed 
						//The number of times this prints is how many comparisons are made
						if(arr[pos] > arr[fighter]) {
							
							//System.out.println("Winner!");
							wins[pos]++;
							
						} /*else {
							
							//System.out.println("Loser...")
						}
						Code became defunct as it's only purpose was to show the code was accesible during programming.
						*/
					}
					
					
					if (pos < arr.length ){
						
					
					}
					
				}
				
			int[] finalSort;
			
			finalSort = new int[arr.length];
			
			for(int finPos = 0; finPos < arr.length; finPos++){
				
							finalSort[wins[finPos]] = arr[finPos];
				
				}		
				
				//finalSort[wins[finPos]]= arr[finPos];
			// TODO Create code that fixes the same numbers going to one spot.
			// May have to create an if else statement that tries to catch the discrepancy early on.
				
			
				
			for(int place = 0; place < arr.length; place ++) {
				//Prints Array Systematically
				System.out.print(finalSort[place] + " ");
	
			}
			
		} else { 
			//This Switch is if the array entered does not have sufficient numbers
			
			switch(arr.length) {

				case 0:
					System.out.println("No numbers exist in array. Sort cannot be initialized.");
					break;
				
				case 1:
					System.out.println("Only one number in array, cannot sort. Returning array...");
					System.out.println(arr[0]);
					break;
			
			}
		
		}
		
	}
	

	public int[] sort(){
		
		System.out.println("Hello from array calculate");

		return new int[0];
		
	}//End of sort method
	
}//End of class declaration