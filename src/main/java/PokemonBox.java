import java.util.List;
import java.util.Optional;

public interface PokemonBox {

    Optional<Pokemon> byName(String name);

    List<Pokemon> all();

}
