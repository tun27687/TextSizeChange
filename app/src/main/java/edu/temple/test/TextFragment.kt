package edu.temple.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TextFragment : Fragment() {

    private lateinit var textView: TextView
private lateinit var  textViewModel: TextViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text, container, false).apply {
            textView = findViewById(R.id.textView)
          textViewModel= getTextSize().observe(requireActivity()){

          }
        }
    }

    fun changeTextSize (size: Float) {

        // Only perform update if textView is previously initialized
        if (::textView.isInitialized)
            textView.textSize = size
    }

}