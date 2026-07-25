/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OshaAlsra18062026;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiExample {
    public static void main (String[] args){
        MahasiswaNilai m = new MahasiswaNilai();
        m.setNim("2401001");
        m.setNama("Ali");
        m.setAlamat("Padang");
        m.setTugas(80.0);
        m.setUts(70.0);
        m.setUas(80.0);
        
        System.out.println("Nim             : " + m.getNim());
        System.out.println("Nama            : " + m.getNama());
        System.out.println("Alamat          : " + m.getAlamat());
        System.out.println("Tugas           : " + m.getTugas());
        System.out.println("UTS             : " + m.getUts());
        System.out.println("UAS             : " + m.getUas());
        System.out.println("Nilai Angka     : " + m.getNilaiAngka());
        System.out.println("Nilai Huruf     : " + m.getNilaiHuruf());

    }
}
