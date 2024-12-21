package otus.gpb.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button

class FragmentAA : Fragment(R.layout.fragment_aa) {

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
       view.setBackgroundColor(ColorGenerator.generateColor())
       val button = view.findViewById<Button>(R.id.buttonOpenFragmentAB)
       button.setOnClickListener(){
           parentFragmentManager.beginTransaction()
               .replace(R.id.containerActivityA, FragmentAB())
               .addToBackStack("")
               .commit()
       }
    }
}