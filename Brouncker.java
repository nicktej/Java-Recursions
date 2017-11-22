
public class Brouncker {

	static double pi(double n, double i) {

		double b;

		if (i > n){
			return -1;
		}
		
		b = (i * i) / (2 + pi(n, i + 2));
		return b;
	}

	public static void main(String[] args) {

		double n, i;
		double x, y;

		System.out.printf("How deep (only nonnegative odd integers)?\n");
		n = StdIn.readDouble();
		i = 1;
		y = pi(n, i);

		x = 4 / (1 + y);

		System.out.printf("PI is\n");
		StdOut.print(x);

	}

}
