/*
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
package application;

import domain.Pokemon;
import domain.PokemonType;

import java.util.Optional;

// tag::evolve[]
public class EvolvePokemon {

    public Optional<Pokemon> execute(Pokemon pokemon) {
        return findEvolveType(pokemon).map(pokemon::evolve);
    }

    private Optional<PokemonType> findEvolveType(Pokemon pokemon) {
        // find evolve type for this pokemon
        return Optional.empty();
    }
}
// end:evolve[]
