
public class TestPoint {

	public static void main(String[] args) {
		Point pnt1 = new Point();
		pnt1.setX(1.0);
		pnt1.setY(7.0);
		Point pnt2 = new Point();
		pnt2.setX(4.0);
		pnt2.setY(3.0);
		System.out.println("("+pnt1.getX()+ "," +pnt1.getY()+")");
		/*		pnt1.print();
		pnt2.print();
		String str=pnt1.toString();
		System.out.println(str); */		
		System.out.println(pnt2);
		System.out.println(pnt2.distance(pnt1));
		//method overloading: �޼ҵ� �̸��� ����������, �Ű������� �ٸ��� �ؼ� ȣ���ϴ� �޼ҵ带 ����
	    
	}

}
