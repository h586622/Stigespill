package DAT109.hvl;

public class Piece {

    public String name;
    public int value;
    public int lastRoll;

    public Piece(String name){
        this.name = name;
        value = 1;
    }

    public void rollDice(){
        lastRoll = Dice.d6();
        value = value + lastRoll;
    }
}
