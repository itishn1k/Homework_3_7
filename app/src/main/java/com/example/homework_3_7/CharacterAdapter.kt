package com.example.homework_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_3_7.databinding.ItemCharacterBinding

class CharacterAdapter(
    var characterList: ArrayList<Character>,
    var onClick: (position: Int) -> Unit
) :
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {


    inner class ViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            itemView.setOnClickListener { onClick(adapterPosition) }
            val item = characterList[adapterPosition]
            binding.tvStatus.text = item.status
            binding.tvName.text = item.name
            binding.ivImage.loadImage(item.image!!)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()
    override fun getItemCount() = characterList.size
}