package dev.bulean.datafragmentb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dev.bulean.datafragmentb.databinding.ActivityMainBinding

/**
 * https://developer.android.com/topic/libraries/view-binding
 * https://developer.android.com/guide/topics/ui/controls/radiobutton
 * https://developer.android.com/guide/navigation/navigation-pass-data
 * */

/*
* View binding is a feature that allows you to more easily write code that interacts with views.
* Once view binding is enabled in a module, it generates a binding class for each XML layout file
* present in that module. An instance of a binding class contains direct references to all views
* that have an ID in the corresponding layout.
* In most cases, view binding replaces findViewById.
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}