
public class RecursionSum {

	static int my_sum(int n) {
		int ans ;
		
		//This is the base case. VERY IMPORTANT 
		if(n==1){ 
			return 1;
		}
		ans=n+my_sum(n-1);
		return ans;
	}
	
	public static void main(String[] args) {
		int sum, n ;
		
		System.out.printf("Type in a non-negative integer\n") ;
		n = StdIn.readInt() ;
		
		sum=my_sum(n) ;
		
		System.out.printf("Your answer, adding from 1 to n is\n") ;
		StdOut.print(sum) ;

	}

}
