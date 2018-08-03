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
public class Tugas {
   public static void main(String[] args){
        
        String identitas = "M.Sultan Sahara / XR5 / 27";
        System.out.println("Identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Suhu Sruangan ? ");
        int suhu = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if(suhu < 20) System.out.println("Ac dinyalakan dan di set menjadi 20 derajat");
        
        System.out.println("\nIF.. 2");
        if (suhu == 20)
            System.out.println("Ac otomatis mati dan menunggu hingga temperatur ruangan berubah.");
        
        System.out.println("\nIF.. 3");
        if(suhu > 20) {
            System.out.println("Ac dinyalakan dan di set menjadi 20 derajat");
         
        }
   }
}


