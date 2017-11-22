public class Tree2 {

	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}

	static void waitClick(double[] p) {
		while (StdDraw.mousePressed() == false) {
		}
		while (StdDraw.mousePressed() == true) {
		}
		p[0] = StdDraw.mouseX();
		p[1] = StdDraw.mouseY();
	}

	static void tree(int n, double x, double y, double length, double angle, int color, double th) {
		double nx, ny;

		nx = length * Math.cos(angle) + x;
		ny = length * Math.sin(angle) + y;

		StdDraw.line(x, y, nx, ny);
		//StdDraw.show();
		if (n > 0) {
			if(th > 0.0001){
				StdDraw.setPenRadius(th);
			}
			if(color > 0){
				StdDraw.setPenColor(color - 20, color + 5, color + 10);
			}
			
			tree(n - 1, nx, ny, length / 1.2, angle + 30*Math.PI/50, color - 10, th - 0.001);
			
			if(th > 0.0001){
				StdDraw.setPenRadius(th);
			}
			if(color > 0){
				StdDraw.setPenColor(color - 20, color + 5, color + 10);
			}
			tree(n - 1, nx, ny, length / 1.2, angle - Math.PI/15, color - 10, th - 0.001);
			
		}

	}

	public static void main(String[] args) {
		int n;

		System.out.printf("How many branches\n");
		n = StdIn.readInt();

		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.005);

		StdDraw.filledSquare(300, 300, 300);
		StdDraw.setPenColor(255, 255, 255);
		// base case 1
		if (n <= 0) {
			StdDraw.text(300, 300, "No Tree");
			StdDraw.show();
			exitOnClick();
		}

		tree(n, 300, 200, 80, Math.PI / 2, 245, 0.005);
		StdDraw.show();
		exitOnClick();
	}

}
