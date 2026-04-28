import java.util.Scanner;

public class Exercise4 {

    static final Scanner scanner = new Scanner(System.in);

    // Sample groups data dùng cho Q8, Q9
    static final String[] GROUPS = {
        "Java Basic", "Java Advanced", "Python Programming",
        "Java Web", "C++ Fundamentals", "Java", "Android Dev", "Java Spring Boot"
    };

    public static void run() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
    }

    // Q1: Đếm số lượng từ trong chuỗi (các từ cách nhau nhiều khoảng trắng)
    static void question1() {
        System.out.println("-- Q1: Đếm số từ --");
        System.out.print("Nhập chuỗi: ");
        String line = scanner.nextLine();
        String trimmed = line.trim();
        int count = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        System.out.println("Số lượng từ: " + count);
    }

    // Q2: Nối chuỗi s2 vào sau s1
    static void question2() {
        System.out.println("-- Q2: Nối chuỗi --");
        System.out.print("Nhập s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập s2: ");
        String s2 = scanner.nextLine();
        System.out.println("Kết quả: " + s1 + s2);
    }

    // Q3: Kiểm tra chữ cái đầu, nếu chưa hoa thì viết hoa lên
    static void question3() {
        System.out.println("-- Q3: Viết hoa chữ cái đầu --");
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        if (!name.isEmpty() && Character.isLowerCase(name.charAt(0))) {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        }
        System.out.println("Kết quả: " + name);
    }

    // Q4: In từng ký tự trong tên (uppercase)
    static void question4() {
        System.out.println("-- Q4: In từng ký tự --");
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine().toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
        }
    }

    // Q5: Nhập họ, nhập tên, in họ tên đầy đủ
    static void question5() {
        System.out.println("-- Q5: Họ và tên --");
        System.out.print("Nhập họ: ");
        String lastName = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String firstName = scanner.nextLine();
        System.out.println("Họ và tên đầy đủ: " + lastName + " " + firstName);
    }

    // Q6: Tách họ và tên đầy đủ thành họ, tên đệm, tên
    static void question6() {
        System.out.println("-- Q6: Tách họ, tên đệm, tên --");
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length >= 3) {
            System.out.println("Họ là: " + parts[0]);
            StringBuilder middle = new StringBuilder();
            for (int i = 1; i < parts.length - 1; i++) {
                if (i > 1) middle.append(" ");
                middle.append(parts[i]);
            }
            System.out.println("Tên đệm là: " + middle);
            System.out.println("Tên là: " + parts[parts.length - 1]);
        } else if (parts.length == 2) {
            System.out.println("Họ là: " + parts[0]);
            System.out.println("Tên là: " + parts[1]);
        } else {
            System.out.println("Tên là: " + fullName.trim());
        }
    }

    // Q7: Chuẩn hóa họ và tên (trim, collapse spaces, viết hoa chữ cái đầu mỗi từ)
    static void question7() {
        System.out.println("-- Q7: Chuẩn hóa họ và tên --");
        System.out.print("Nhập họ và tên: ");
        String raw = scanner.nextLine();

        // a) Xóa dấu cách đầu, cuối và giữa thừa
        String normalized = raw.trim().replaceAll("\\s+", " ");
        System.out.println("a) Xóa dấu cách thừa: \"" + normalized + "\"");

        // b) Viết hoa chữ cái đầu mỗi từ
        String[] words = normalized.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (!w.isEmpty()) {
                result.append(Character.toUpperCase(w.charAt(0)))
                      .append(w.substring(1).toLowerCase());
            }
            if (i < words.length - 1) result.append(" ");
        }
        System.out.println("b) Viết hoa chữ cái đầu: \"" + result + "\"");
    }

    // Q8: In tất cả groups có chứa chữ "Java"
    static void question8() {
        System.out.println("-- Q8: Groups chứa \"Java\" --");
        for (String g : GROUPS) {
            if (g.contains("Java")) {
                System.out.println(g);
            }
        }
    }

    // Q9: In tất cả groups có tên là "Java" (exact match)
    static void question9() {
        System.out.println("-- Q9: Groups tên là \"Java\" --");
        for (String g : GROUPS) {
            if (g.equals("Java")) {
                System.out.println(g);
            }
        }
    }

    // Q10: Kiểm tra 2 chuỗi có là đảo ngược nhau không
    static void question10() {
        System.out.println("-- Q10: Kiểm tra chuỗi đảo ngược --");
        System.out.print("Nhập chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String str2 = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = str1.length() - 1; i >= 0; i--) {
            sb.append(str1.charAt(i));
        }
        System.out.println(sb.toString().equals(str2) ? "OK" : "KO");
    }

    // Q11: Tìm số lần xuất hiện ký tự 'a' trong chuỗi
    static void question11() {
        System.out.println("-- Q11: Đếm ký tự 'a' --");
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a') count++;
        }
        System.out.println("Số lần xuất hiện 'a': " + count);
    }

    // Q12: Đảo ngược chuỗi bằng vòng lặp (không dùng thư viện)
    static void question12() {
        System.out.println("-- Q12: Đảo ngược chuỗi --");
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        System.out.println("Chuỗi đảo ngược: " + result);
    }

    // Q13: Kiểm tra chuỗi không chứa chữ số (true nếu không có, false nếu có hoặc null)
    static void question13() {
        System.out.println("-- Q13: Chuỗi không chứa chữ số --");
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        boolean result = str != null && !str.isEmpty() && !str.matches(".*\\d.*");
        System.out.println(result);
    }

    // Q14: Thay thế ký tự chỉ định sang ký tự khác
    static void question14() {
        System.out.println("-- Q14: Thay thế ký tự --");
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự cần thay: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Nhập ký tự thay thế: ");
        char newChar = scanner.nextLine().charAt(0);
        System.out.println("Kết quả: " + str.replace(oldChar, newChar));
    }

    // Q15: Đảo ngược các từ trong chuỗi (không dùng thư viện)
    static void question15() {
        System.out.println("-- Q15: Đảo ngược từ --");
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine().trim();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (result.length() > 0) result.append(" ");
                result.append(words[i]);
            }
        }
        System.out.println("Kết quả: " + result);
    }

    // Q16: Chia chuỗi thành các phần bằng nhau n ký tự, nếu không chia được in "KO"
    static void question16() {
        System.out.println("-- Q16: Chia chuỗi thành phần bằng nhau --");
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập n: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
        if (n <= 0 || str.length() % n != 0) {
            System.out.println("KO");
        } else {
            for (int i = 0; i < str.length(); i += n) {
                System.out.println(str.substring(i, i + n));
            }
        }
    }
}
