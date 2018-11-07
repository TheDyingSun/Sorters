package net.lunatecs;

public class OneArraySort {

	public static void main(String[] args) {
		
		int[] array = {69,32,420};
		
		
		if(array.length <= 1) { //if for switch
			
			switch(array.length){
				
				case 0:
					System.out.println("No values present. Cannot preform sort.");
					break;
					
				case 1:
					System.out.println("Insufficient variables to sort. Returning variable: ");
					System.out.print(array[0]);
					break;	
			}//end of switch
			
		}else{ //else that runs sort
			
			OneArraySort preform = new OneArraySort();
			preform.sort(array);
			
		}//End of checking array length if else statement
		
	}//End to main method
	
	public void sort(int[] array){
		
		//for(int place; place > 0; place++){
			
		for(int passes = 1; passes >= 1 ;) {
			
			passes = 0;
			
			for(int fight = 0; fight < (array.length - 1); fight ++) {
			//Brings one number to the front
				int fighterOne = array[fight];
				int fighterTwo = array[fight+1];
				
					if(fighterOne > fighterTwo) {
					
						array[fight] = fighterTwo;
						array[fight+1] = fighterOne;
						
						passes++;
					}
						
				}
			
		}//End of entering loop
		
			for(int place = 0; place < array.length; place ++) {
				//Prints Array Systematically
				System.out.print(array[place] + " ");
			}
			
	}//End of sort class
	
}//End to head class declaration