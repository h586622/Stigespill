package DAT109.hvl;

import javax.swing.*;

public class SpillKontroller {

    public static void main(String args[]){

        String spillere = JOptionPane.showInputDialog("Hvor mange spillere?");
        int antall = Integer.parseInt(spillere);

        Game spill = new Game(antall);

        spill.start();

    }
}
