package javaOppsConcepts;

public class TestCae extends TestBase {

	public static void main(String[] args) {
		TestBase tb=new TestCae();
		tb.testbase();
	}
	public void testcase() {
		System.out.println("This is testcase");
	}
	
	public void testbase() {
		System.out.println("This is testbase from TestBase class");
	}
}
