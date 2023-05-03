/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi300323;

/**
 *
 * @author onifajarsyahdi
 */
import java.util.Scanner;

public class AritmatikaExample {
    public static void main (String args[]){
        
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(10,5);
        System.out.println("C : "+c);
        System.out.println("Ganjil? "+aritmatika.cekGanjil(c));
        
        Scanner in = new Scanner(System.in);
        System.out.print("\nbanyak bilangan : ");
        int n = in.nextInt();
        int[] hasil = aritmatika.getGanjil(5,n);
        System.out.println(hasil);
    }
}
