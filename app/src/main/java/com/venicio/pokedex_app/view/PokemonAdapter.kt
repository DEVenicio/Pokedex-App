package com.venicio.pokedex_app.view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.venicio.pokedex_app.domain.Pokemon
import com.venicio.pokedex_app.databinding.ItemPokemonBinding


class PokemonAdapter(
    private val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPokemonBinding.inflate(inflater,parent,false)

        return PokemonViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)

    }

    override fun getItemCount() = items.size


    class PokemonViewHolder(private val binding : ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bindView(item: Pokemon) {

                //TODO: Load image with Glide

                binding.tvName.text = item.name
                binding.tvNumber.text = "Nº ${item.formattedNumber}"
                binding.tvType1.text = item.types[0].name

                if (item.types.size > 1){

                    binding.tvType2.visibility = View.VISIBLE
                    binding.tvType2.text = item.types[1].name
                } else {
                    binding.tvType2.visibility = View.GONE
                }


            }

    }
}