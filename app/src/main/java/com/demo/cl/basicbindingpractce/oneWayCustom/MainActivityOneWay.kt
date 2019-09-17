package com.demo.cl.basicbindingpractce.oneWayCustom

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.demo.cl.basicbindingpractce.R
import com.demo.cl.basicbindingpractce.databinding.CustomOneWayBindingBinding

class MainActivityOneWay:AppCompatActivity() {
    lateinit var binding:CustomOneWayBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView<CustomOneWayBindingBinding>(this, R.layout.custom_one_way_binding).apply {
            listener=MyClickListener()
            klistener=object:EditClickListener{
                override fun onclick(editText: EditText, param1: String) {
                    editText.setText(param1)
                }
            }
            sdfsdfa=object : Msdfsdds {
                override fun fDudnJF(imageView: ImageView, image: Drawable) {
                    imageView.setImageDrawable(image)
                }
            }
        }

    }
}