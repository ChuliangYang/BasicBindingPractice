package com.demo.cl.basicbindingpractce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.demo.cl.basicbindingpractce.databinding.BasicBindingBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding:BasicBindingBinding

     var movieBean=Movie("avenger", 123, "very nice")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding=DataBindingUtil.setContentView<BasicBindingBinding>(this,R.layout.basic_binding)
        activityMainBinding.apply {
            movie=movieBean
            textView4.text="change"

        }
    }

}
