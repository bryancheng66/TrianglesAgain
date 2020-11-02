public class Point { 
	private double x, y;

	public Point(double X, double Y){
		this.x = X;
		this.y = Y;
	}

	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public double getX(){
		return this.x;	
	}

	public double getY(){
		return this.y;
	}	

	public double distanceTo(Point other){
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}

	public boolean equals(Point other){
		return this.x == other.x && this.y == other.y;
	}
}


