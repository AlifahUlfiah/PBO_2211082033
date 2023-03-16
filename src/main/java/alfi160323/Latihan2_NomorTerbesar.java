/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi160323;

/**
 *
 * @author onifajarsyahdi
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Latihan2_NomorTerbesar {
    public static void main (String args []) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1));
            numbers[i] = Integer.parseInt(input);
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
       
        JOptionPane.showMessageDialog(null, "Input terbesar yang diberikan oleh user adalah " + max);
    }
}

