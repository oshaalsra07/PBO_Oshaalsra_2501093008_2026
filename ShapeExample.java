/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_04062026;

/**
 *
 * @author LAB-SI-PC
 */
public class ShapeExample {
    public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape s = new Square(4);

        System.out.println(c.getName() + " Area = " + c.getArea());
        System.out.println(s.getName() + " Area = " + s.getArea());
    }
}
}
