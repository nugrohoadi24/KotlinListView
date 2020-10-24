package com.example.kotlinlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.security.AccessControlContext

class AsatidzAdapter internal constructor(private val context: Context) : BaseAdapter(){
    internal var asatidz = arrayListOf<Asatidz>()
    override fun getCount(): Int {
        //TODO("Not yet implemented")
        return asatidz.size
    }

    override fun getItem(i: Int): Any {
        //TODO("Not yet implemented")
        return asatidz[i]
    }

    override fun getItemId(i: Int): Long {
        //TODO("Not yet implemented")
        return i.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        //TODO("Not yet implemented")
        var itemView = view
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_asatidz, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val asatidz = getItem(position) as Asatidz
        viewHolder.bind(asatidz)
        return itemView
    }

    private inner class ViewHolder internal constructor(view: View) {
        private val tvNama : TextView = view.findViewById(R.id.tv_nama)
        private val tvDesc : TextView = view.findViewById(R.id.tv_desc)
        private val imgFoto : ImageView = view.findViewById(R.id.foto_asatidz)

        internal fun bind(asatidz: Asatidz){
            tvNama.text = asatidz.nama
            tvDesc.text = asatidz.deskripsi
            imgFoto.setImageResource(asatidz.foto)
        }

    }
}