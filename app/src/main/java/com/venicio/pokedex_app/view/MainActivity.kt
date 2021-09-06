package com.venicio.pokedex_app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.venicio.pokedex_app.databinding.ActivityMainBinding
import com.venicio.pokedex_app.domain.Pokemon
import com.venicio.pokedex_app.domain.PokemonType

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val charmander = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png",
            7,
            "CharmanderVinny",
            listOf(
                PokemonType("Aqua")
            )

        )
        val pokemons = listOf(charmander,charmander,charmander,charmander,charmander,charmander,charmander,charmander,charmander)

        binding.rvPokemon.layoutManager = LinearLayoutManager(this)
        binding.rvPokemon.setHasFixedSize(true)
        binding.rvPokemon.adapter = PokemonAdapter(pokemons)
    }
}