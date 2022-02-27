package com.example.jikbangcopy_220227.datas

// 하나의 방 -> 가격, 행정구역, 층수, 설명문구 멤버변수로.

// RoomData 생성자 생성
class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String,
) {

//    층수 값 => 1층, 반지하, 지하 1층 형태로 가공

    fun getFormattedFloor(): String {

        val floorStr: String

        if (floor > 0) {
            floorStr = "${floor}층"
        } else if (floor == 0) {
            floorStr = "반지하"
        } else {
            floorStr = "지하 ${-floor}층"
        }

        return floorStr
    }


//    가격 값 => "8,500", "2억 3,500" 형태로 가공
}