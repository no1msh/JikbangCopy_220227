package com.example.jikbangcopy_220227.datas

class BangData(

    val price : Int,
    val address : String,
    val floor : Int,
    val description : String,

) {
    fun getFormattedPrice(inputPrice : Int) : String {

        if(inputPrice >= 10000)
        {
            return "${inputPrice/10000}억 ${inputPrice%10000}만원"
        }
        return "${price}만원"
    }


}