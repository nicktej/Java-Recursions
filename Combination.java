
public class Combination {

	static int sum(int n, int k) { 
		int ans;
		//first base case
		if (k==n){
			return 1;
		}
		
		//second base case
		if (k==1){
		return n;
		}
	
		ans=sum(n-1, k)+sum(n-1, k-1);
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum, n, k ;
		
		System.out.printf("Type in n\n") ;
		n = StdIn.readInt() ;
		
		System.out.printf("Type in k, smaller than n\n") ;
		k = StdIn.readInt() ;
		
		sum=sum(n, k);
		
		System.out.printf("Your combination is\n") ;
		StdOut.print(sum) ;

	}

}
