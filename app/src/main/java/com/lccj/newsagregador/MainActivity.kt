package com.lccj.newsagregador

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseApp.initializeApp(this);

        showFragment()
    }

    private fun showFragment(){

        val tag = "NewsListFragment"
        val existingFragmentWithTag = supportFragmentManager.findFragmentByTag(tag)

        if (existingFragmentWithTag == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.newsListFragmentContainer, NewsListFragment(), tag)
                    .commit()
        }
    }

}
