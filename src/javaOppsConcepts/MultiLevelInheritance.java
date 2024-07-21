package javaOppsConcepts;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		//D dd=new A();
	}
	
	public class A {
		public void bangalore() {
			System.out.println("This is bangalore");
		}
	}

	public class B extends A {
		public void hydrabad() {
			System.out.println("This is hydrabad");
		}
	}

	public class C extends B{
		public void chennai() {
			System.out.println("This is chennai");
		}
	}
	
	
	public class D extends C{
		public void delhi() {
			System.out.println("This is delhi");
		}
	}
	}


