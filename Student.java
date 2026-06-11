/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_04062026;

/**
 *
 * @author LAB-SI-PC
 */
public class Student extends Person {
    
    public Student() {
        super("anna", "padang");
        System.out.println("Inside student:constructor");
    }
    @Override
    public String getName() {
        System.out.println("getName() student");
        return name;
    }
    public static void main(String[] args) {
        Student anna = new Student();
        System.out.println(anna.name);
        System.out.println(anna.address);
    }
}
