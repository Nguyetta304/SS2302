package btvn;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(" nhap vao so dien, so nuoc va dich vu khac");
        Scanner in = new Scanner(System.in);
        double soDien = in.nextDouble();
        double soNuoc = in.nextDouble();
        double dichVuKhac = in.nextDouble();
        double tienDien = soDien * 4000;
        double tienNuoc = soNuoc * 30000;
        double giaPhong = 2000000;
        double tienPhong = tienDien + tienNuoc + dichVuKhac + giaPhong;
        System.out.printf(" tien nha la :%10.2f dong", tienPhong);

        }
    }
