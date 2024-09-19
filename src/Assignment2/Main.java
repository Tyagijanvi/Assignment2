package Assignment2;
//Base class Animal
class Animal {
 // Method to be overridden by subclasses
 public void makeSound() {
     System.out.println("Animal is making a sound");
 }
}

//Subclass Dog that overrides makeSound()
class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Dog says: Woof Woof");
 }
}

//Subclass Cat that overrides makeSound()
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cat says: Meow Meow");
 }
}

public class Main {
	public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling makeSound() method for each
        System.out.println("Dog Sound:");
        myDog.makeSound();  // Dog's implementation is called

        System.out.println("Cat Sound:");
        myCat.makeSound();;  // Cat's implementation is called

	}
}
