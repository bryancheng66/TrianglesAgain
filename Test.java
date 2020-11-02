public class Test {
	public static void main(String[] Args){
		//Points
		Point p1 = new Point(10,19);
		Point p2 = new Point(p1);
		Point p3 = new Point(0, 0);
		Point p4 = new Point(1, 1);
		Point p5 = new Point(1, 1);

		//getX(), getY() 
		System.out.println(p1.getX() + ", " + p1.getY());
		System.out.println(p2.getX() + ", " + p2.getY());
		
		//distanceTo(), equals()
		System.out.println(p1.distanceTo(p3));
		System.out.println(p3.distanceTo(p4));
		System.out.println(p3.equals(p4));
		System.out.println(p4.equals(p5));

		//Triangles
		Triangle t1 = new Triangle(0, 0, 1, 0, 0, 1);
		Triangle t2 = new Triangle(0, 0, 4, 5, 7, 3);

		//getPerimeter()
		System.out.println(t1.getPerimeter());
		System.out.println(t2.getPerimeter());

		//getArea()
		System.out.println(t1.getArea());
		System.out.println(t2.getArea());
		
		//classify()
		System.out.println(t1.classify());
		System.out.println(t2.classify());
	}	
}
