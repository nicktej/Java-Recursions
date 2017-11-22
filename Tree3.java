
public class Tree3 {

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
			if(color > 30){
				StdDraw.setPenColor(color, color, color - 30);
			}
			
			tree(n - 1, nx, ny, length / 1.2, angle + Math.PI / 6, color - 20, th - 0.0004);
			
			if(th > 0.0001){
				StdDraw.setPenRadius(th);
			}
			if(color > 30){
				StdDraw.setPenColor(color, color, color - 30);
			}
			tree(n - 1, nx, ny, length / 1.2, angle - Math.PI / 6, color - 20, th - 0.0004);
			
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

		tree(n, 300, 300, 70, Math.PI / 3, 245, 0.005);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.setPenRadius(0.005);
		tree(n, 300, 300, 70, 2*Math.PI / 3, 245, 0.005);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.setPenRadius(0.005);
		tree(n, 300, 300, 70, Math.PI, 245, 0.005);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.setPenRadius(0.005);
		tree(n, 300, 300, 70, 4*Math.PI / 3, 245, 0.005);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.setPenRadius(0.005);
		tree(n, 300, 300, 70, 5*Math.PI / 3, 245, 0.005);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.setPenRadius(0.005);
		tree(n, 300, 300, 70, 6*Math.PI / 3, 245, 0.005);
		
		StdDraw.show();
		exitOnClick();
	}

}
