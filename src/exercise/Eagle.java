package exercise;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("eagle flies very high");
    }

    @Override
    public void makeSound() {
        System.out.println("this is the eagle sound");
    }
}
