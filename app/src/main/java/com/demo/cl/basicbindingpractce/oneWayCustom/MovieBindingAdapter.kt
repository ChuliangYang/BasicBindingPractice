package com.demo.cl.basicbindingpractce.oneWayCustom

import android.graphics.drawable.Drawable
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter


interface onMyClick{
    fun onClick(view:TextView,param1:String,param2:Int)
}

class MyClickListener:onMyClick{
    override fun onClick(view: TextView, param1: String, param2: Int) {
        view.setText("${param1}+++${param2}")
    }
}

//自定义单属性和多属性以及lambda表达式绑定
@BindingAdapter("test")
fun setTest(textView: TextView, test: String) {
    textView.text = test
}

@BindingAdapter(value = arrayOf("test1", "test2"), requireAll = false)
fun setAttribute(editText: EditText, text1: String?, num2: Int?) {
    editText.apply {
        if (text1?.isNotEmpty() == true) editText.append(text1)
        if (num2 != null) editText.append("+...$num2")
    }
}


@BindingAdapter("myclick")
fun setMyClick(view:TextView,myClick: onMyClick){
    view.setOnClickListener {
        myClick.onClick(view,"222",111)
    }
}


@BindingAdapter("editClick")
fun setEditTextClick(editText: EditText, onclickListner:EditClickListener){
    editText.setOnClickListener {
        (it as? EditText)?.let {
            onclickListner.onclick(it,"123")
        }
    }
}

@BindingAdapter(value = arrayOf("imageDraw","sdfa"),requireAll = false)
fun setImageSource(imageView: ImageView,imageDraw: Drawable, sdfa:Msdfsdds){
    sdfa.fDudnJF(imageView,imageDraw)
}


interface Msdfsdds{
    fun fDudnJF(imageView: ImageView, image:Drawable)
}

interface EditClickListener{
    fun onclick(editText: EditText,param1:String)
}

