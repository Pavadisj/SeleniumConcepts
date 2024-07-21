package seleniumCon;

public class HowToCallMethodsandCreateObject {

	public static void main(String[] args) {
		System.out.println("HEllo");
		HowToCallMethodsandCreateObject hmc=new HowToCallMethodsandCreateObject();
		int sum=hmc.bangalore(50,10);
		System.out.println(sum);
		hmc.hyderabad("Hderabad");
		hmc.hyderabad("Chennai");
		HowToCallMethodsandCreateObject.bangalore(100,110);
		//System.out.println(sum1);
		System.out.println(hmc.bangalore(5,5));
		System.out.println(hmc.bangalore(5,5));
	}
	public static int bangalore( int a, int b) {
		int c=a+b;
		return c;
	}
	public int bangalore(int a, int b, int d) {
		int c=a+b;
		return c;
	}
	public void hyderabad(String str) {
		System.out.println("THis is Hyderabad");
		System.out.println(str);
	}
	
	
}
