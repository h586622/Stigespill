package DAT109.hvl;

import javax.swing.*;

public class Game {

    private Board brett;
    private Piece[] spillere;
    private boolean noenHarVunnet;

    /**
     *
     * @param antall antall spillere
     *               oppretter nytt spill
     */
    public Game(int antall){
        brett = new Board();
        spillere = new Piece[antall];
        for (int i=0; i< antall;i++){
            spillere[i] = new Piece();
        }
        noenHarVunnet=false;
    }

    /**
     * starter og kjører spillet
     */
    public void start(){
        while(!noenHarVunnet) {

        for (Piece p : spillere){
            JOptionPane.showMessageDialog(null, "Det er " + p.name + " sin tur. Trykk en tast for å rulle terning");
            p.turn();
            String s = brett.sjekkFelt(p);
            System.out.println(s);
            if (p.value == 100){
                noenHarVunnet = true;}
            if(p.roll == 6){
                p.turn();
                System.out.println(brett.sjekkFelt(p));
                if(p.roll == 6){
                    p.turn();
                    System.out.println(brett.sjekkFelt(p));
                }
            }

            if (p.value == 100){
                noenHarVunnet = true;}
        }
        }
        }
    }



