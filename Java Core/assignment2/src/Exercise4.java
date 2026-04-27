import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    private final Random random = new Random();

    // Q1: In ngau nhien 1 so nguyen
    public void question1() {
        System.out.println("So nguyen ngau nhien: " + random.nextInt());
    }

    // Q2: In ngau nhien 1 so thuc
    public void question2() {
        System.out.println("So thuc ngau nhien: " + random.nextDouble());
    }

    // Q3: In ngau nhien ten 1 ban trong lop
    public void question3() {
        String[] names = {"Nguyen Van A", "Tran Thi B", "Le Van C", "Pham Thi D", "Hoang Van E"};
        System.out.println("Ten ngau nhien: " + names[random.nextInt(names.length)]);
    }

    // Q4: Random ngay trong khoang 24-07-1995 den 20-12-1995
    public void question4() {
        LocalDate start = LocalDate.of(1995, 7, 24);
        LocalDate end   = LocalDate.of(1995, 12, 20);
        long randomDay  = start.toEpochDay() + (long)(random.nextDouble() * (end.toEpochDay() - start.toEpochDay()));
        System.out.println("Ngay ngau nhien (24/07/1995 - 20/12/1995): " + LocalDate.ofEpochDay(randomDay));
    }

    // Q5: Random ngay trong 1 nam tro lai day
    public void question5() {
        LocalDate now       = LocalDate.now();
        LocalDate oneYearAgo = now.minusYears(1);
        long randomDay = oneYearAgo.toEpochDay() + (long)(random.nextDouble() * (now.toEpochDay() - oneYearAgo.toEpochDay()));
        System.out.println("Ngay ngau nhien (1 nam tro lai): " + LocalDate.ofEpochDay(randomDay));
    }

    // Q6: Random ngay trong qua khu (100 nam tro lai)
    public void question6() {
        LocalDate now      = LocalDate.now();
        LocalDate pastStart = now.minusYears(100);
        long randomDay = pastStart.toEpochDay() + (long)(random.nextDouble() * (now.toEpochDay() - pastStart.toEpochDay()));
        System.out.println("Ngay ngau nhien trong qua khu: " + LocalDate.ofEpochDay(randomDay));
    }

    // Q7: Random so co 3 chu so (100 - 999)
    public void question7() {
        System.out.println("So 3 chu so ngau nhien: " + (100 + random.nextInt(900)));
    }
}
