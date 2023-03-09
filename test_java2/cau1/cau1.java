package test_java2.cau1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = in.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = in.nextInt();
        }
        //in ra cac phan tu cua mang
        System.out.print("cac phan tu cua mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
// tinh tong cac phan tu cua mang
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.printf("\n tong cua mang la: " + sum);
        //Tìm phần tử có giá trị lớn nhất và giá trị nhỏ nhất.
        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\n phan tu lon nhat la: " + max);
        System.out.println("phan tu nho nhat la: " + min);
        //In và tính tổng các phần tử là số lẻ và chia hết cho 3.
        System.out.println("phan tu so le chia het cho 3 la: ");
        int tong =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] % 3 == 0) {
                System.out.println(arr[i] + "\t");
                 tong+=arr[i];
            }
        }
                System.out.println("tong cua phan tu so le chia het cho 3 la \t"+ tong);
        //Sắp xếp các phần tử trong mảng theo thứ tự giá trị các phần tử giảm dần.
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(" cac phan tu co gia tri giam dan la: ");
        for( int i=0;i<n;i++){
            System.out.printf(arr[i]+" \t");
        }
    //Nhập một số nguyên dương x từ bàn phím. Đếm số lần xuất hiện của x trong mảng đã cho.
        int j=0;
        System.out.println("\n Nhap x: ");
        int x = in.nextInt();
        for(int i=0; i<n;i++){
            if(arr[i] == x){
                j++;
            }
        }
        System.out.println();
        System.out.println("So lan x xuat hien:" + j);
    }
}


