/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi150323;

/**
 *
 * @author onifajarsyahdi
 */
public class Latihan3_CetakSeratusKali {
    public static void main (String args []) {
        ForLoop();
        WhileLoop();
        DoWhile();
    }
    static void ForLoop() {
        System.out.println("For Loop");
        for (int i = 0; i < 100; i++) {
            System.out.println("Nama saya adalah Alfi");
        }
    }
    static void WhileLoop () {
        System.out.println("\nWhile Loop");
        int i = 0;
        while (i < 100) {
            System.out.println("Nama saya adalah Alfi");
            i++;
        }
    }
    static void DoWhile () {
        System.out.println("\nDo-While");
        int i = 0;
        do {
            System.out.println("Nama saya adalah Alfi");
            i++;
        } while (i < 100);
    }
}
