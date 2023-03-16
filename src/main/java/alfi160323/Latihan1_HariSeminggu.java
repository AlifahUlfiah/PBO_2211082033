/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi160323;

/**
 *
 * @author onifajarsyahdi
 */
public class Latihan1_HariSeminggu {
    public static void main (String args []){
        String [] days = {"Monday","Tuesday","Wednesday","Thusday","Friday","Sunday","Minggu"};
                
        int i=0;
        
        System.out.println("While Loop");
        while(i<days.length){
            System.out.println(days[i]);
            i++;
        }
        
        System.out.println("Do-While");
        do {
            System.out.println(days[i]);
            i++;
        } while (i < days.length);
        
        System.out.println("For Loop");
        for (i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
