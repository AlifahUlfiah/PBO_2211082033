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

public class GetInputFromKeyboard2 {
    public static void main(String args []) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        int a,b,c;
        int ave = 0;
        int max = Integer.MIN_VALUE;
        
        try{
            System.out.print("Nilai 1 = ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai 2 = ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai 3 = ");
            c = Integer.parseInt(dataIn.readLine());
            
            ave = (a+b+c)/3;
            
            if (a > max)
                max = a;
            if (b > max)
                max = b;
            if (c > max)
                max = c;
        }
        catch(IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        System.out.println("Average = "+ave);
        System.out.println("Max = "+max);
    }
}
