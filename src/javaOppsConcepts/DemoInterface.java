package javaOppsConcepts;

public class DemoInterface {

	public static void main(String[] args) {
		InteTest cl = new ClaTest();
		cl.bite();
	}

}

interface InteTest {
	public void bite();

	
}

class ClaTest implements InteTest {
	public void bite() {
		int a = 10;
		int b = 20;
		System.out.println(b - a);
	}
}

interface RTest {
	public void bite();

	
}

class ClaRTest implements RTest {
	public void bite() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
}


