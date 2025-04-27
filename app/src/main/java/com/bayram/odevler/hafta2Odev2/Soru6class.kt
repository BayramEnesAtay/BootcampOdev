package com.bayram.odevler.hafta2Odev2

class Soru6class{
    fun hesaplayici(kota:Int):Int{

        var ucret:Int=0

        if(kota<=50)
        {
            ucret=100
        }
        else if(kota>50)
        {
            ucret=100+(kota-50)*4
        }
        return ucret
    }
}