/**
*
* @author Fatih Bayram - fatih.bayram8@ogr.sakarya.edu.tr
* @since 02/12/2024
* <p>
* Bu program, rastgele T.C. kimlik numarası, isim, soyisim, yaş ve telefon bilgilerine sahip vatandaşlar üretmek için tasarlanmıştır.
* Kullanıcı, menüden seçim yaparak 1 ile 10 arasında vatandaş oluşturabilir ve oluşturulan vatandaş bilgilerini görüntüleyebilir.
* </p>
*/
package com.test.vatandas;

import com.vatandas.kutuphane.RastgeleKisi;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Kullanıcıya menü seçeneklerini sun
            System.out.println("=== Rastgele TC Vatandaş Üretim Programı ===");
            System.out.println("1- Rastgele TC Vatandaşı Üret");
            System.out.println("2- Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.print("Kaç vatandaş oluşturmak istiyorsunuz? (En fazla 10 kişi): ");
                int kisiSayisi = scanner.nextInt();

                if (kisiSayisi > 10) {
                    // Maksimum sınır aşımı kontrolü
                    System.out.println("Hata: En fazla 10 vatandaş oluşturabilirsiniz?.");
                } else if (kisiSayisi > 0) {
                    // Belirtilen sayıda kişi üretimi
                    System.out.println("=== Üretilen Vatandaşlar ===");
                    for (int i = 0; i < kisiSayisi; i++) {
                        System.out.println((i + 1) + "- " + RastgeleKisi.generateKisi());
                    }
                } else {
                    // Geçersiz kişi sayısı kontrolü
                    System.out.println("Hata: Lütfen 1 ile 10 arasında bir sayı giriniz.");
                }
            } else if (secim == 2) {
                // Programdan çıkış
                System.out.println("Program sonlandırılıyor. Hoşça kalın!");
                break;
            } else {
                // Geçersiz seçim kontrolü
                System.out.println("Geçersiz seçim! Lütfen 1 veya 2 giriniz.");
            }
        }
        scanner.close();
    }
}
