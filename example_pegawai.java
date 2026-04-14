/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Osha Alsra
 */
public class example_pegawai {
    public static void main(String[] args){

        Pegawai p1 = new Pegawai();
        Pegawai p2 = new Pegawai();

        p1.setNip("005");
        p1.setNama("oca");
        p1.setGolongan("A");
        p1.setPotongan(500000);

        System.out.println("Data 1");
        System.out.println("NIP         : " + p1.getNip());
        System.out.println("Nama        : " + p1.getNama());
        System.out.println("Golongan    : " + p1.getGolongan());

        p1.setGajiPokok();
        System.out.println("Gaji Pokok  : " + p1.getGajiPokok());
        System.out.println("Tunjangan   : " + p1.getTunjangan());
        System.out.println("Potongan    : " + p1.getPotongan());
        System.out.println("Gaji Bersih : " + p1.getGajiBersih());

        p2.setNip("006");
        p2.setNama("virra");
        p2.setGolongan("B");
        p2.setPotongan(600000);

        System.out.println("\nData 2");
        p2.print("");
        p2.setGajiPokok();

        System.out.println("Gaji Pokok  : " + p2.getGajiPokok());
        System.out.println("Tunjangan   : " + p2.getTunjangan());
        System.out.println("Potongan    : " + p2.getPotongan());
        System.out.println("Gaji Bersih : " + p2.getGajiBersih());

        System.out.println("\nJumlah Pegawai : " + Pegawai.getJumlahPegawai());
    }
}
