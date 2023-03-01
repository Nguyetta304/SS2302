package bai2;

public abstract class NhanVien {
    private  String MaNhanVien;
    private   String HoTen;
    private  String NamSinh;
    private String DiaChi;
    public NhanVien(){

    }

    public NhanVien(String maNhanVien, String hoTen, String namSinh, String diaChi) {
        MaNhanVien = maNhanVien;
        HoTen = hoTen;
        NamSinh = namSinh;
        DiaChi = diaChi;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

       public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNhanVien='" + MaNhanVien + '\'' +
                ", HoTen='" + HoTen + '\'' +
                ", NamSinh='" + NamSinh + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }

    public abstract String moTaCongViec();
}
