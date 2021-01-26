package DAT109.hvl;

public class Board {

    /**
     * brettets 100 felter representert som int verdier
     */
    public int[] places;

    public Board(){
        places = new int[100];
        for (int i = 1; i<101;i++){
            places[i-1] = i;
        }
    }

    /**
     * sjekker hvor spiller lander og om det er noe spesielt med dette feltet
     * @param spiller det er denne spilleren sin tur
     * @return string som forteller spilleren hva som skjedde denne runden
     */
    public String sjekkFelt(Piece spiller){
        String s;
        String slange = "Slange! " + spiller.name + " faller tilbake til felt ";
        String stige = "Stige! " + spiller.name + " hopper til felt ";

        switch(spiller.value){
            case 2 : s = stige + 38; spiller.value = 38; break;
            case 4 : s = stige + 14 ; spiller.value = 14; break;
            case 8 : s = stige + 31; spiller.value = 31; break;
            case 16 : s = slange + 6; spiller.value = 6; break;
            case 21 : s = stige + 42; spiller.value = 42; break;
            case 28 : s = stige + 84; spiller.value = 84; break;
            case 47 : s = slange + 26; spiller.value = 26; break;
            case 49 : s = slange + 11; spiller.value = 11; break;
            case 51 : s = stige + 67; spiller. value = 67; break;
            case 56 : s = slange + 53; spiller.value = 53; break;
            case 62 : s = slange + 18; spiller.value = 18; break;
            case 64 : s = slange + 60; spiller.value = 60; break;
            case 71 : s = stige + 91; spiller.value = 91; break;
            case 80 : s = stige + 100 + spiller.name + " har vunnet!"; spiller.value = 100; break;
            case 87 : s = slange + 24; spiller.value = 24; break;
            case 92 : s = slange + 73; spiller.value = 73; break;
            case 98 : s = slange + 78; spiller.value = 78; break;
            case 100 : s = spiller.name + " har vunnet"; break;
            case 101 : s = spiller.name + " kom for langt og flytter derfor tilbake til forrige posisjon"; spiller.value-= spiller.roll;
            case 102 : s = spiller.name + " kom for langt og flytter derfor tilbake til forrige posisjon"; spiller.value-= spiller.roll;
            case 103 : s = spiller.name + " kom for langt og flytter derfor tilbake til forrige posisjon"; spiller.value-= spiller.roll;
            case 104 : s = spiller.name + " kom for langt og flytter derfor tilbake til forrige posisjon"; spiller.value-= spiller.roll;
            case 105 : s = spiller.name + " kom for langt og flytter derfor tilbake til forrige posisjon"; spiller.value-= spiller.roll;
            default : s = spiller.name + " flyttet " + spiller.roll + " plasser frem til felt: " + spiller.value;
        }
        return s;
    }

    }

