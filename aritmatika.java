/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class aritmatika {
    int tambah(int a,int b){
        int c= a+b;
        if (c % 2 != 0) {
            System.out.println("Hasil adalah bilangan ganjil");
        } else {
            System.out.println("Hasil adalah bilangan genap");
        }
        
        return c;
    }
    public static void main(String[] args){
        aritmatika arimatika = new aritmatika();
        int a = arimatika.tambah(12, 11);
        System.out.println("hasil " +a);
    }
}
