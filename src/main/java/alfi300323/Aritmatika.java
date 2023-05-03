/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi300323;

/**
 *
 * @author onifajarsyahdi
 */
public class Aritmatika {
    static int tambah (int a,int b){
        return (a+b);
    }
    static boolean cekGanjil(int a){
        return (a % 2 != 0);
    }
    static int[] getGanjil(int i, int n) {
        int[] ganjil = new int[n];
        for (int j = 1; j < n; j++) {
            ganjil[j] = ganjil[j] + 2;
        }
        return ganjil;
    }

}
