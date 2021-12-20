package java;
interface ishape03{
	public void show();
	public int area(); 
}
interface icolor{
	public void showcolor();
}
class cwin implements ishape03,icolor{
	protected int width;
	protected int height;
	protected String color;
	public cwin(int w,int h,String c) {
		width=w;
		height=h;
		color=c;
	}
	public void show() {
		
		System.out.println("width="+width);
		System.out.println("height="+height);
	}
	public int area() {
		System.out.print("area=");
		return width*height;
	}
	public void showcolor() {
		System.out.println("color="+color);
	}
}
public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cwin win=new cwin(5,7,"Green");
		win.show();
	}

}