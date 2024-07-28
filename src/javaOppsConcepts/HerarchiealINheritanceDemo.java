package javaOppsConcepts;

public class HerarchiealINheritanceDemo {

	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.animal();
		cat.cat();
		Dog dog=new Dog();
		dog.animal();
		dog.dog();
	}
	
}

class Animal {
	public void animal() {
		System.out.println("This is animal");
	}
}

class Dog extends Animal{
	public void dog() {
		System.out.println("This is dog");
	}
}

class Cat extends Animal{
	public void cat() {
		System.out.println("This is cat");
	}
}
