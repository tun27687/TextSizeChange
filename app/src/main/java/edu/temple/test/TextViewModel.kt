package edu.temple.test
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class TextViewModel: ViewModel() {
    private val selectedText: MutableLiveData<String> by lazy{
        MutableLiveData<String>()

    }
    fun getText(): LiveData<String>{
        return selectedText
    }
    fun setText(text: String)
    {
        selectedText.value= text
    }

}