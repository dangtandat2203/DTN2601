import java.util.List;

public class Exercise6 {
    private List<Account> accounts;

    public Exercise6(List<Account> accounts) {
        this.accounts = accounts;
    }

    // Q1: In cac so chan nguyen duong nho hon 10
    public void question1() {
        System.out.print("So chan nguyen duong nho hon 10: ");
        for (int i = 2; i < 10; i += 2) System.out.print(i + " ");
        System.out.println();
    }

    // Q2: In thong tin cac account
    public void question2() {
        for (Account a : accounts) {
            System.out.println("ID: " + a.getId()
                    + " | Email: " + a.getEmail()
                    + " | Full name: " + a.getFullName()
                    + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A")
                    + " | Position: " + (a.getPosition() != null ? a.getPosition().getName() : "N/A"));
        }
    }

    // Q3: In cac so nguyen duong nho hon 10
    public void question3() {
        System.out.print("So nguyen duong nho hon 10: ");
        for (int i = 1; i < 10; i++) System.out.print(i + " ");
        System.out.println();
    }
}
