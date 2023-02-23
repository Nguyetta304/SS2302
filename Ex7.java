package btvn;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(" nhap vao a, b");
        Scanner in = new Scanner( System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double cv = (a + b) * 2;
        double dt = a * b;
        System.out.printf(" hinhchunhat co chu vi = %10.2f cm, dien tich = %10.2f cm2 ",cv,dt);
    }
}
