package Player;
import java.util.Scanner;
public class methods {
	Scanner s=new Scanner(System.in);
	void circle(){
		System.out.println("Entre the radious");
		int r=s.nextInt();
		double p=3.14;
		double redious =p*(r*r);
		System.out.println("The area of circle is"+redious);
		
	}
	void triangle(){
		System.out.println("Enter the base and height");
		int base=s.nextInt();
		int height=s.nextInt();
		double area=0.5*(base*height);
		System.out.println("The area of triangle is"+area);
	}
	void rectangle(){
		System.out.println("Enter the width and height is");
		int width=s.nextInt();
	    int height=s.nextInt();
	    int area=width*height;
	    System.out.println("The area of the rectangle is"+area);
	}
	public static void main(String[] args) {

		methods m=new methods();
		m.rectangle();
		m.triangle();
		m.circle();

	}

}
