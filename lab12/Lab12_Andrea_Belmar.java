/*
 *
 * this program returns the likelyhood of rolling certain sums of dice rolls
 *
 */



public class Lab12_Andrea_Belmar {

	public static void main(String[] args){
	
		//
		int[] nums = new int[11];

		nums = rollDice();
		int[] sortedNums = sortResults(nums);

		//prints out the likely hood of rolling each option
		for(int i = 0; i < nums.length; i++){
		
			double probs = nums[i]/10000.0 * 100.0;
			System.out.printf("The probability of rolling a %d is %.2f%%%n", sortedNums[i], probs);
		}
		
	}
	//returns an array of random numbers
	public static int[] rollDice(){

		//each position holds the number of times a number has been rolled eg:
		//2 - 0
		//3 - 1
		//4 - 2
		//5 - 3
		//...
		//12 - 10
		int[] rolls = new int[11];

		//iterates 10000 times
		for(int i = 0; i < 10000; i++ ){
		
			//creates two random numbers between 1-6
			//adds the two numbers
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;

			int sum = num1 + num2;

			//based on the sum, adds up te number of times that sum occurred
			switch (sum){
				case 2:
					rolls[sum - 2] += 1;
					break;
				case 3:
					rolls[sum - 2] += 1;
					break;
				case 4:
					rolls[sum - 2] += 1;
					break;
				case 5:
					rolls[sum - 2] += 1;
					break;
				case 6:
					rolls[sum - 2] += 1;
					break;
				case 7:
					rolls[sum - 2] += 1;
					break;
				case 8:
					rolls[sum - 2] += 1;
					break;
				case 9:
					rolls[sum - 2] += 1;
					break;
				case 10:
					rolls[sum - 2] += 1;
					break;
				case 11:
					rolls[sum - 2] += 1;
					break;
				case 12:
					rolls[sum - 2] += 1;
					break;

			}
		}
		return rolls;
	
	}
	//returns a sorted one dimensional array
	public static int[] sortResults(int[] array){
		int[] sortArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		//does a bubble sort on the dice rolls and edits sortArray to match the new order as well
		for(int step = 0; step < array.length - 1; step++){
		
			for(int index = 0; index < array.length - step -1; index++){
			
				if (array[index] > array[index + 1]){
				
					int temp = array[index];
					int temp2 = sortArray[index];
					array[index] = array[index + 1];
					sortArray[index] = sortArray[index +1];
					array[index + 1] = temp;
					sortArray[index + 1] = temp2;
				}
			}
		}

		return sortArray;
	}


}
