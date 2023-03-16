/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi160323;

/**
 *
 * @author onifajarsyahdi
 */
public class Latihan3_BukuAlamat {
    public static void main(String[] args) {
        String[][] data = {
            {"Alfi", "62-4594", "Kuranji"},
            {"Lidya", "62-0853", "Tunggul Hitam"},
            {"Vina", "62-3605", "Pasar Baru"}
        };

        for (int i = 0; i < data.length; i++) {
            System.out.println("Nama\t: " + data[i][0]);
            System.out.println("Telepon\t: " + data[i][1]);
            System.out.println("Alamat\t: " + data[i][2]);
            System.out.println();
        }
    }
}
