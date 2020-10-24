package com.example.kotlinlistview

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: AsatidzAdapter
    private lateinit var dataName: Array<String>
    private lateinit var dataDesc: Array<String>
    private lateinit var dataFoto: TypedArray
    private var asatidzz = arrayListOf<Asatidz>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView : ListView = findViewById(R.id.lv_list)
        adapter = AsatidzAdapter(this)

        listView.adapter = adapter
        prepare()
        addItem()
    }

    private fun addItem() {
        //TODO("Not yet implemented")
        for (postition in dataName.indices) {
            val asatidz = Asatidz(
                dataFoto.getResourceId(postition, -1),
                dataName[postition],
                dataDesc[postition]
            )
            asatidzz.add(asatidz)
        }
        adapter.asatidz = asatidzz
    }

    private fun prepare() {
        //TODO("Not yet implemented")
        dataName = resources.getStringArray(R.array.data_name)
        dataDesc = resources.getStringArray(R.array.data_description)
        dataFoto = resources.obtainTypedArray(R.array.data_foto)

    }
}