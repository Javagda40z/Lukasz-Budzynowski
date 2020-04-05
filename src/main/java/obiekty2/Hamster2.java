package obiekty2;

public class Hamster2 extends Animal2 {
    public Hamster2(String szynszyl) {
        super(szynszyl);
    }

    @Override
    void makeSound() {
        System.out.println("Szmery.");
    }

    @Override
    public void move() {
        System.out.println("Biegam.");
    }
}
