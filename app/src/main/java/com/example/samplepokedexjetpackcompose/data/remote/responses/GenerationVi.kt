package com.example.samplepokedexjetpackcompose.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire,
    @SerializedName("x-y")
    val xY: XY
)