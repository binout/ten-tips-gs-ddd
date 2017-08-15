package domain;

import java.util.List;
import java.util.Optional;

public interface PokemonBox {

    void add(Pokemon pokemon);

    Optional<Pokemon> byName(String name);

    List<Pokemon> all();

}
