import com.sun.security.jgss.GSSUtil;

public class Apka {


    public static void main(String[] args) {
        System.out.println("Hello World");

       int i=3;
       double d=42;
       float f=2;
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);

        System.out.println(i*d);
        System.out.println(czyParzysta(5));
        System.out.println(czyParzysta(4));

        i= (int) d;


        System.out.println(dodaj(5,5));

    }

    public static boolean czyParzysta(int a){
        return a%2==0;
    }


    public static int dodaj(int a, int b){

        return a+b;
    }
    public static int odejmij(int a, int b){

        return a-b;
    }
    public static int pomnoz(int a, int b){

        return a*b;
    }
    public static double podziel(int a, int b){

        return ((double)a)/b;
    }


}