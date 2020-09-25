package dev.bulean.datafragmentb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import dev.bulean.datafragmentb.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
                inflater, R.layout.fragment_main, container, false)
        binding.bEnter.setOnClickListener { view : View ->
            val itemSelected: Int = binding.radioGroup.checkedRadioButtonId
            if(-1 != itemSelected){
                var option = 0
                var txt: String = ""
                when(itemSelected){
                    R.id.rbOne -> option = 1
                    R.id.rbTwo -> option = 2
                }
                if(option == 1){
                    txt = "Android"
                    view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToBlankFragment(txt))
                } else{
                    txt = "iOS"
                    view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToBlankFragment(txt))                }
            }
        }

        return binding.root
    }
}