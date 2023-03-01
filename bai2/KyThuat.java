package bai2;

public class KyThuat extends NhanVien {
    private String ChuyenNganh;
    public KyThuat(){

    }

    public KyThuat(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        ChuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "NhanVien {" +
                "maNhanVien='" + super.getMaNhanVien() + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", namSinh='" + super.getNamSinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                "ChuyenNganh='" + ChuyenNganh + '\'' +
                '}';
    }
    @Override
    public String moTaCongViec(){
        return "Nhan Vien Ky Thuat";
    }


}
