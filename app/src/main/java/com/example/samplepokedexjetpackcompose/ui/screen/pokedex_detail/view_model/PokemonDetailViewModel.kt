package com.example.samplepokedexjetpackcompose.ui.screen.pokedex_detail.view_model

import androidx.lifecycle.ViewModel
import com.example.samplepokedexjetpackcompose.data.remote.responses.Pokemon
import com.example.samplepokedexjetpackcompose.repository.PokemonRepository
import com.example.samplepokedexjetpackcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}