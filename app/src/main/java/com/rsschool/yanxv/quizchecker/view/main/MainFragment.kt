package com.rsschool.yanxv.quizchecker.view.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.rsschool.yanxv.quizchecker.R
import com.rsschool.yanxv.quizchecker.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainBinding.inflate(inflater, container, false)

        initView()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initView() {
        binding.OpenListQuiz.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_mainFragment_to_listQuizFragment)
        }

        binding.NewQuiz.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_mainFragment_to_listQuizFragment)
        }
    }


}