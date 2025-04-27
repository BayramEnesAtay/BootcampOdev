package com.bayram.odevler.hafta2odev1

class Soru3class {
    fun faktoriyel(sayi:Int):Int{
        var carpim=1

        for (i in 1..sayi)
        {
            carpim*=i

        }
        if(sayi==0)
        {
            return 1
        }
        else{
            return carpim
        }
    }
}