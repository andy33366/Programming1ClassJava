/*
 *
 * monte carlo simulation
 *
 */


public class InClass9_Andrea_Belmar {

	static public void main(String[] args){
	
		//skdbf
		int coin1, coin2;

		int atLeastOne =0;
		int both = 0;
	        int exactOne = 0;


		// for 10,000 flip the coin
		for (int i = 0; i < 10000; i++) {

			//assign either 0 or 1 randomly
			//(int) (Math.random() * 2)
			coin1 = (int) Math.round(Math.random());
			coin2 = (int) Math.round(Math.random());
			
			if (coin1 == 1 || coin2 == 1){
			
				atLeastOne++;

				if (coin1 == 1 && coin2 == 1){
				
					both++;
				}
				else{
					exactOne++;
				}
			}

		}
		System.out.printf("There were %d trials with at least one result being heads.%n", atLeastOne);
		System.out.printf("There were %d trials with both results being heads.%n", both);
		System.out.printf("There were %d trials with exactly one result being heads.%n", exactOne);
		System.out.printf("If at least one coin flip is heads, the probability that both are heads is %.2f%%.%n", (double) both / atLeastOne * 100);
		System.out.printf("If at least one coin flip is heads, the probability that exactly one is heads is %.2f%%.%n", (double) exactOne / atLeastOne * 100);

	}

}
