
public class KochCurve2 {
	
	static void exitOnClick() {
		while (StdDraw.mousePressed() == false) {
		}
		System.exit(0);
	}
	
	static void draw(int n, double x1, double y1, double angle, double length){
		
		double x2, y2, tx, ty, mx, my; 
		
		if (n > 1){
			
			draw(n-1, x1, y1, angle, length/3);
			
			x2 = length * Math.cos(angle) + x1;
			y2 = length * Math.sin(angle) + y1;
			draw(n-1, x2, y2, angle + Math.PI/3, length/3);
			
			x1 = x2;
			y1 = y2;
			x2 = length * Math.cos(angle + Math.PI/3) + x1;
			y2 = length * Math.sin(angle + Math.PI/3) + y1;
			draw(n-1, x2, y2, angle - Math.PI/3, length/3);
			
			x1 = x2;
			y1 = y2;
			x2 = length * Math.cos(angle - Math.PI/3) + x1;
			y2 = length * Math.sin(angle - Math.PI/3) + y1;
			draw(n-1, x2, y2, angle, length/3);
			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle) + x1;
//			y2 = length * Math.sin(angle) + y1;
//			draw(n-1, x2, y2, angle - 2*Math.PI/3, length/3);
//
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 2*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 2*Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle - Math.PI/3, length/3);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle - 3*Math.PI/3, length/3);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 3*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 3*Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle - 2*Math.PI/3, length/3);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 2*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 2*Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle - 4*Math.PI/3, length/3);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 4*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 4*Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle - 3*Math.PI/3, length/3);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 3*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 3*Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle + Math.PI/3, length/3);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle + Math.PI/3) + x1;
//			y2 = length * Math.sin(angle + Math.PI/3) + y1;
//			draw(n-1, x2, y2, angle + 2*Math.PI/3, length/3);
		}
		
		else {
			
			x2 = length * Math.cos(angle) + x1;
			y2 = length * Math.sin(angle) + y1;
			StdDraw.line(x1, y1, x2, y2);
			
			x1 = x2;
			y1 = y2;
			tx = x1;
			ty = y1;
			x2 = length * Math.cos(angle + Math.PI/3) + x1;
			y2 = length * Math.sin(angle + Math.PI/3) + y1;
			StdDraw.line(x1, y1, x2, y2);
			
			mx = length * Math.cos(angle - Math.PI/3) + tx;
			my = length * Math.sin(angle - Math.PI/3) + ty;
			StdDraw.line(tx, ty, mx, my);
			
			x1 = x2;
			y1 = y2;
			x2 = length * Math.cos(angle - Math.PI/3) + x1;
			y2 = length * Math.sin(angle - Math.PI/3) + y1;
			StdDraw.line(x1, y1, x2, y2);
			
			tx = length * Math.cos(angle + Math.PI/3) + mx;
			ty = length * Math.sin(angle + Math.PI/3) + my;
			StdDraw.line(mx, my, tx, ty);
			
			x1 = x2;
			y1 = y2;
			x2 = length * Math.cos(angle) + x1;
			y2 = length * Math.sin(angle) + y1;
			StdDraw.line(x1, y1, x2, y2);
			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 2*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 2*Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 3*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 3*Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 2*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 2*Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 4*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 4*Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle - 3*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle - 3*Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle + Math.PI/3) + x1;
//			y2 = length * Math.sin(angle + Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			
//			x1 = x2;
//			y1 = y2;
//			x2 = length * Math.cos(angle + 2*Math.PI/3) + x1;
//			y2 = length * Math.sin(angle + 2*Math.PI/3) + y1;
//			StdDraw.line(x1, y1, x2, y2);
//			StdDraw.show();
		}
	}

	public static void main(String[] args) {
		int n;
		double x1, y1, angle, length;
		
		System.out.printf("How deep?\n");
		n = StdIn.readInt();
		length = 150;
		angle = 0;

		x1 = 75;
		y1 = 400;
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(0, 0, 0);
		
		draw(n, x1, y1, angle, length);
		
		StdDraw.show();
		exitOnClick();

	}

}
