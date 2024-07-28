package javaOppsConcepts;



class E {

	public void bangalore() {
		System.out.println("This is bangalore");
	}
}
	class F extends E {
		public void hyderabad() {
			System.out.println("This is hyderabad");
		}
	}
	
	public class SingleInHeritance{
		public static void main(String[] args) {
			E a=new E();
			F b=new F();
			a.bangalore();
			b.bangalore();
			b.hyderabad();
		}
	
}


