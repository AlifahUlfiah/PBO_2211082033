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
import javax.swing.JOptionPane;

public class Latihan1_Nilai {
    public static void main(String args []) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        int a,b,c;
        int ave = 0;
        String face;
        
        try{
            System.out.print("Nilai 1 : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai 2 : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai 3 : ");
            c = Integer.parseInt(dataIn.readLine());
            
            ave = (a+b+c)/3;
        }
        catch(IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
        if(ave < 60)
            face = ":(";
        else
            face = ":)";
        
        System.out.print("Average = "+ave+" "+face);
      
        String inputA = JOptionPane.showInputDialog("Nilai 1 : ");
        String inputB = JOptionPane.showInputDialog("Nilai 2 : ");
        String inputC = JOptionPane.showInputDialog("Nilai 3 : ");
        
        a = Integer.parseInt(inputA);
        b = Integer.parseInt(inputB);
        c = Integer.parseInt(inputC);
        
        ave = (a+b+c)/3;
        
        String average = "Your Average is "+ave+" "+face;
        JOptionPane.showMessageDialog(null,average);
    }
}
