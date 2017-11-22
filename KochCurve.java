
public class KochCurve {

	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}

	static void draw(int k, int n, double x1, double x2, double x3, double x4, double x5, double y1, double y2,
			double y3, double y4, double y5, double length, double angle) {
		

		if (n > 1) {

			// x1 = x5;
			x2 = length * Math.cos(angle) + x1;
			x3 = length * Math.cos(angle + Math.PI / 3) + x2;
			x4 = length * Math.cos(angle - Math.PI / 3) + x3;
			x5 = length * Math.cos(angle) + x4;
			// y1 = y5;
			y2 = length * Math.sin(angle) + y1;
			y3 = length * Math.sin(angle + Math.PI / 3) + y2;
			y4 = length * Math.sin(angle - Math.PI / 3) + y3;
			y5 = length * Math.sin(angle) + y4;

			draw(k, n - 1, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, length / 3, angle);

			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x4, y4, x5, y5);

			x1 = x5;
			x2 = length * Math.cos(angle + Math.PI / 3) + x1;
			x3 = length * Math.cos(angle + 2 * Math.PI / 3) + x2;
			x4 = length * Math.cos(angle) + x3;
			x5 = length * Math.cos(angle + Math.PI / 3) + x4;
			y1 = y5;
			y2 = length * Math.sin(angle + Math.PI / 3) + y1;
			y3 = length * Math.sin(angle + 2 * Math.PI / 3) + y2;
			y4 = length * Math.sin(angle) + y3;
			y5 = length * Math.sin(angle + Math.PI / 3) + y4;

			draw(k, n - 1, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, length / 3, angle);

			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x4, y4, x5, y5);

			x1 = x5;
			x2 = length * Math.cos(angle - Math.PI / 3) + x1;
			x3 = length * Math.cos(angle) + x2;
			x4 = length * Math.cos(angle - 2 * Math.PI / 3) + x3;
			x5 = length * Math.cos(angle - Math.PI / 3) + x4;
			y1 = y5;
			y2 = length * Math.sin(angle - Math.PI / 3) + y1;
			y3 = length * Math.sin(angle) + y2;
			y4 = length * Math.sin(angle - 2 * Math.PI / 3) + y3;
			y5 = length * Math.sin(angle - Math.PI / 3) + y4;

			draw(k, n - 1, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, length / 3, angle);

			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x4, y4, x5, y5);

			x1 = x5;
			x2 = length * Math.cos(angle) + x1;
			x3 = length * Math.cos(angle + Math.PI / 3) + x2;
			x4 = length * Math.cos(angle - Math.PI / 3) + x3;
			x5 = length * Math.cos(angle) + x4;
			y1 = y5;
			y2 = length * Math.sin(angle) + y1;
			y3 = length * Math.sin(angle + Math.PI / 3) + y2;
			y4 = length * Math.sin(angle - Math.PI / 3) + y3;
			y5 = length * Math.sin(angle) + y4;

			draw(k, n - 1, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, length / 3, angle);

			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x4, y4, x5, y5);

			x1 = x5;
			y1 = y5;
			
			StdDraw.show();
			exitOnClick();

		}
//
//		if(n > 1){
//		draw(k, n - 1, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, length / 3, angle);
//		}

	}

	public static void main(String[] args) {
		int n, k;
		double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, length, angle;

		System.out.printf("How deep?\n");
		n = StdIn.readInt();
		k = n;
		length = 150;
		angle = 0;

		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(550, 550);
		StdDraw.setScale(0, 549);
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(0, 0, 0);

		x1 = 50;
		y1 = 50;
		x2 = 200;
		y2 = 50;
		x3 = 275;
		y3 = 180;
		x4 = 350;
		y4 = 50;
		x5 = 500;
		y5 = 50;

		if (n == 1) {
			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x4, y4, x5, y5);
			StdDraw.show();
			exitOnClick();
		}

		draw(k, n, x1, x2, x3, x4, x5, y1, y2, y3, y4, y5, length/3, angle);

		StdDraw.show();
		exitOnClick();

	}

}
