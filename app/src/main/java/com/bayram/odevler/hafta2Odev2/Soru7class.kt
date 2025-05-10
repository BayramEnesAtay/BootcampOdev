package com.bayram.odevler.hafta2Odev2

class Soru7class {
    fun hesapla(gun:Int):Int
    {
        var maas:Int=0
        if(gun>2)
        {
            maas=160+(240)*(gun-2)
        }
        else if(gun<=2)
        {
            maas=gun*80
        }
        return maas
    }
}