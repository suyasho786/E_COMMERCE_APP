package com.example.myapplication.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.EditText
import androidx.appcompat.widget.AppCompatEditText

class MSPTEdittext (context:Context,attrs : AttributeSet):AppCompatEditText(context,attrs){
    init {
        applyFont()
    }

    private fun applyFont() {
        val typeFace : Typeface = Typeface.createFromAsset(context.assets,"Pacifico.ttf")
        setTypeface(typeFace)
    }
}