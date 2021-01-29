package DAT109.hvl;

import javax.swing.*;

public class Piece {

    public String name;
    public int value;
    public int roll;
    public int lastRoll;
    public int secondLastRoll;
    public Dice terning;

    public Piece(String name){
        this.name = name;
        value = 1;
        terning = new Dice();
    }

    /**
     * gir bruker mulighet til å gi opprettet spiller et navn
     */
    public Piece(){
        this.name = JOptionPane.showInputDialog("Skriv inn navn");
        value = 1;
        terning = new Dice();

    }

    /**
     * kaster terning og flytter brikke
     */
    public void rollDice(){
        secondLastRoll = lastRoll;
        lastRoll = roll;
        roll = terning.d6();
        System.out.println(name + " har rullet " + roll);
        value = value + roll;
        if (roll + lastRoll + secondLastRoll == 18) {
            value = 1;    // 3 seksere på rad sender deg tilbake til start
            System.out.println("3 seksere på rad, flytt tilbake til felt 1");
            return;
        }
    }

    /**
     * representerer spillerens tur og starter metoden som kaster terning
     */
    public void turn(){
        System.out.println("Det er "+ name + " sin tur \n");
        rollDice();
        //sjekkFelt(value);
    }

}
