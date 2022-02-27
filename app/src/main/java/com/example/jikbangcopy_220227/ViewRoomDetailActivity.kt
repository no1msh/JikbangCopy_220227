package com.example.jikbangcopy_220227

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jikbangcopy_220227.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.txtDescription
import kotlinx.android.synthetic.main.room_list_item.txtPrice

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        var roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = roomData.getFormattedPrice()

        txtDescription.text = roomData.description

        txtAddress.text = roomData.address

        txtFloor.text = roomData.getFormattedFloor()
    }
}