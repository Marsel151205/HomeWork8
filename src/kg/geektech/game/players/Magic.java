package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;
import kg.geektech.game.players.parents.Hero;
import kg.geektech.game.players.parents.SuperAbility;

public class Magic extends Hero {

    public Magic(int heroesHealth, int heroesDamage, String heroName) {
        super(heroesHealth, heroesDamage, SuperAbility.BOOST, heroName);
    }

    @Override
    public void appleSuperPower(Hero[] heroes, Boss boss) {
        int number = RPG_Game.random.nextInt(5) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this !=  heroes[i]) {
                heroes[i].setDamage(heroes[i].getDamage() + number);
            }
        }
    }
}
