public class Problem_006_SumSquareDifference {

	public static void main(String[] args) {
		int num = 100;
		System.out.print(SquareOfSum(num)-SumOfSquares(num));
		
	}
	
	public static long SumOfSquares(int UpTo){
		int total = 0;
		for(int i = 1; i<=UpTo;i++)
			total+=(i*i);
		return total;
	}
	public static long SquareOfSum(int UpTo){
		return (long) Math.pow(((UpTo+1)*(UpTo))/2,2);
	}

}
