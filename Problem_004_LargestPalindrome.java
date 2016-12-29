
public class Problem_004_LargestPalindrome {

	public static void main(String[] args) {
		int biggest=0;

		for(int a=1;a<=9;a++){
			for(int b=0;b<=9;b++){
				for(int c=0; c<=9;c++)
					for(int i=100; i<1000;i++){
						if((100000*a+10000*b+1000*c+100*c+10*b+a)%i == 0 && (100000*a+10000*b+1000*c+100*c+10*b+a)/i <1000){
							biggest = (100000*a+10000*b+1000*c+100*c+10*b+a);
						}


					}
			}
		}
		System.out.println(biggest);
	}
}


