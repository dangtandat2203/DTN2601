import java.util.Random;

public class Exercise1 {

    public static void run() {
        question1();
        question2();
        question3();
        question4();
    }

    // Q1: Khai báo 2 số lương float, làm tròn ra int
    static void question1() {
        System.out.println("-- Q1 --");
        float salary1 = 5240.5f;
        float salary2 = 10970.055f;

        int rounded1 = Math.round(salary1);
        int rounded2 = Math.round(salary2);

        System.out.println("Lương Account 1: " + salary1 + " -> làm tròn: " + rounded1);
        System.out.println("Lương Account 2: " + salary2 + " -> làm tròn: " + rounded2);
    }

    // Q2: Lấy ngẫu nhiên 1 số có 5 chữ số (padding 0 ở đầu nếu cần)
    static void question2() {
        System.out.println("-- Q2 --");
        Random random = new Random();
        int number = random.nextInt(100000); // 0 -> 99999
        String formatted = String.format("%05d", number);
        System.out.println("Số 5 chữ số: " + formatted);
    }

    // Q3: Lấy 2 số cuối của số ở Q2
    static void question3() {
        System.out.println("-- Q3 --");
        Random random = new Random();
        int number = random.nextInt(100000);
        String formatted = String.format("%05d", number);
        System.out.println("Số 5 chữ số: " + formatted);

        // Cách 1: convert ra String rồi lấy 2 ký tự cuối
        String last2ByString = formatted.substring(formatted.length() - 2);
        System.out.println("2 số cuối (cách 1 - String): " + last2ByString);

        // Cách 2: chia lấy dư cho 100
        int last2ByModulo = number % 100;
        System.out.println("2 số cuối (cách 2 - modulo): " + String.format("%02d", last2ByModulo));
    }

    // Q4: Method nhập vào 2 số nguyên a và b, trả về thương
    static void question4() {
        System.out.println("-- Q4 --");
        System.out.println("divide(10, 3) = " + divide(10, 3));
        System.out.println("divide(7, 2) = " + divide(7, 2));
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }
}
