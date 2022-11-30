package com.example.homework_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_3_7.FirstFragment.Companion.KEY_DYNAMIC_ARGS
import com.example.homework_3_7.databinding.FragmentSecondBinding

@Suppress("DEPRECATION")
class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = arguments?.getSerializable(KEY_DYNAMIC_ARGS) as Character
        binding.apply {
            ivImage.loadImage(result.image.toString())
            tvStatus.text = result.status
            tvName.text = result.name
        }
    }

}