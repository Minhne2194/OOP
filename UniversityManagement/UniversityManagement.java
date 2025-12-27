import java.util.ArrayList;

public class UniversityManagement {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        Lecture lec = new Lecture(
            "GV001", "Nguyen Van A", "10/05/1985", "Nam", "Ha Noi", 
            "Dao tao", "CNTT", "CNTT", 4.34
        );

        Staff st = new Staff(
            "NV001", "Tran Thi B", "15/09/1990", "Nu", "Da Nang", 
            "Hanh chinh", "Phong Tai vu"
        );

        list.add(lec);
        list.add(st);

        System.out.println("===== Danh sach nhan su =====");
        for (Person p : list) {
            p.displayInfo();
        }
    }
}