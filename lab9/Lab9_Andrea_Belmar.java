/*
 *
 */

public class Lab9_Andrea_Belmar{

	static public void main(String[] args){
	
		//each variable holds how many times the die landed on that face
		int face1, face2, face3, face4, face5, face6;
		face1=face2=face3=face4=face5=face6=0;
		int roll;

		//rolls the die 10000 times
		for (int i =0; i < 10000; i++){
	
			//creates a random number between 1-6	
			roll = (int)(Math.random()*6) + 1;
			//increments the sum of times the die landed on face 1-6
			switch (roll){
				case 1:
					face1++;
					break;
				case 2:
					face2++;
					break;
				case 3:
					face3++;
					break;
				case 4:
					face4++;
					break;
				case 5:
					face5++;
					break;
				case 6:
					face6++;
					break;
			}
		}

		System.out.printf("The total amount of ones rolled is %d. The probability of rolling a one is %.2f%%.%n", face1, (double)face1/10000 * 100);
		System.out.printf("The total amount of twos rolled is %d. The probability of rolling a one is %.2f%%.%n", face2, (double)face2/10000 * 100);
		System.out.printf("The total amount of threes rolled is %d. The probability of rolling a one is %.2f%%.%n", face3, (double)face3/10000 * 100);
		System.out.printf("The total amount of fours rolled is %d. The probability of rolling a one is %.2f%%.%n", face4, (double)face4/10000 * 100);
		System.out.printf("The total amount of fives rolled is %d. The probability of rolling a one is %.2f%%.%n", face5, (double)face5/10000 * 100);
		System.out.printf("The total amount of sixes rolled is %d. The probability of rolling a one is %.2f%%.%n", face6, (double)face6/10000 * 100);

	}
}
