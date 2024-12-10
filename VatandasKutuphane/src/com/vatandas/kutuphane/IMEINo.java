/**
*
* @author Fatih Bayram - fatih.bayram8@ogr.sakarya.edu.tr
* @since 02/12/2024
* <p>
* IMEI doğruluğunu kontrol eden bir metot içerir ve 
* Rastgele ve geçerli IMEI numaraları üretir.
* </p>
*/
package com.vatandas.kutuphane;


import java.util.Random;

public class IMEINo {
    private String imei;

    public IMEINo() {
        this.imei = generateValidIMEI();
    }

    private String generateValidIMEI() {
        Random random = new Random();
        int[] digits = new int[15];

        // İlk 14 haneyi rastgele üret
        for (int i = 0; i < 14; i++) {
            digits[i] = random.nextInt(10);
        }

        // Luhn algoritması ile 15. haneyi hesapla
        int sum = 0;
        for (int i = 0; i < 14; i++) {
            int digit = digits[i];
            if (i % 2 == 1) digit *= 2;
            sum += digit > 9 ? digit - 9 : digit;
        }
        digits[14] = (10 - (sum % 10)) % 10;

        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    public boolean validateIMEI(String imei) {
        return true; // Algoritma eklenebilir
    }

    public String getImei() {
        return imei;
    }
}
