import java.time.format.DateTimeFormatter;
import java.util.List;

public class Exercise3 {
    private List<Exam> exams;

    public Exercise3(List<Exam> exams) {
        this.exams = exams;
    }

    // Q1: In thong tin Exam thu 1, createDate format Vietnamese
    public void question1() {
        Exam exam = exams.get(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'ngay' dd 'thang' MM 'nam' yyyy");
        System.out.println("ID     : " + exam.getId());
        System.out.println("Code   : " + exam.getCode());
        System.out.println("Title  : " + exam.getTitle());
        System.out.println("Ngay tao: " + exam.getCreateDate().format(formatter));
    }

    // Q2: In theo dinh dang: Nam - Thang - Ngay - Gio - Phut - Giay
    public void question2() {
        Exam exam = exams.get(0);
        // LocalDate khong co gio/phut/giay, dung atStartOfDay de lay 00:00:00
        var dt = exam.getCreateDate().atStartOfDay();
        System.out.printf("Nam: %d - Thang: %d - Ngay: %d - Gio: %d - Phut: %d - Giay: %d%n",
                dt.getYear(), dt.getMonthValue(), dt.getDayOfMonth(),
                dt.getHour(), dt.getMinute(), dt.getSecond());
    }

    // Q3: Chi in ra nam
    public void question3() {
        System.out.println("Nam: " + exams.get(0).getCreateDate().getYear());
    }

    // Q4: Chi in ra thang va nam
    public void question4() {
        var date = exams.get(0).getCreateDate();
        System.out.println("Thang: " + date.getMonthValue() + " - Nam: " + date.getYear());
    }

    // Q5: Chi in ra MM-DD
    public void question5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println(exams.get(0).getCreateDate().format(formatter));
    }
}
