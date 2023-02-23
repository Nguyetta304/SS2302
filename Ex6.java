package btvn;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("nhap vao cac so a,b,c ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double cv = a+b+c;
        double p = cv/2;
        double dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                if ((a < b+c) || (b < a+c ) || (c< a+b))
                    System.out.println(" abc la tam giac");
                else
                    System.out.println(" abc khong phai la tam giac");
        System.out.printf( "chu vi cua tam giac : %10.2f cm, dien tich cua tam giac : %10.2f cm2",cv,dt);

    }
}
