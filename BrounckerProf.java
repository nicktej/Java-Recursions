
public class BrounckerProf {

	static double pi(double n, double i) {

		if (i == 1) {
			if (i == n) {
				return 2.0;
			}
			return (1 + i * i / (pi(n, i + 2)));
		}

		else {
			if (i == n) {
				return (2 + n * n);
			}
			return (2 + i * i / pi(n, i + 2));
		}
	}

	public static void main(String[] args) {

		double n, i;
		double y, x;

		System.out.printf("How deep (only nonnegative odd integers)?\n");
		n = StdIn.readDouble();
		i = 1;
		y = pi(n, i);

		x = 4/y;
		System.out.printf("PI is\n");
		StdOut.print(x);

	}

}