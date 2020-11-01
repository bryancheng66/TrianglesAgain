public class Test {
	public static void main(String[] Args){
		Point p1 = new Point(10,19);
		Point p2 = new Point(p1);
		System.out.println(p1.getX() + ", " + p1.getY());
		System.out.println(p2.getX() + ", " + p2.getY());
	}
}
