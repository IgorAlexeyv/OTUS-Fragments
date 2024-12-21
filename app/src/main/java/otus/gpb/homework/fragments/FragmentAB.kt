package otus.gpb.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View

class FragmentAB : Fragment(R.layout.fragment_ab) {

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
       view.setBackgroundColor(ColorGenerator.generateColor())
    }
}