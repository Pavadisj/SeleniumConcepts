package javaOppsConcepts;

public class MethodOverLOadingInJava {

	public static void main(String[] args) {
		MethodOverLOadingInJava.add(10, 20, "Summation two intiger");
		MethodOverLOadingInJava.add();
		MethodOverLOadingInJava.main("Main method can be overloading");
	}
	
	public static void main(String str) {
		System.out.println(str);
	}
	public static void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add(int a, int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void add(int a, int b, String str) {
		int sum=a+b;
		System.out.println(sum);
		System.out.println(str);
	}
	public static void add() {
		System.out.println("Not having parameters");
	} 
}
