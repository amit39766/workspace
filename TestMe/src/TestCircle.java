class Circle{
	private double radius;
	public Circle(){};
	public Circle(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public void displayArea(){
		System.out.println("The area of circle is : "+getArea());
	}
}
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir=new Circle(5);
		cir.setRadius(10);
		cir.displayArea();

	}

}