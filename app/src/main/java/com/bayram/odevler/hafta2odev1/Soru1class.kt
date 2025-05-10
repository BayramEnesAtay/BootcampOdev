package com.bayram.odevler.hafta2odev1

class Soru1class {
    fun hesaplayici():Double
    {
        val deger= readLine()?.toDoubleOrNull()

        if(deger==null)
        {
            print("Alani bos birakmayiniz")
            return 0.0
        }
        else{
            val deger2=deger*1.8+32
            return deger2
        }
    }


}