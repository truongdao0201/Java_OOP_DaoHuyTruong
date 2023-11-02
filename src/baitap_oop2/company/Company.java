package baitap_oop2.company;

import baitap_oop2.person.Person;

public class Company{
    public static void main(String[] args) {
        Person nv1 = new Person("Đào Huy Trường", "25", "Nam");
        Person nv2 = new Person("Đào Bảo Ngọc", "24", "Nữ");
        Person nv3 = new Person("Đào Quốc Hưng", "23", "Nam");
        System.out.println("------- Danh sách công nhân -------");
        nv1.showCompany();
        nv2.showCompany();
        nv3.showCompany();
    }
}
