package kg.geektech.game.players;

import kg.geektech.game.players.parents.Hero;
import kg.geektech.game.players.parents.SuperAbility;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int heroesHealth, int heroesDamage, int healPoints, String heroName) {
        super(heroesHealth, heroesDamage, SuperAbility.HEALTH, heroName);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void appleSuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i].getHeroName() != this.getHeroName()){
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            }
        }
    }
}
