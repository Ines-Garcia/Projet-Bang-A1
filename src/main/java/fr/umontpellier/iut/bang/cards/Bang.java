package fr.umontpellier.iut.bang.cards;

import fr.umontpellier.iut.bang.Player;

import java.util.ArrayList;
import java.util.List;

public class Bang extends OrangeCard {

    public Bang(int value, CardSuit suit) {
        super("Bang!", value, suit);
    }

    //liste joueurs
    public List<Player> reachablePlayer(List<Player> allPlayerList) {
        allPlayerList = getOtherPlayers();

    }

    @Override
    public void playedBy(Player p) {
        //je choisis le joueur
        //si le joueur n'est pas deja mort
        //si j'ai pas deja tirer un Bang ET que j'ai pas l'arme Volcanic
        //si j'ai la range
        //si le joueur en face n'as pas une carte Missed (et la planque?)
        //donc renvoi boolean
    }

}
