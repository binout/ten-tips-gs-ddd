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
import domain.PokemonBox;
import domain.Trainer;

// tag::evolve[]
public class EvolvePokemon {

    private final PokemonBox box;

    public EvolvePokemon(PokemonBox box) {
        this.box = box;
    }

    public Pokemon execute(Trainer trainer, Pokemon pokemon) {
        if (trainer.candies() > 50) {
            Pokemon evolvedPokemon = pokemon.evolve()
                    .orElseThrow(() -> new RuntimeException("This pokemon cannot evoluate"));
            this.box.remove(pokemon);
            this.box.add(evolvedPokemon);
            trainer.removeCandies(50);
            return evolvedPokemon;
        }
        throw new RuntimeException("Not enough candies to evolve this pokemon");
    }
}
// end::evolve[]
