package dev.bulean.datafragmentb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dev.bulean.datafragmentb.databinding.ActivityMainBinding

/**
 * View Binding + Args
 * https://developer.android.com/topic/libraries/view-binding
 * https://developer.android.com/guide/topics/ui/controls/radiobutton
 * https://developer.android.com/guide/navigation/navigation-pass-data
 * */

/*
* View Binding
* View binding is a feature that allows you to more easily write code that interacts with views.
* Once view binding is enabled in a module, it generates a binding class for each XML layout file
* present in that module. An instance of a binding class contains direct references to all views
* that have an ID in the corresponding layout.
* In most cases, view binding replaces findViewById.
* */
/*
* Pass data between destinations
* Navigation allows you to attach data to a navigation operation by defining arguments for a
* destination.
* You should strongly prefer passing only the minimal amount of data between destinations.
* For example, you should pass a key to retrieve an object rather than passing the object itself,
* as the total space for all saved states is limited on Android. If you need to pass large amounts
* of data, consider using a ViewModel as described in Share data between fragments.
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}