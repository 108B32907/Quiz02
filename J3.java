package java;
interface Iarea{
	abstract void area();
}
class circle implements Iarea{
	private double r;
	public circle(double r) {
		this.r=r;
	}
	public void area() {
		System.out.println("圓形面積:"+3.1416*r*r);
	}
}
class Rectangle implements Iarea{
	private double width;
	private double height;
	public Rectangle(double w,double h) {
		width=w;
		height=h;
	}
	public void area() {
		System.out.println("長方形面積:"+width*height);
	}
}
class Triangle implements Iarea{
	private double bottom;
	private double height;
	public Triangle(double b,double h) {
		bottom=b;
		height=h;
	}
	public void area() {
		System.out.println("三角形面積:"+bottom*height/2.0);
	}
}

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iarea a;
		circle c=new circle(6.0);
		Rectangle r=new Rectangle(10.0,15.0);
		Triangle t=new Triangle(20.0,15.0);
		c.area();
		r.area();
		t.area();
		for(int i=1;i<=3;i++) {
			if(i==1) {
				a=c;
			}
			else if(i==2) {
				a=r;
			}
			else {
				a=t;
			}
			a.area();
		}
	}

}
