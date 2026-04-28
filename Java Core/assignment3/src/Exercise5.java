import java.util.Arrays;
import java.util.Comparator;

public class Exercise5 {

    public static void run() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
    }

    // Q1: In thông tin phòng ban thứ 1 (toString())
    static void question1() {
        System.out.println("-- Q1 --");
        Department dept1 = new Department(1, "Phòng A", "123 Đường Lê Lợi, Q1");
        System.out.println(dept1);
    }

    // Q2: In thông tin tất cả phòng ban (toString())
    static void question2() {
        System.out.println("-- Q2 --");
        Department[] depts = buildDepartments();
        for (Department d : depts) {
            System.out.println(d);
        }
    }

    // Q3: In địa chỉ của phòng ban thứ 1
    static void question3() {
        System.out.println("-- Q3 --");
        Department dept1 = buildDepartments()[0];
        System.out.println("Địa chỉ phòng ban thứ 1: " + dept1.getAddress());
    }

    // Q4: Kiểm tra phòng ban thứ 1 có tên là "Phòng A" không
    static void question4() {
        System.out.println("-- Q4 --");
        Department dept1 = buildDepartments()[0];
        System.out.println("Phòng ban thứ 1 có tên là \"Phòng A\": " + dept1.getName().equals("Phòng A"));
    }

    // Q5: So sánh phòng ban thứ 1 và thứ 2 (bằng nhau khi tên bằng nhau)
    static void question5() {
        System.out.println("-- Q5 --");
        Department[] depts = buildDepartments();
        System.out.println("Phòng ban 1 và 2 có bằng nhau không: " + depts[0].equals(depts[1]));
    }

    // Q6: Sắp xếp 5 phòng ban tăng dần theo tên (case-insensitive A-Z) dùng Comparable
    static void question6() {
        System.out.println("-- Q6: Sắp xếp tăng dần (A-Z, không phân biệt hoa/thường) --");
        Department[] depts = {
            new Department(1, "Sale", "Addr 1"),
            new Department(2, "Boss of director", "Addr 2"),
            new Department(3, "Accounting", "Addr 3"),
            new Department(4, "Marketing", "Addr 4"),
            new Department(5, "Waiting room", "Addr 5")
        };
        Arrays.sort(depts); // dùng Department.compareTo (compareToIgnoreCase)
        for (Department d : depts) {
            System.out.println(d.getName());
        }
    }

    // Q7: Sắp xếp 5 phòng ban theo tên dùng Comparator (case-sensitive)
    static void question7() {
        System.out.println("-- Q7: Sắp xếp theo tên (phân biệt hoa/thường) --");
        Department[] depts = {
            new Department(1, "Sale", "Addr 1"),
            new Department(2, "Boss of director", "Addr 2"),
            new Department(3, "Accounting", "Addr 3"),
            new Department(4, "Marketing", "Addr 4"),
            new Department(5, "waiting room", "Addr 5")
        };
        Arrays.sort(depts, Comparator.comparing(Department::getName));
        for (Department d : depts) {
            System.out.println(d.getName());
        }
    }

    // Helper: tạo array 5 phòng ban mẫu
    static Department[] buildDepartments() {
        return new Department[]{
            new Department(1, "Phòng A", "123 Đường Lê Lợi, Q1"),
            new Department(2, "Phòng B", "456 Đường Trần Hưng Đạo, Q5"),
            new Department(3, "Marketing", "789 Đường Nguyễn Huệ, Q1"),
            new Department(4, "Sale", "101 Đường Pasteur, Q3"),
            new Department(5, "Accounting", "202 Đường Điện Biên Phủ, Q3")
        };
    }
}
