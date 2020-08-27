package polymorphism.com;

import java.util.ArrayList;

public class Animal {

	private String name;


	public void printName() {
		System.out.println(name);
	}

	public void animalSound() {
		System.out.println("Animal sounds");
	}

	public void eat() {
		System.out.println("Animal eats");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
