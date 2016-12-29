
public class Problem_010_SummationOfPrimes {

	public static void main(String[] args) {
		PrimeNumberTest primeObj = new PrimeNumberTest();
		long sum = 2;
		for(int i = 3;i<=2000000;i+=2){
			if (primeObj.PrimeCheck(i) == 1){
				sum+=i;
			}
			
		}
		System.out.println("answer: "+sum);
	}

}
