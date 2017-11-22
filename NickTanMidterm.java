
public class NickTanMidterm {

	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}

	static void draw(double i, double n, double x, double y, double length, double angle) {

		double nx, ny, sx, sy;
		if (n >= i) {

			if (i % 2 == 1) {
				StdDraw.setPenColor(255, 0, 0);
				StdDraw.filledCircle(x, y, length);
			}

			if (i % 2 == 0) {
				StdDraw.setPenColor(0, 0, 0);
				StdDraw.filledCircle(x, y, length);
			}

			length = length / 2;
			nx = (length) * Math.cos(angle + Math.PI / 2) + x;
			ny = (length) * Math.sin(angle + Math.PI / 2) + y;
			sx = (length) * Math.cos(angle - Math.PI / 2) + x;
			sy = (length) * Math.sin(angle - Math.PI / 2) + y;

			draw(i + 1, n, nx, ny, length, angle + Math.PI / 2);
			draw(i + 1, n, sx, sy, length, angle - Math.PI / 2);
		}
//		StdDraw.show();
	}

	public static void main(String[] args) {
		double i, n, x, y, length, angle;

		System.out.printf("How deep?\n");
		n = StdIn.readDouble();
		length = 250;
		angle = 0;
		x = 300;
		y = 300;
		i = 1;

		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(0, 0, 0);

		
		if (n <= 0) {
			StdDraw.text(300, 300, "Nothing");
			StdDraw.show();
			exitOnClick();
		}

		draw(i, n, x, y, length, angle);
		StdDraw.show();
		exitOnClick();

	}

}
