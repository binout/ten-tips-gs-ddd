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
package domain;

// tag::domainService[]
public class PokemonStatsCalculation {

    int attack(Pokemon pokemon) {
         return awesomeAlgo(pokemon);
    }

    int defense(Pokemon pokemon) {
        return awesomeAlgo(pokemon);
    }

    int stamina(Pokemon pokemon) {
        return awesomeAlgo(pokemon);
    }
// end::domainService[]

    private int awesomeAlgo(Pokemon pokemon) {
        return 0;
    }
}
