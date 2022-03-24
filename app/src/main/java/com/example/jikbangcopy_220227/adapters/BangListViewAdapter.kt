package com.example.jikbangcopy_220227.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.jikbangcopy_220227.R
import com.example.jikbangcopy_220227.datas.BangData

class BangListViewAdapter(
    val mContext : Context,
    resId : Int,
    val mList : ArrayList<BangData>,
) : ArrayAdapter<BangData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null)
        {
            LayoutInflater.from(mContext).inflate(R.layout.bang_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddressFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtPrice.text = data.price.toString()
        txtAddress.text = "${data.address}, ${data.floor}층"
        txtDescription.text = data.description

        return row
    }
}