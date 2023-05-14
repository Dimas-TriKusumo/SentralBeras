package org.d3if2129.sentralberas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.d3if2129.sentralberas.databinding.FragmentMaknyussBinding


class MaknyussFragment : Fragment() {
    private var _binding:FragmentMaknyussBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    _binding = FragmentMaknyussBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonfour.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "+6287722250406")
            startActivity(dialIntent)
        }
    }
}