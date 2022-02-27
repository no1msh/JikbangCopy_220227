package com.example.jikbangcopy_220227.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.jikbangcopy_220227.R
import com.example.jikbangcopy_220227.datas.RoomData

class RoomAdapter (
    val mContext : Context,
    resId: Int, // xml파일의 아이디를 저장 Int 형임.
    val mList : ArrayList<RoomData>

) :  ArrayAdapter<RoomData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null ){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressFloor = row.findViewById<TextView>(R.id.txtAddressFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtPrice.text = data.getFormattedPrice()

        txtDescription.text = data.description

        txtAddressFloor.text = "${data.address}, ${data.getFormattedFloor()}"

        return row
    }
}