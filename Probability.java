
public class Probability {

	static double pow(double x, double y){
		
		if (y == 0){
			return 1;
		}
		return (x*pow(x, y - 1.0));
	}
	
	static double sum(double n, double k){
		
		double ans;
		
		if (k == 0){
			return 1;
		}
		
		if (n == 0){
			System.exit(0) ;
		}
		
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
	
	static double prob(double n, double k, double p, double q){
		
		return sum(n, k) * pow(p,k) * pow(q, n-k);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, p ,q, n, k, a;
		
		System.out.printf("How many marbles?\n");
		x = StdIn.readDouble();
		
		System.out.printf("How many red?\n");
		y = StdIn.readDouble();
		
		System.out.printf("How many chosen?\n");
		n = StdIn.readDouble();
		
		System.out.printf("How many chosen are exactly red?\n");
		k = StdIn.readDouble();
		
		p = y/x;
		q = 1 - p;
		
		a = prob(n, k, p, q);
		
		StdOut.print(a);
	}

}
