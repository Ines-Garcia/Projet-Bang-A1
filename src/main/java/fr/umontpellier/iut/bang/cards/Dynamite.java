package fr.umontpellier.iut.bang.cards;

import fr.umontpellier.iut.bang.Player;

public class Dynamite extends BlueCard {

    public Dynamite(int value, CardSuit suit) {
        super("Dynamite", value, suit);
    }


    public void playedBy(Player player) {
        super.playedBy(player);
    }

    public boolean canPlayFromHand(Player player) {
        return super.canPlayFromHand(player);
    }

}
