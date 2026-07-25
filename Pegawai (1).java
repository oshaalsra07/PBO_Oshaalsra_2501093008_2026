/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OshaAlsra18062026;

/**
 *
 * @author LAB-SI-PC
 */
public class Pegawai {
    private String NIP;
    private String NamaPegawai;
    private String jabatan;
    private double GajiPokok;
    private double Tunjangan;
    private double Pajak;
    private double GajiBersih;
    private double Keterangan;

    public void setNip(String nip) {
        this.NIP = nip;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.NamaPegawai = namaPegawai;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.GajiPokok = gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.Tunjangan = tunjangan;
    }

    public void setPajak(double pajak) {
        this.Pajak = pajak;
    }

    public double getGajiBersih() {
        double total = GajiPokok + Tunjangan;
        double potongan = total * Pajak / 100;
        return total - potongan;
    }

    public String getKeterangan() {
        if (getGajiBersih() >= 10000000) {
            return "Gaji Tinggi";
        } else if (getGajiBersih() >= 5000000) {
            return "Gaji Sedang";
        } else {
            return "Gaji Rendah";
        }
    }
}
