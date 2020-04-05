package zadanie;

public class SprawdzatorEratostera {

    private int[] liczbyPierwsze;

    public SprawdzatorEratostera(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    public boolean czyPierwsza(int a) {
                for(int i: liczbyPierwsze){
            if(i==a){
                return true;
            }
        }
        return false;
    }
}
