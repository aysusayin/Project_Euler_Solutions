/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class Problem_009_SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		
		for(long b=1;b<1000;b++){
			long a=1;
			while(b > a){
				
				if(a*a+b*b==(1000-b-a)*(1000-b-a)){
					System.out.println("a*b*c =" + a*b*(1000-b-a));
					break;
				}
				
				a++;
			}
		}
	}

}
