package kg.geektech.game.players.parents;

import kg.geektech.game.players.parents.GameEntity;
import kg.geektech.game.players.parents.HavingSuperAbility;
import kg.geektech.game.players.parents.SuperAbility;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility superAbility;
    private String heroName;
    public Hero(int heroesHealth, int heroesDamage, SuperAbility superAbility, String heroName) {
        super(heroesHealth, heroesDamage);
        this.superAbility = superAbility;
        this.heroName = heroName;
    }


    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}