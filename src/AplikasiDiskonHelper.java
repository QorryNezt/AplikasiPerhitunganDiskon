/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayyida Qurrata A'yunin (2210010331)
 */
public class AplikasiDiskonHelper {
        //Logika perhitungan aplikasi diskon. Terpisah agar rapi ^u^
        public static double calculateTotal(double hargaPerUnit, int qty, double diskon) {
        double total = hargaPerUnit * qty;
        double jmlDiskon = total * (diskon / 100);
        return total - jmlDiskon;
    }
}
