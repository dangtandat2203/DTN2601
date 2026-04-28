public class Exercise3 {

    public static void run() {
        question1();
        question2();
        question3();
    }

    // Q1: Integer salary = 5000, convert ra float, in với 2 số thập phân
    static void question1() {
        System.out.println("-- Q1 --");
        Integer salary = 5000;
        float salaryFloat = salary.floatValue();
        System.out.printf("Lương (float): %.2f%n", salaryFloat);
    }

    // Q2: String "1234567" -> convert ra int bằng parseInt
    static void question2() {
        System.out.println("-- Q2 --");
        String strNum = "1234567";
        int num = Integer.parseInt(strNum);
        System.out.println("String \"" + strNum + "\" -> int: " + num);
    }

    // Q3: Integer.valueOf("1234567") -> unbox ra int
    static void question3() {
        System.out.println("-- Q3 --");
        Integer boxed = Integer.valueOf("1234567");
        int unboxed = boxed; // unboxing
        System.out.println("Integer.valueOf(\"1234567\") -> int: " + unboxed);
    }
}
