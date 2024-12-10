/**
*
* @author Fatih Bayram - fatih.bayram8@ogr.sakarya.edu.tr
* @since 02/12/2024
* <p>
* lipsuus
* </p>
*/
package com.vatandas.kutuphane;

import java.util.Random;

public class Telefon {
    private String telefonNo;
    private IMEINo imeiNo;

    public Telefon() {
        this.telefonNo = generateTelefonNo();
        this.imeiNo = new IMEINo();
    }

    private String generateTelefonNo() {
        Random random = new Random();
        int prefix = 500 + random.nextInt(9);
        int number = 1000000 + random.nextInt(9000000);
        return "0" + prefix + number;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public IMEINo getImeiNo() {
        return imeiNo;
    }
}
