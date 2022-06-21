package com.vaibhavintech.getsocial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.loader.app.LoaderManager.getInstance
import java.text.DecimalFormatSymbols.getInstance
import java.util.Calendar.getInstance

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel= ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application))[NoteViewModel::class.java]
        viewModel.allNotes.observe(this, Observer {

        })


    }
}

