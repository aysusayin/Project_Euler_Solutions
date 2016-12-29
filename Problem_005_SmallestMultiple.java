
public class Problem_005_SmallestMultiple {

	public static void main(String[] args) {
		int total = 1;
		int num = 20;
		int biggest =0;
		for(int i=1;i<num;i++){
			if(PrimeCheck(i)== 1){
				int x=num;
				for(; x>0;x--){
					if(0<Math.pow(i, x)&& Math.pow(i, x)<num ){
						biggest=x;
						break;
					}
				}
				total*=Math.pow(i, x);
			}
		}
		
		System.out.print(total);
		
		
	}
	public static int PrimeCheck(long a){
		long testUpTo = (long)Math.sqrt(a);
		if(a == 1){
			return 0;
		}else if (a ==2){
			return 1;
		}else if(a%2==0){
			return 0;
		}else{
			for (int i = 3; i<=testUpTo; i+=2){
				if(a%i==0){
					return 0;
				}
			}
			return 1;
		}
	}
	}