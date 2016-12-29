
public class Problem_007_10001stPrime {

	public static void main(String[] args) {
		PrimeNumberTest PriObj = new PrimeNumberTest();
		int i=1;
		int thPrime = 10001;
		int counter = 0;
		while(true){
			if (PriObj.PrimeCheck(i) == 1){
				counter++;
				if (counter == thPrime){
					System.out.print(i);
					break;
				}
			}
			i++;
		}

	}

}
