package DAT109.hvl;

import javax.swing.*;

public class Piece {

    public String name;
    public int value;
    public int roll;
    public int lastRoll;
    public int secondLastRoll;

    public Piece(String name){
        this.name = name;
        value = 1;
    }

    public Piece(){
        this.name = JOptionPane.showInputDialog("Skriv inn navn");
        value = 1;

    }

    public void rollDice(){
        secondLastRoll = lastRoll;
        lastRoll = roll;
        roll = Dice.d6();
        System.out.println(name + " har rullet " + roll);
        value = value + roll;
        if (roll + lastRoll + secondLastRoll == 18) {
            value = 1;    // 3 seksere på rad sender deg tilbake til start
            System.out.println("3 seksere på rad, flytt tilbake til felt 1");
            return;
        }
    }

    public void turn(){
        System.out.println("Det er "+ name + " sin tur");
        rollDice();
        //sjekkFelt(value);
    }

}
