
public class Problem_001_MultiplesOf3and5 {

	public static void main(String[] args) {
		long total = 0;
			for(int i = 1; i<1000 ;i++){
				if (i%5 == 0 || i%3 == 0) total +=i;
			}
			System.out.println(total);
	}

}
