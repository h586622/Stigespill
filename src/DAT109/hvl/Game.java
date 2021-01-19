package DAT109.hvl;

public class Game {

    private Board brett;
    private Piece[] spillere;

    public Game(int antall){
        brett = new Board();
        spillere = new Piece[antall];
    }
}
