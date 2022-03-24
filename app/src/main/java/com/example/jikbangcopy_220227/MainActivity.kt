package com.example.jikbangcopy_220227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jikbangcopy_220227.adapters.BangListViewAdapter
import com.example.jikbangcopy_220227.databinding.ActivityMainBinding
import com.example.jikbangcopy_220227.datas.BangData

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    val mBangList = ArrayList<BangData>()

    lateinit var mAdapter : BangListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        mBangList.add(BangData(28000, "서울시 영등포구" , 7, "1번째 방입니다."))
        mBangList.add(BangData(8000, "부천시 오정구" , 1, "2번째 방입니다."))
        mBangList.add(BangData(18000, "서울시 강남구" , 3, "3번째 방입니다."))
        mBangList.add(BangData(7000, "서울시 중랑구" , 5, "4번째 방입니다."))
        mBangList.add(BangData(5000, "서울시 강북구" , 2, "5번째 방입니다."))
        mBangList.add(BangData(15000, "서울시 동대문구" , 2, "6번째 방입니다."))
        mBangList.add(BangData(6000, "부천시 원미구" , 1, "7번째 방입니다."))
        mBangList.add(BangData(5000, "서울시 강서구" , 5, "8번째 방입니다."))

        mAdapter = BangListViewAdapter(this,R.layout.bang_list_item,mBangList)
        binding.roomListView.adapter = mAdapter


    }
}
