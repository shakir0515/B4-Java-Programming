public class Animal {

    Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal{
    @Override
    Dog getAnimal() {
        return new Dog();
    }
}