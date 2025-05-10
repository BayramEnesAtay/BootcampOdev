package com.bayram.odevler.hafta2odev1

class Soru4class {
    fun kacharf(kelime:String):Int
    {
        var sayi:Int=0
        for (i in 0..(kelime.length-1))
        {
            if('a'==kelime[i])
                sayi++
            else
                continue
        }
        return sayi

    }

}