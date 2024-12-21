package otus.gpb.homework.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.activity.OnBackPressedCallback

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val backPressedCallBack = object : OnBackPressedCallback(true)
        {
            override fun handleOnBackPressed() {
                if(parentFragmentManager.backStackEntryCount <= 1)
                    requireActivity().finish()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, backPressedCallBack)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonOpenFragmentAA)
        button.setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.containerActivityA, FragmentAA())
                .addToBackStack("")
                .commit()
        }
    }
}