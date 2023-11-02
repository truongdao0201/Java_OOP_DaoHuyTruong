package baitap_oop2.person;

public class Person {
    private String name;
    private String age;
    private String gender;
    private String address;
    private String phone;

    Person (){

    }
    public Person (String name, String age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    protected void setInfor(){
        this.name = "Đào Huy Trường";
        this.age = "25";
        this.gender = "Nam";
        this.address = "Quận 12";
        this.phone = "0395891177";
    }
    protected void showInfor (){
        System.out.println("Họ tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("SĐt: " + this.phone);
    }
    public void showCompany (){
        System.out.println("Họ tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
    }
}
