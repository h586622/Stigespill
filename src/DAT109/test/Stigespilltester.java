package DAT109.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import DAT109.hvl.Board;
import DAT109.hvl.Dice;
import DAT109.hvl.Piece;
import org.junit.Before;
import org.junit.Test;


public class Stigespilltester {



    // tester terningen 100 ganger for å sjekke at man ikke kommer utenfor rekkevidden til terningen
    @Test
    public void testTerning(){
        Dice terning = new Dice();
        int i= 0;
        while(i < 100) {
            int tall = terning.d6();
            assertTrue(tall > 0);
            assertTrue(tall < 7);
            i++;
        }
    }

    /**
     * sjekker at vi får ventet resultat når vi sjekker verdi mot brettet
     */

    @Test
    public void testSwitchen(){
        Board brett = new Board();
        Piece testPiece = new Piece("test");
        testPiece.value=15;
        String t = brett.sjekkFelt(testPiece);
        assertEquals("test flyttet 0 plasser frem til felt: 15",t);
        testPiece.value = 100;
        t = brett.sjekkFelt(testPiece);
        assertEquals("test har vunnet",t);
    }

    /**
     * sjekker at vi får lagret de tre siste kast som trengs i tilfelle der 3 seksere flytter brikken tilbake til start
     */
    @Test
    public void testAtKastLagres(){

        Piece testPiece = new Piece("test");
        testPiece.rollDice();
        int en = testPiece.roll;
        testPiece.rollDice();
        int to = testPiece.roll;
        testPiece.rollDice();
        int tre = testPiece.roll;
        assertEquals(en, testPiece.secondLastRoll);
        assertEquals(to, testPiece.lastRoll);
        assertEquals(tre, testPiece.roll);


    }
}
