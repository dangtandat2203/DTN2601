import java.time.LocalDate;

public class Exercise2 {

    public static void run() {
        question1();
    }

    // Q1: Tạo array Account gồm 5 phần tử bằng vòng for
    static void question1() {
        System.out.println("-- Q1 --");
        Account[] accounts = new Account[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].setEmail("Email " + (i + 1));
            accounts[i].setUsername("User name " + (i + 1));
            accounts[i].setFullName("Full name " + (i + 1));
            accounts[i].setCreateDate(LocalDate.now());
        }

        for (Account acc : accounts) {
            System.out.println("Email: " + acc.getEmail()
                    + " | Username: " + acc.getUsername()
                    + " | FullName: " + acc.getFullName()
                    + " | CreateDate: " + acc.getCreateDate());
        }
    }
}
