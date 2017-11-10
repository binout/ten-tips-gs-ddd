package domain;

public interface Pokedex {

    interface BaseStat {
    }

    BaseStat baseStatAttack(Pokemon pokemon);
    BaseStat baseStatDefense(Pokemon pokemon);
    BaseStat baseStatStamina(Pokemon pokemon);

}
