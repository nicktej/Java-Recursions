
public class ThreeD {

	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}

	static void draw(int n, double x1, double y1, double angle) {

		double x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7;
		double[] x = new double[4];
		double[] y = new double[4];

		if (n > 0) {
			// point2
			x2 = 30 * Math.cos(angle) + x1;
			y2 = 30 * Math.sin(angle) + y1;

			// point3
			x3 = 50 * Math.cos(angle + Math.PI / 2) + x2;
			y3 = 50 * Math.sin(angle + Math.PI / 2) + y2;

			// point4
			x4 = 50 * Math.cos(angle + Math.PI / 2) + x1;
			y4 = 50 * Math.sin(angle + Math.PI / 2) + y1;

			// point5
			x5 = 40 * Math.cos(angle - 2 * Math.PI / 3) + x4;
			y5 = 40 * Math.sin(angle - 2 * Math.PI / 3) + y4;

			// point6
			x6 = 40 * Math.cos(angle - 2 * Math.PI / 3) + x1;
			y6 = 40 * Math.sin(angle - 2 * Math.PI / 3) + y1;

			// point7
			x7 = 30 * Math.cos(angle) + x6;
			y7 = 30 * Math.sin(angle) + y6;

			// polygon1
			x[0] = x1;
			y[0] = y1;
			x[1] = x2;
			y[1] = y2;
			x[2] = x3;
			y[2] = y3;
			x[3] = x4;
			y[3] = y4;
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.filledPolygon(x, y);
			StdDraw.setPenColor(0, 0, 0);

			// polygon2
			x[0] = x1;
			y[0] = y1;
			x[1] = x4;
			y[1] = y4;
			x[2] = x5;
			y[2] = y5;
			x[3] = x6;
			y[3] = y6;
			StdDraw.setPenColor(155, 0, 0);
			StdDraw.filledPolygon(x, y);
			StdDraw.setPenColor(0, 0, 0);

			// polygon3
			x[0] = x1;
			y[0] = y1;
			x[1] = x2;
			y[1] = y2;
			x[2] = x7;
			y[2] = y7;
			x[3] = x6;
			y[3] = y6;
			StdDraw.setPenColor(105, 0, 0);
			StdDraw.filledPolygon(x, y);
			StdDraw.setPenColor(0, 0, 0);

			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x1, y1, x4, y4);
			StdDraw.line(x4, y4, x5, y5);
			StdDraw.line(x5, y5, x6, y6);
			StdDraw.line(x6, y6, x7, y7);
			StdDraw.line(x1, y1, x6, y6);
			StdDraw.line(x2, y2, x7, y7);
		
//			x1 = 40 * Math.cos(angle + Math.PI/3) + x2;
//			y1 = 40 * Math.sin(angle + Math.PI/3) + y2;
			draw(n-1, 40 * Math.cos(angle + Math.PI/3) + x2, 40 * Math.sin(angle + Math.PI/3) + y2, angle);
			
//			x1 = 50 * Math.cos(angle - Math.PI/2) + x2;
//			y1 = 50 * Math.sin(angle - Math.PI/2) + y2;
			draw(n-1, 50 * Math.cos(angle - Math.PI/2) + x2, 50 * Math.sin(angle - Math.PI/2) + y2, angle);
		}
		
	}

	public static void main(String[] args) {
		int n;
		double x1, y1, angle;

		System.out.printf("How deep?\n");
		n = StdIn.readInt();
		angle = 0;

		x1 = 50;
		y1 = 300;

		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(0, 0, 0);

		draw(n, x1, y1, angle);

		StdDraw.show();
		exitOnClick();

	}

}
