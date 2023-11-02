package baitap_oop1.nhanvien;

public class NhanVien {
    private String fullname;
    private String old;
    private String phone;

    public void setInfor (){
        this.fullname = "Đào Huy Trường";
        this.old = "25";
        this.phone = "0396891177";
    }
    public void showInfor (){
        System.out.println("Họ tên: " + this.fullname);
        System.out.println("Tuổi: " + this.old);
        System.out.println("SĐT: " + this.phone);
    }
}
