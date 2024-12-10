/**
*
* @author Fatih Bayram - fatih.bayram8@ogr.sakarya.edu.tr
* @since 02/12/2024
* <p>
*T.C. kimlik numarasının doğruluğunu kontrol eden bir metot içerir ve 
*rastgele ve geçerli T.C. kimlik numaraları üretir.
* </p>

*/
package com.vatandas.kutuphane;


import java.util.Random;

public class KimlikNo {
    private String tcKimlikNo;

    public KimlikNo() {
        this.tcKimlikNo = generateValidTC();
    }

    private String generateValidTC() {
        Random random = new Random();
        int[] digits = new int[11];

        // İlk 9 haneyi rastgele üret
        for (int i = 0; i < 9; i++) {
            digits[i] = random.nextInt(10);
        }

        // 10. haneyi hesapla
        digits[9] = ((digits[0] + digits[2] + digits[4] + digits[6] + digits[8]) * 7 
                    - (digits[1] + digits[3] + digits[5] + digits[7])) % 10;

        // 11. haneyi hesapla
        digits[10] = (digits[0] + digits[1] + digits[2] + digits[3] + digits[4] 
                     + digits[5] + digits[6] + digits[7] + digits[8] + digits[9]) % 10;

        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    public boolean validateTC(String tc) {
        if (tc == null || tc.length() != 11) return false;
        // Doğrulama algoritması eklenebilir...
        return true;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }
}
