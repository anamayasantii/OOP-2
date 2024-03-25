package javaapplication1;

/**
 *
 * @author ANAMAYA SANTI
 * 25 Mar 2024
 */
import javax.swing.JOptionPane;

public class msgbox {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Tulis nama : ");
        
        System.out.println("Isi variabel nama: "+nama);
    }
}
