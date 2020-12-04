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
     * NAMA: Raka Panji Muhabieq
     * KELAS: PBO1
     * NIM: 10117161
 */
public class UTS10117161RakaPanjiNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tbg = new Tabungan(baca.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = baca.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
          
    }
    
}
