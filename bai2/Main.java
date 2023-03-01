package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien nv1 = new KyThuat("gen 12345","Ta Thi Nguyet","30/04/2000","Bac Giang","Dien Tu");
        System.out.println("nhap vao ma nhan vien: ");
        String mnv = in.nextLine();
        System.out.println(" nhap vao ho ten : ");
        String ht = in.nextLine();
        System.out.println("nhap vao nam sinh: ");
        String ns = in.nextLine();
        System.out.println("nhap vao dia chi: ");
        String dc  = in.nextLine();
        System.out.println("nhap vao chuyen nganh: ");
        String cn = in.nextLine();
        in.close();
        NhanVien nv2 = new KyThuat(mnv,ht,ns,dc,cn);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
