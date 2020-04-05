package obiekty;

public class Cat implements Animal{

    private int licznik = 0;
    private String imie;

    public Cat(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void drap() {
//        kot drapie
    }

    public void eatMouse(){
        licznik++;
        System.out.println("Zjadłem " + licznik + " myszy");

    }

    @Override
    public void makeSound() {
        System.out.println("Miau!");
    }

    @Override
    public void move() {
        System.out.println("chodzę");
    }
}
