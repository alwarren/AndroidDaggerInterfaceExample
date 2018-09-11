package com.dev.dagger2

import android.os.Bundle
import com.dev.dagger2.data.GreetingRepository
import com.dev.dagger2.data.Hello
import dagger.android.support.DaggerAppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import javax.inject.Inject

/**
 * Created by Al Warren on 9/6/2018.
 */

class MainActivity: DaggerAppCompatActivity() {
    private val hello = Hello()

    @Inject
    lateinit var repository: GreetingRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab1.setOnClickListener { getDefault() }
        fab2.setOnClickListener { getHello() }
        fab3.setOnClickListener { getGoodbye() }

        updateUi(hello.getData())
    }

    private fun getDefault() {
        updateUi(hello.getData())
    }

    private fun getHello() {
        updateUi(repository.getHello())
    }

    private fun getGoodbye() {
        updateUi(repository.getGoodbye())
    }

    private fun updateUi(text: String) {
        daggerTextView.text = text
    }
}
