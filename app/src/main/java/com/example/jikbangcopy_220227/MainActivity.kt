package com.example.jikbangcopy_220227

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jikbangcopy_220227.adapters.RoomAdapter
import com.example.jikbangcopy_220227.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomAdapter
    // 당장 초기화 작업을 하면 화면이 완성 되기도 전에 하므로 멤버 변수로 하기 위해선 나중에 초기화 작업을 한다고 알림

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData( 8000, "서울시 동대문구", 7, "1번째 방입니다."))
        mRoomList.add( RoomData( 15000, "서울시 서대문구", -2, "2번째 방입니다."))
        mRoomList.add( RoomData( 27000, "서울시 중랑구", 0, "3번째 방입니다."))
        mRoomList.add( RoomData( 8550, "서울시 강서구", 12, "4번째 방입니다."))
        mRoomList.add( RoomData( 1240, "서울시 강남구", 21, "5번째 방입니다."))
        mRoomList.add( RoomData( 22250, "서울시 동대문구", 4, "6번째 방입니다."))
        mRoomList.add( RoomData( 5850, "서울시 서대문구", 7, "7번째 방입니다."))
        mRoomList.add( RoomData( 6800, "서울시 영등포구", 5, "8번째 방입니다."))
        mRoomList.add( RoomData( 38000, "서울시 강동구", 2, "9번째 방입니다."))
        mRoomList.add( RoomData( 8600, "서울시 마포구", 1, "10번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item , mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity :: class.java )
            startActivity(myIntent)
        }
    }
}