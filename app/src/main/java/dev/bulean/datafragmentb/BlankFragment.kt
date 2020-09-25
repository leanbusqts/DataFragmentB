package dev.bulean.datafragmentb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import dev.bulean.datafragmentb.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentBlankBinding>(
            inflater, R.layout.fragment_blank, container, false)

        val args = BlankFragmentArgs.fromBundle(arguments!!)
        binding.tvOutput.text = args.txt

        return binding.root
    }

}