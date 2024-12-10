/**
*
* @author Fatih Bayram - fatih.bayram8@ogr.sakarya.edu.tr
* @since 02/12/2024
* <p>
* Kişinin T.C. Kimlik No, isim, soyisim, yaş ve telefon bilgilerini tutar.
* </p>
*/
package com.vatandas.kutuphane;

import java.util.Random;

public class Kisi {
    private KimlikNo kimlikNo;
    private String isim;
    private String soyisim;
    private int yas;
    private Telefon telefon;

    public Kisi(String isim, String soyisim) {
        Random random = new Random();
        this.kimlikNo = new KimlikNo();
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = random.nextInt(101);
        this.telefon = new Telefon();
    }

    @Override
    public String toString() {
        return kimlikNo.getTcKimlikNo() + " " + isim + " " + soyisim + " " + yas + " " 
               + telefon.getTelefonNo() + " (" + telefon.getImeiNo().getImei() + ")";
    }
}