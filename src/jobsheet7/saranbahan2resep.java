/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class saranbahan2resep {
    public static void main(String [] args){
    String identitas = "M.Sultan Sahara/XRPL5/27";
    System.out.println("Identitas : " + identitas);
    
    System.out.print("\nSaran Resep dari bahan milik anda\n");
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bahan Pertama: ");
    System.out.println("1. Pisang");
    System.out.println("2. Telur");
    System.out.print("Masukkan no pilihan anda :");
    int bahan1 = scanner.nextInt();
}
}
