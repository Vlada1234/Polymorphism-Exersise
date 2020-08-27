package polymorphism.com;

import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();

		animal.animalSound();
		cat.animalSound();
		cat.eat();

		dog.animalSound();
		dog.eat();
        
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		

		animalList.add(cat);
		animalList.add(dog);
		animalList.add(animal);

		for (Animal a : animalList) {
			System.out.println(a);
		}
	
	}
	

	

}
