package com.bayram.odevler.hafta2Odev2

fun main() {
    val kenar= readLine()?.toIntOrNull()
    //sınıfa ulasmak icin nesne uretmek zorundayım.
    val nesne=Soru5class()
    if(kenar!=null)
    {
        println("Toplam aci: ${nesne.kenaracihesap(kenar)}")
    }
    else{
        println("Kenar sayisi nulldur")
    }


}