package com.example.samplepokedexjetpackcompose.di

import com.example.samplepokedexjetpackcompose.data.remote.PokeApi
import com.example.samplepokedexjetpackcompose.repository.PokemonRepository
import com.example.samplepokedexjetpackcompose.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Singleton
    @Provides
    fun providePokemonRepository(api: PokeApi) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokeApi(): PokeApi {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build().create(PokeApi::class.java)
    }
}