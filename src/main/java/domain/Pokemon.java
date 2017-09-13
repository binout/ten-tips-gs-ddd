package domain;/*
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

import java.util.Objects;
import java.util.UUID;

// tag::new[]
public class Pokemon {

    private final String id;
    private final PokemonType type;
    private String name;
    private int pv;

    public Pokemon(PokemonType type) {
        this.id = UUID.randomUUID().toString();
        this.type = Objects.requireNonNull(type);
        this.name = type.value();
        this.pv = 100;
    }

    public String id() {
        return id;
    }

    public PokemonType type() {
        return type;
    }

    public String name() {
        return  name;
    }

    public boolean isDead() {
        return this.pv == 0;
    }
// end::new[]

// tag::business[]

    public void die() {
        this.pv = 0;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public Pokemon evolve(PokemonType pokemonType) {
        Pokemon pokemon = new Pokemon(pokemonType);
        pokemon.name = this.name;
        pokemon.pv = this.pv;
        return pokemon;
    }
// end::business[]


}
