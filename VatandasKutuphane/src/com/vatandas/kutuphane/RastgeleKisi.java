/**
*
* @author Fatih Bayram - fatih.bayram8@ogr.sakarya.edu.tr
* @since 02/12/2024
* <p>
* Bu kod, rastgele bir kişi (isim ve soyisim) oluşturan bir yardımcı sınıf olan RastgeleKisi sınıfıdır.
* </p>
*/
package com.vatandas.kutuphane;

import java.util.Random;

public class RastgeleKisi {
    private static final String[] isimler = {"Fatih", "Mehmet", "Sultan", "Esra", "Fatma","Zehra", "Osman","Hakan","Yahya", "Orhan"};
    private static final String[] soyisimler = {"Koşar", "Yılmaz", "Çelik", "Kaya","Çelik","Ata","Pelit","Şahin","Gencer","Uysal"};

    public static Kisi generateKisi() {
        Random random = new Random();
        String isim = isimler[random.nextInt(isimler.length)];
        String soyisim = soyisimler[random.nextInt(soyisimler.length)];
        return new Kisi(isim, soyisim);
    }
}

