package infrastructure.persistence;/*
 * Copyright 2016 Benoît Prioux
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import domain.Pokemon;
import domain.PokemonBox;

import java.util.*;

// tag::db[]
public class InMemoryPokemonBox implements PokemonBox {

    private final Map<String, Pokemon> database;

    public InMemoryPokemonBox() {
        database = new HashMap<>();
    }

    @Override
    public void add(Pokemon pokemon) {
        database.put(pokemon.id(), pokemon);
    }

    @Override
    public void remove(Pokemon pokemon) {
        database.remove(pokemon.id());
    }

    @Override
    public Optional<Pokemon> byName(String name) {
        return database.values().stream().filter(p -> p.name().equals(name)).findFirst();
    }

    @Override
    public List<Pokemon> all() {
        return new ArrayList<>(database.values());
    }
}
// end::db[]
