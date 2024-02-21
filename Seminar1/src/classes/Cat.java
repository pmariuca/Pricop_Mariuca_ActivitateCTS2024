package classes;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("I am " + this.getName() + " and I just ate " + food);
    }
}
