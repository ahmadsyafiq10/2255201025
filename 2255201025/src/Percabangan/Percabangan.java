/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;

/**
 *
 * @author X1
 */
import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args) {
        int nilai;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Nilai :");
        nilai = keyboard.nextInt();
        if (nilai<= 76){
            System.out.println("Selamat Anda Lulus");
        }
        else{
            System.out.println("Maaf Anda Tidak Lulus");
        }
    }
}
