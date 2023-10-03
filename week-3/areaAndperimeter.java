import java.util.*;
class Circle{
	private double radius,pi=3.14141;
	Circle(double radius){
		this.radius=radius;
	}
	public  double getArea(){
		return pi*radius*radius;
	}
	public  double getPerimeter(){
		return 2.0*pi*radius;
	}
}
class areaAndperimeter{
	
	public void void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius to create a circle");
		float radius=sc.nextFloat();
		Circle circle1=new Circle(radius);
		System.out.println("chose option : \n 1->are    2->perimeter");
		int op=sc.nextInt();
		if(op==1) System.out.println(circle1.getArea());
		else System.out.println(circle1.getPerimeter());
	}
	
}
