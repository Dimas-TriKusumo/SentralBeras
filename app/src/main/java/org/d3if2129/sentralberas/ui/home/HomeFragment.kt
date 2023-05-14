package org.d3if2129.sentralberas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import org.d3if2129.sentralberas.R
import org.d3if2129.sentralberas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.itemOne.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_rajaleleFragment) }
        binding.itemtwo.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_saniaFragment)}
        binding.itemthree.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_pandanwangiFragment)}
        binding.itemfour.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_maknyussFragment)}
        binding.itemfive.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_aizaFragment)}
        binding.itemsix.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_susuFragment)}
        binding.itemseven.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_mentikwangiFragment)}
        binding.itemeight.setOnClickListener { findNavController().navigate(R.id.action_navigation_home_to_merahFragment)}
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}