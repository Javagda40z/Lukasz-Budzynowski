package zadanie;

public class Program {

    public static void main(String[] args) {

        Program program = new Program();
//        program.tabliczkaMnozenia(5);
//        program.tabliczkamnozenia(10);


        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
        System.out.println(tabliczkaMnozenia.getLiczba());

    }


//    public void tabliczkamnozenia(int liczba) {
//
//        System.out.println("Tab. mnożenia dla liczby: " + liczba);
//        for (int i = 1; i <=5; i++) {
//            System.out.println(liczba + " x " + i + " = " + liczba*i);
//        }
    }
//    Tab. mno dla liczby 5
//    5x1=5
//    5x2=10
//    5x3=15
//    5x4=20

