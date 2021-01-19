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
        int i= 0;
        while(i < 100) {
            int tall = Dice.d6();
            assertTrue(tall > 0);
            assertTrue(tall < 7);
            i++;
        }
    }


    @Test
    public void testSwitchen(){
        Board brett = new Board();
        Piece testPiece = new Piece("test");
        testPiece.value=15;
        String t = brett.sjekkFelt(testPiece);
        assertEquals("Du står på felt 15",t);
        testPiece.value = 100;
        t = brett.sjekkFelt(testPiece);
        assertEquals("Du har vunnet",t);
    }
}
