package s0522;

public class Circle {
	private double radius;
	private final static double PI=3.14;
	Circle(){}
	Circle(double radius){
		
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	double computeArea() {
		return radius*radius*PI ;
	}
	double computePerimeter() {
		return 2*PI*radius ;
	}
	void print() {
		System.out.println("원의 반지름:"+radius);
		System.out.println("넓이:"+computeArea());
		System.out.println("둘레:"+computePerimeter());
		System.out.println(" ");
	}
}
