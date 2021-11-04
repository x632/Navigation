package com.poema.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.poema.navigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(2,"An")
        binding.tv1.setOnClickListener { Navigation.findNavController(view).navigate(action) }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}