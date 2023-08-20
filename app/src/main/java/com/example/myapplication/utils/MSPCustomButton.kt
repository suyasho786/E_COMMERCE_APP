package com.example.myapplication.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MSPCustomButton (context: Context,attrs:AttributeSet):AppCompatButton(context,attrs){
    init {
        applyFont()
    }

    private fun applyFont() {
        val typeFace : Typeface = Typeface.createFromAsset(context.assets,"Pacifico.ttf")
        setTypeface(typeFace)
    }
}