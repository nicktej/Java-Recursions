
public class GoldenTriangle {

	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}

	static void draw(int t, int n, double[] x, double[] y, double z) {

		double a, b, c, d;

		a = x[1] - x[0];
		b = y[3] - y[0];
		c = y[2] - y[1];
		d = x[2] - x[3];
		
		if (n > 1) {
			if (a > b || d > c) {
				
				if(t%4 == 0){
				x[0] = x[0] + b;
				x[3] = x[3] + b;
				

				StdDraw.line(x[0], y[0], x[1], y[1]);
				StdDraw.line(x[1], y[1], x[2], y[2]);
				StdDraw.line(x[2], y[2], x[3], y[3]);
				StdDraw.line(x[3], y[3], x[0], y[0]);
				StdDraw.show();
				t++;
				}
				
				if(t%4 == 2){
					x[2] = x[2] - c;
					x[1] = x[1] - c;

					StdDraw.line(x[0], y[0], x[1], y[1]);
					StdDraw.line(x[1], y[1], x[2], y[2]);
					StdDraw.line(x[2], y[2], x[3], y[3]);
					StdDraw.line(x[3], y[3], x[0], y[0]);
					StdDraw.show();
					t++;
					}
				
			}

			else if (b > a) {
				if(t%4 == 1){
				y[0] = y[0] + a;
				y[1] = y[1] + a;

				StdDraw.line(x[0], y[0], x[1], y[1]);
				StdDraw.line(x[1], y[1], x[2], y[2]);
				StdDraw.line(x[2], y[2], x[3], y[3]);
				StdDraw.line(x[3], y[3], x[0], y[0]);
				StdDraw.show();
				t++;
			}

				if(t%4 == 3){
					y[2] = y[2] - d;
					y[3] = y[3] - d;

					StdDraw.line(x[0], y[0], x[1], y[1]);
					StdDraw.line(x[1], y[1], x[2], y[2]);
					StdDraw.line(x[2], y[2], x[3], y[3]);
					StdDraw.line(x[3], y[3], x[0], y[0]);
					StdDraw.show();
					t++;
				}
			}
			draw(t, n - 1, x, y, z);
		}
			

	}

	public static void main(String[] args) {
		int n, t;
		double[] x = new double[4];
		double[] y = new double[4];
		double z = 1.61803398875;

		System.out.printf("Type in how many rectangles\n");
		n = StdIn.readInt();
		t = 0;
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(0, 0, 0);

		x[0] = 100;
		y[0] = 100;
		x[1] = 500;
		y[1] = 100;
		x[2] = 500;
		y[2] = 100 + 400 / z;
		x[3] = 100;
		y[3] = 100 + 400 / z;

		// basecase1
		if (n >= 1) {
			StdDraw.line(x[0], y[0], x[1], y[1]);
			StdDraw.line(x[1], y[1], x[2], y[2]);
			StdDraw.line(x[2], y[2], x[3], y[3]);
			StdDraw.line(x[3], y[3], x[0], y[0]);
		}

		// basecase2
		if (n <= 0) {
			StdDraw.text(300, 300, "Nothing");
			StdDraw.show();
			exitOnClick();
		}

		draw(t, n, x, y, z);
		StdDraw.show();
		exitOnClick();
	}

}
