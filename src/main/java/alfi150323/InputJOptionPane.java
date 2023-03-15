/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alfi150323;

/**
 *
 * @author onifajarsyahdi
 */
import javax.swing.JOptionPane;

public class InputJOptionPane {
    public static void main (String args []) {
        String name = "";
        name = JOptionPane.showInputDialog("please enter your name");
        String msg = "Hello "+name+"!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
