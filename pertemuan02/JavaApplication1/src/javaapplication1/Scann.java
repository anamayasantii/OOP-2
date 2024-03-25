package javaapplication1;

/**
 *
 * @author ANAMAYA SANTI
 * 25 Mar 2024
 */
import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        String nama = "";
        Scanner dtIN = new Scanner(System.in);
        
        nama = dtIN.nextLine();
        
        System.out.println("Isi dari variabel nama : "+ nama);
    }
}
