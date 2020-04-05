package zadanie;

public class TabliczkaMnozenia {

    private final int liczba;

    public TabliczkaMnozenia(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke() {
        System.out.println("Tab. mnożenia dla liczby: " + liczba);
        for (int i = 1; i <=5; i++) {
            System.out.println(liczba + " x " + i + " = " + liczba*i);
        }
    }

}
