/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi150323;

/**
 *
 * @author onifajarsyahdi
 */
import java.util.Scanner;
public class Latihan4_Perpangkatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();
        int hasil = 1;
        int i = 0;
        while (i < pangkat) {
            hasil *= angka;
            i++;
        }  
        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }
}
