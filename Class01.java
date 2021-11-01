class cal_area{
	static int height;
	static int width;
	static int lon;
	static int radius;
	static double pi=3.14159;
	public static int cal_area(int h,int w,int l) {
		height=h;
		width=w;
		lon=l;
		return 2*(height*width)+2*(height*lon)+2*(width*lon);
	}
	public static double cal_area(int r) {
		radius=r;
		return radius*radius*radius*pi*4/3.0;
	}
	static void show() {
		System.out.println(cal_area(height,width, lon));
		System.out.println(cal_area(radius));
	}
}
public class Class01 {

	public static void main(String[] args) {
		cal_area.cal_area(4,5,6);
		cal_area.cal_area(10);
		cal_area.show();
	}

}
