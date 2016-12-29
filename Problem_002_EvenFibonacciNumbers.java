
public class Problem_002_EvenFibonacciNumbers {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int fib = 0;
		long total = 0;
		for(int i = 0; fib < 4000000; i++){
			fib=num1+num2;
			num1=num2;
			num2=fib;
			if(fib%2==0){
				total+=fib;
			}
			
			
		}
		System.out.print(total);
	}

}
