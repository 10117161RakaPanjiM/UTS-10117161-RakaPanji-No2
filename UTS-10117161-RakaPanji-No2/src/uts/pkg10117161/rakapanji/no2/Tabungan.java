/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg10117161.rakapanji.no2;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 */
class Tabungan {
   private final int saldo;
    
    public Tabungan (int saldo){
        this.saldo = saldo;
        
    }
    public int ambilUang(int jumlah){
        return saldo-jumlah;
    }
    
}