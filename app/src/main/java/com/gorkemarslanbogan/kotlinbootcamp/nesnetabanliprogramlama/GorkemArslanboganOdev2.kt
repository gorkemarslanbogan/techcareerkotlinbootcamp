package com.gorkemarslanbogan.kotlinbootcamp.nesnetabanliprogramlama

class GorkemArslanboganOdev2 {

    fun FahrenhietHesapla(c: Double): Double{
        return (c * (1.8 + 32))
    }

    fun CevreHesapla(kisaKenar: Int, uzunKenar: Int): Int {
        return (2* (kisaKenar+uzunKenar))
    }

    fun Factorial(number: Int): Int {
        var temp = 1
        var number1 = number
        if(number == 1 || number == 0){
            return temp
        }else{
            while (number>=1){
                temp *= number1
                number1--
            }
        }
        return temp
    }

    fun HarfadetBul(kelime: String) : String {
        var count = 0
        var input = kelime.toLowerCase()
        for(i in input){
            if(i == 'a'){
                count++
            }
        }
        return "Kelimede: $count adet 'A' harfi var.."
    }

    fun IcAciToplami(kenarSayisi: Int): Int{
        return ((kenarSayisi-2) * 180)
    }
    fun MaasHesapla(gunSayisi: Int) : Double {
        val calismaSaatUcreti = 10.0
        val mesaiSaatUcreti = 20.0
        var maas = 0.0
        var calisilanSaat = gunSayisi * 8
            if(calisilanSaat>160){
                maas = (calismaSaatUcreti * 160)
                calisilanSaat -= 160
                val mesai = (calisilanSaat * mesaiSaatUcreti)
                maas += mesai
        }
        else{
                maas = (calisilanSaat * mesaiSaatUcreti)
        }
        return maas
    }
    fun KotaHesapla(kotaMiktari: Int): String {
        var toplamTutar = 0
        val gbUcret = 4
        if(kotaMiktari % 50 == 0){
            toplamTutar += 50
        }else if(kotaMiktari % 50 != 0){
            if(kotaMiktari>50){
                toplamTutar += 50 + (kotaMiktari - 50) * 4
            }
            else{
               toplamTutar = kotaMiktari*gbUcret
            }
            }
        return "Toplam Tutar : $toplamTutar TL"
    }

}