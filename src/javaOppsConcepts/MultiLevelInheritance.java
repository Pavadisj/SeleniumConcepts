package javaOppsConcepts;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		D dd=new D();
		//dd.bangalore();
		dd.hydrabad();
		dd.chennai();
		dd.delhi();
		B bb=new B();
		bb.hydrabad();
	}
}
	class A {
		public void bangalore() {
			System.out.println("This is bangalore");
		}
	}

	class B extends SingleInHeritance {
		public void hydrabad() {
			System.out.println("This is hydrabad");
		}
	}

	class C extends B{
		public void chennai() {
			System.out.println("This is chennai");
		}
	}
	
	
	class D extends C{
		public void delhi() {
			System.out.println("This is delhi");
		}
	}
	


