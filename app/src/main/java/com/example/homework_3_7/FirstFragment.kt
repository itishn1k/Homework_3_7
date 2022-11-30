package com.example.homework_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.homework_3_7.databinding.FragmentFirstBinding



class FirstFragment : Fragment() {
    companion object {
        const val KEY_DYNAMIC_ARGS = "DYNAMIC"
    }

    private lateinit var binding: FragmentFirstBinding
    private var list = arrayListOf<Character>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CharacterAdapter(list,this::onClick)
        binding.rvCharacters.adapter = adapter
    }
    private fun onClick(position: Int){
        findNavController().navigate(R.id.secondFragment, bundleOf(KEY_DYNAMIC_ARGS to list[position]))
    }

    private fun loadData() {
        list.clear()
        list.add(
            Character(
                "https://user-images.githubusercontent.com/96876621/204818235-2e6d8070-1f0b-4356-ac8f-a3c8edc5ec05.png",
                "Alive",
                "Rick Sanchez"
            )
        )
        list.add(
            Character(
                "https://user-images.githubusercontent.com/96876621/204818297-ae13f64a-0356-410e-8bb4-a472e9ec0d87.png",
                "Alive",
                "Morty Smith"
            )
        )
        list.add(
            Character(
                "https://user-images.githubusercontent.com/96876621/204818465-e787a464-5a7a-4bd7-b9a6-23d2bc19ad0e.png",
                "Dead",
                "Albert Einstein"
            )
        )
        list.add(
            Character(
                "https://user-images.githubusercontent.com/96876621/204818482-f6aab0e3-40ca-4628-9e64-31747eb85b63.png",
                "Alive",
                "Jerry Smith"
            )
        )
    }

}