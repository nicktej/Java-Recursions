
public class Fibonacci {

	static int my_sum(int n) {
		int ans;
		//first base case
		if (n==1){
			return 0;
		}
		
		//second base case
		if (n==2){
		return 1;
		}
	
		ans=my_sum(n-1)+my_sum(n-2);
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum, n ;
		
		System.out.printf("Type in a non-negative integer\n") ;
		n = StdIn.readInt() ;
		
		sum=my_sum(n) ;
		
		System.out.printf("Your fibonacci sequence is\n") ;
		StdOut.print(sum) ;

	}

}
