/*
 *
 */

public class Lab11_Andrea_Belmar {

	public static void main(String[] args){
	
		//prints all 3 methods
		System.out.println("single 6 sided die: "+roll());
		System.out.println("a 20 sided die: "+roll(20));
		System.out.println("2 6 sided dice: "+roll(6, 6));

		//holds how many times snakeeyes is rolled
		int snakeEyes = 0;

		//will roll 2 6 sided dice 10000 times and count how many snake eyes were rolled
		for(int i = 0; i < 10000; i++){
		
			if(roll(6, 6) == 2){
				snakeEyes++;
			}
		}
		//prints the proablity that 2 1s were rolled for 2 6 sided dice
		System.out.println("The probability of rolling snake eyes is: " + (snakeEyes)/100.0 + "%");
	}
	//will roll a 6 sided die
	public static int roll(){
	
		return (int) (Math.random() * 6) + 1;
	}
	//will roll an n-sided die
	public static int roll(int n){
	
		return (int) (Math.random() * n) + 1;
	}
	//will roll 2 dice of n sides and return the sum
	public static int roll(int n, int m){
	
		return ((int) (Math.random() * n) + 1) + ((int) (Math.random() * m) + 1);
	}
}
