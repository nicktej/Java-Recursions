
public class GoldenRatioProf {

	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}

	static void my_procedure(double x, double y, double angle, double s, double depth) {

		double x1, y1, x2, y2, x3, y3, l;

		if (depth > 1) {

			x1 = s * Math.cos(angle) + x;
			y1 = s * Math.sin(angle) + y;
			x2 = s * Math.cos(angle + Math.PI / 2) + x1;
			y2 = s * Math.sin(angle + Math.PI / 2) + y1;

			StdDraw.line(x1, y1, x2, y2);

			x3 = (s * 1.61803398875) * Math.cos(angle) + x;
			y3 = (s * 1.61803398875) * Math.sin(angle) + y;

			l = s * 1.61803398875;

			my_procedure(x3, y3, angle + Math.PI / 2, l - s, depth - 1);
		}

	}

	static void my_otherprocedure(double x1, double y1, double x2, double y2, double s, double l, double depth,
			double start) {

		double x3, y3, x4, y4;

		if (start < depth) {
			if (start % 2 == 1) {

				StdDraw.line(x1, y1, x2, y2);

				x3 = x1;
				y3 = y1 + l - s;
				x4 = x3 + l - s;
				y4 = y3;

				my_otherprocedure(x3, y3, x4, y4, l - s, s, depth, start + 1);

			}

			else {

				StdDraw.line(x1, y1, x2, y2);

				x3 = x1 + l - s;
				y3 = y1;
				x4 = x3;
				y4 = y3 + l - s;

				my_otherprocedure(x3, y3, x4, y4, l - s, s, depth, start + 1);
			}
		}

	}

	public static void main(String[] args) {

		double input;

		input = StdIn.readDouble();
//		start = 1;

		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(0, 0, 0);

		// baserectangle
		StdDraw.line(50, 200, 50, 400);
		StdDraw.line(50, 400, 50 + 200 * 1.61803398875, 400);
		StdDraw.line(50 + 200 * 1.61803398875, 400, 50 + 200 * 1.61803398875, 200);
		StdDraw.line(50 + 200 * 1.61803398875, 200, 50, 200);

		my_procedure(50, 200, 0, 200, input);
		
		//doesn't work yet lol
//		my_otherprocedure(50, 200, 50, 400, 200, 200 * 1.61803398875, input, start);
		StdDraw.show();
		exitOnClick();

	}

}
