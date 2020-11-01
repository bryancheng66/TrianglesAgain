public class Test {
	public static void main(String[] Args){
		Point p1 = new Point(10,19);
		Point p2 = new Point(p1);
		Point p3 = new Point(0, 0);
		Point p4 = new Point(1, 1);

		System.out.println(p1.getX() + ", " + p1.getY());
		System.out.println(p2.getX() + ", " + p2.getY());
		System.out.println(p1.distanceTo(p3));
		System.out.println(p3.distanceTo(p4));
	}	
}
