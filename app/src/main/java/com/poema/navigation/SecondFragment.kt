package com.poema.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.poema.navigation.databinding.FragmentFirstBinding
import com.poema.navigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.tv2.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment) }
        val myNumber = "${args.number} ${args.testString}"
        binding.tv2.text = myNumber
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}