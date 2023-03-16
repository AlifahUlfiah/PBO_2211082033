/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi150323;

/**
 *
 * @author onifajarsyahdi
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan2_BacaBilangan {
    public static void main (String args []) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
                
        try{
           int angka = Integer.parseInt(dataIn.readLine());
            
           if (angka == 1) {
            System.out.println("Satu");
        } else if (angka == 2) {
            System.out.println("Dua");
        } else if (angka == 3) {
            System.out.println("Tiga");
        } else if (angka == 4) {
            System.out.println("Empat");
        } else if (angka == 5) {
            System.out.println("Lima");
        } else if (angka == 6) {
            System.out.println("Enam");
        } else if (angka == 7) {
            System.out.println("Tujuh");
        } else if (angka == 8) {
            System.out.println("Delapan");
        } else if (angka == 9) {
            System.out.println("Sembilan");
        } else if (angka == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid number"); 
        }
    }
    catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
        } 
    catch (NumberFormatException e) {
        System.out.println("Error: masukkan angka yang valid");
        }    
    }
}
