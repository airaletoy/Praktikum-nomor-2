/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author USER
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pohon Cemara = new Pohon();
        Pohon Kelapa = new Pohon();
        
        Cemara.setNama();
        Cemara.setTinggi();
        Kelapa.setNama();
        Kelapa.setTinggi();
        Cemara.getNama();
        Cemara.getTinggi();
        Kelapa.getNama();
        Kelapa.getTinggi();
        
        
    }
}
