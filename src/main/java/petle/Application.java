package petle;

public class Application {

    public static void main(String[] args) {


//        for (int i = 100; i>=0; i--){
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i<101) {
//            System.out.println(i);
//            i++;
//        }
//
//        for (i = 300; i<=1000; i=i+1) {
//
//            if(i%2 == 0 && i%3 ==0){
//            System.out.println(i);
//            }
//        }

        String napis = " programista lol";

        for(int i = 0; i< napis.length(); i=i+2) {
            System.out.println(napis.charAt(i));
        }

        for(int i = napis.length() - 1; i >= 0; i--) {
            System.out.println(napis.charAt(i));
        }
    }




}
