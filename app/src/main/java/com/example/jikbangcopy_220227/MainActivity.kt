package com.example.jikbangcopy_220227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jikbangcopy_220227.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()


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
    }
}