package DAT109.hvl;

public class Board {

    public int[] places;

    public Board(){
        for (int i = 1; i<101;i++){
            places[i] = i;
        }
    }
}
