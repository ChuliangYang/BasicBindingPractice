package com.demo.cl.basicbindingpractce.oneWayCustom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.demo.cl.basicbindingpractce.Movie
import com.demo.cl.basicbindingpractce.R
import com.demo.cl.basicbindingpractce.databinding.CustomOneWayBindingBinding

class MainActivityOneWay:AppCompatActivity() {
    lateinit var binding:CustomOneWayBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView<CustomOneWayBindingBinding>(this, R.layout.custom_one_way_binding)
//        binding.movie= Movie("2",1,"2")
        binding.listener=MyClickListener()
    }
}