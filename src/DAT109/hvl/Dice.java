package DAT109.hvl;

public class Dice {


    /**
     * verdien på terningen etter at den er kastet
     */
    public int value;

    public Dice(){
        this.value = 0;
    }

    /**
     * genererer en ny tilfeldig verdi mellom 1 og 6 og setter det som ny verdi på terningen
     * @return verdien på terningen
     */
    public int d6(){
        value = (int) (Math.random()*6)+1;
        return value;
    }
}
