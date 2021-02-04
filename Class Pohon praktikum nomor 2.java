/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Pohon {
    String nama;
    double tinggi;
    Scanner sc = new Scanner(System.in);
    
    void setNama(){
        
        System.out.println("Silahkan masukkan nama pohon = ");
        nama = sc.nextLine();
    }
    void setTinggi(){
        System.out.println("Silahkan masukkan tinggi pohon = ");
        tinggi = sc.nextDouble();
    }
    void getNama(){
        System.out.println("Nama Pohon = "+nama);
    }
    void getTinggi(){
        System.out.println("Tinggi Pohon = "+tinggi);
    }
}
