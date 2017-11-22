
public class Squares {
	
	static void exitOnClick() {
		while(StdDraw.mousePressed() == false) { }
		System.exit(0) ;
	}
	
	static void draw(double n, double [] x, double [] y, int r, int g, int bl){
		double a, b;
		
		
		//Base Case 1
		if (n<=0){
			StdDraw.text(300, 300, "No Squares");
			StdDraw.show();
			exitOnClick();
		}
	
		//Base Case 2
		if (n==1){
			StdDraw.polygon(x, y);
			StdDraw.show();
			exitOnClick();
		}
		
		StdDraw.polygon(x, y);
		StdDraw.show();
	
		n--;
		
		if(n>0){
			
		/*	if (n==1 || n==4 || n== 7|| n==10){
				r=255; g=0; bl=0;
				}
			
			if (n==2 || n==5 || n== 8|| n==11){
				r=0; g=255; bl=0; 
				}
			
			if (n==3 || n==6 || n== 9|| n==12){
				r=0; g=0; bl=255;
				}
			
			StdDraw.setPenColor(r, g, bl);;; */
			a=x[0];						b=y[0];
			
			x[0]=(x[0]+x[1])/2;			y[0]=(y[0]+y[1])/2;
			x[1]=(x[1]+x[2])/2;			y[1]=(y[1]+y[2])/2;
			x[2]=(x[2]+x[3])/2;			y[2]=(y[2]+y[3])/2;
			x[3]=(x[3]+a)/2;			y[3]=(y[3]+b)/2;

		
			draw(n, x, y, r, g, bl) ;
		}
		exitOnClick();
	}
	
	public static void main(String[] args) {
		double n;
		double [] x = new double [4];
		double [] y = new double [4];
		int r, g, bl;
		
		x[0]=100;			y[0]=100;
		x[1]=100;			y[1]=500;
		x[2]=500;			y[2]=500;
		x[3]=500;			y[3]=100;
		
		System.out.printf("Type in how many squares\n") ;
		n = StdIn.readInt() ;
		r=0; g=0; bl=0;
		
		  StdDraw.enableDoubleBuffering();
			StdDraw.setCanvasSize(600,600);
			StdDraw.setScale(0,599);
			StdDraw.setPenRadius(0.005);
			StdDraw.setPenColor(0, 0, 0);;;
			
			draw(n, x, y, r, g, bl) ;
	}

}
