package exercise;

public class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("hawk flies very high");
    }

    @Override
    public void makeSound() {
        System.out.println("this is the hawk sound");
    }
}
