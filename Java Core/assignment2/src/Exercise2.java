
import java.time.LocalDateTime;
import java.util.List;

public class Exercise2 {
    private List<Account> accounts;

    public Exercise2(List<Account> accounts) {
        this.accounts = accounts;
    }

    // Q1: In so nguyen 5
    public void question1() {
        int n = 5;
        System.out.printf("So nguyen: %d%n", n);
    }

    // Q2: In 100000000 theo dinh dang 100,000,000
    public void question2() {
        int n = 100_000_000;
        System.out.printf("So nguyen: %,d%n", n);
    }

    // Q3: In so thuc chi 4 chu so sau dau phay
    public void question3() {
        double d = 5.567098;
        System.out.printf("So thuc: %.4f%n", d);
    }

    // Q4: In ho va ten theo dinh dang yeu cau
    public void question4() {
        String hoTen = "Nguyen Van A";
        System.out.printf("Ten toi la \"%s\" va toi dang doc than.%n", hoTen);
    }

    // Q5: In thoi gian hien tai theo dinh dang 24/04/2020 11h:16p:20s
    public void question5() {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("%02d/%02d/%04d %02dh:%02dp:%02ds%n",
                now.getDayOfMonth(),
                now.getMonthValue(),
                now.getYear(),
                now.getHour(),
                now.getMinute(),
                now.getSecond());
    }

    // Q6: In thong tin account theo dinh dang table (giong Database)
    public void question6() {
        String separator = "+----+---------------------------+----------------------+--------------------+";
        System.out.println(separator);
        System.out.printf("| %-2s | %-25s | %-20s | %-18s |%n", "ID", "Email", "Full Name", "Phong Ban");
        System.out.println(separator);
        for (Account a : accounts) {
            System.out.printf("| %-2d | %-25s | %-20s | %-18s |%n",
                    a.getId(),
                    a.getEmail(),
                    a.getFullName(),
                    a.getDepartment() != null ? a.getDepartment().getName() : "N/A");
        }
        System.out.println(separator);
    }
}
