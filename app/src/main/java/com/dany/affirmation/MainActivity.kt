package com.dany.affirmation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.dany.affirmation.adapter.ItemAdapter
import com.dany.affirmation.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)



        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView

        recyclerView.setHasFixedSize(true)
    }
}