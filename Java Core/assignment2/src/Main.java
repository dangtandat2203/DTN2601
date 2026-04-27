import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputData input = new InputData();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("        MENU QUAN LY DU LIEU           ");
            System.out.println("========================================");
            System.out.println("  1. Tao du lieu gia");
            System.out.println("  2. Nhap du lieu tay");
            System.out.println("  3. In toan bo du lieu");
            System.out.println("  4. Chay Exercise 1 - Flow Control");
            System.out.println("  5. Chay Exercise 2 - Printf");
            System.out.println("  6. Chay Exercise 3 - Date Format");
            System.out.println("  7. Chay Exercise 4 - Random");
            System.out.println("  8. Chay Exercise 5 - Input Console");
            System.out.println("  9. Chay Exercise 6 - Method");
            System.out.println("  0. Thoat");
            System.out.println("========================================");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: input.taoduLieuGia(); break;
                case 2: input.nhapDuLieu();   break;
                case 3: input.inDuLieu();     break;
                case 4:
                    if (input.accountList.isEmpty()) System.out.println("Chua co du lieu! Hay chon 1 hoac 2 truoc.");
                    else runExercise1Menu(sc, input);
                    break;
                case 5:
                    if (input.accountList.isEmpty()) System.out.println("Chua co du lieu! Hay chon 1 hoac 2 truoc.");
                    else runExercise2Menu(sc, input);
                    break;
                case 6:
                    if (input.examList.isEmpty()) System.out.println("Chua co du lieu! Hay chon 1 hoac 2 truoc.");
                    else runExercise3Menu(sc, input);
                    break;
                case 7:
                    runExercise4Menu(sc);
                    break;
                case 8:
                    if (input.accountList.isEmpty()) System.out.println("Chua co du lieu! Hay chon 1 hoac 2 truoc.");
                    else runExercise5Menu(sc, input);
                    break;
                case 9:
                    if (input.accountList.isEmpty()) System.out.println("Chua co du lieu! Hay chon 1 hoac 2 truoc.");
                    else runExercise6Menu(sc, input);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        } while (choice != 0);

        sc.close();
    }

    private static void runExercise1Menu(Scanner sc, InputData input) {
        Exercise1 ex = new Exercise1(input.accountList, input.departmentList,
                input.groupList, input.groupAccountList);
        int q;
        do {
            System.out.println("\n========== MENU EXERCISE 1 ==========");
            System.out.println(" [IF]");
            System.out.println("  1.  Q1  - Kiem tra phong ban account thu 2");
            System.out.println("  2.  Q2  - Kiem tra group account thu 2");
            System.out.println("  3.  Q3  - Ternary: phong ban account thu 2");
            System.out.println("  4.  Q4  - Ternary: position account thu 1");
            System.out.println(" [SWITCH]");
            System.out.println("  5.  Q5  - So luong account trong nhom thu 1");
            System.out.println("  6.  Q6  - Switch: group account thu 2");
            System.out.println("  7.  Q7  - Switch: position account thu 1");
            System.out.println(" [FOREACH]");
            System.out.println("  8.  Q8  - In thong tin tat ca account");
            System.out.println("  9.  Q9  - In thong tin tat ca department");
            System.out.println(" [FOR]");
            System.out.println(" 10.  Q10 - In account co dinh dang");
            System.out.println(" 11.  Q11 - In department co dinh dang");
            System.out.println(" 12.  Q12 - Chi in 2 department dau tien");
            System.out.println(" 13.  Q13 - In account ngoai tru account thu 2");
            System.out.println(" 14.  Q14 - In account co id < 4");
            System.out.println(" 15.  Q15 - In so chan <= 20");
            System.out.println(" [WHILE]");
            System.out.println(" 16.  Q16 - While: lam lai Q10-Q15");
            System.out.println(" [DO-WHILE]");
            System.out.println(" 17.  Q17 - Do-While: lam lai Q10-Q15");
            System.out.println("  0.  Quay lai");
            System.out.println("======================================");
            System.out.print("Chon cau hoi: ");
            q = sc.nextInt(); sc.nextLine();
            switch (q) {
                case 1:  ex.question1();  break;
                case 2:  ex.question2();  break;
                case 3:  ex.question3();  break;
                case 4:  ex.question4();  break;
                case 5:  ex.question5();  break;
                case 6:  ex.question6();  break;
                case 7:  ex.question7();  break;
                case 8:  ex.question8();  break;
                case 9:  ex.question9();  break;
                case 10: ex.question10(); break;
                case 11: ex.question11(); break;
                case 12: ex.question12(); break;
                case 13: ex.question13(); break;
                case 14: ex.question14(); break;
                case 15: ex.question15(); break;
                case 16: ex.question16(); break;
                case 17: ex.question17(); break;
                case 0:  break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (q != 0);
    }

    private static void runExercise2Menu(Scanner sc, InputData input) {
        Exercise2 ex = new Exercise2(input.accountList);
        int q;
        do {
            System.out.println("\n========== MENU EXERCISE 2 ==========");
            System.out.println("  1. Q1 - In so nguyen 5");
            System.out.println("  2. Q2 - In 100,000,000");
            System.out.println("  3. Q3 - In so thuc 4 chu so thap phan");
            System.out.println("  4. Q4 - In ho ten theo dinh dang");
            System.out.println("  5. Q5 - In thoi gian hien tai");
            System.out.println("  6. Q6 - In account theo dinh dang table");
            System.out.println("  0. Quay lai");
            System.out.println("======================================");
            System.out.print("Chon cau hoi: ");
            q = sc.nextInt(); sc.nextLine();
            switch (q) {
                case 1: ex.question1(); break;
                case 2: ex.question2(); break;
                case 3: ex.question3(); break;
                case 4: ex.question4(); break;
                case 5: ex.question5(); break;
                case 6: ex.question6(); break;
                case 0: break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (q != 0);
    }

    private static void runExercise3Menu(Scanner sc, InputData input) {
        Exercise3 ex = new Exercise3(input.examList);
        int q;
        do {
            System.out.println("\n========== MENU EXERCISE 3 ==========");
            System.out.println("  1. Q1 - In Exam thu 1 (Vietnamese date)");
            System.out.println("  2. Q2 - Nam-Thang-Ngay-Gio-Phut-Giay");
            System.out.println("  3. Q3 - Chi in nam");
            System.out.println("  4. Q4 - Chi in thang va nam");
            System.out.println("  5. Q5 - Chi in MM-DD");
            System.out.println("  0. Quay lai");
            System.out.println("======================================");
            System.out.print("Chon cau hoi: ");
            q = sc.nextInt(); sc.nextLine();
            switch (q) {
                case 1: ex.question1(); break;
                case 2: ex.question2(); break;
                case 3: ex.question3(); break;
                case 4: ex.question4(); break;
                case 5: ex.question5(); break;
                case 0: break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (q != 0);
    }

    private static void runExercise4Menu(Scanner sc) {
        Exercise4 ex = new Exercise4();
        int q;
        do {
            System.out.println("\n========== MENU EXERCISE 4 ==========");
            System.out.println("  1. Q1 - Random so nguyen");
            System.out.println("  2. Q2 - Random so thuc");
            System.out.println("  3. Q3 - Random ten ban trong lop");
            System.out.println("  4. Q4 - Random ngay (24/07/1995 - 20/12/1995)");
            System.out.println("  5. Q5 - Random ngay trong 1 nam tro lai");
            System.out.println("  6. Q6 - Random ngay trong qua khu");
            System.out.println("  7. Q7 - Random so co 3 chu so");
            System.out.println("  0. Quay lai");
            System.out.println("======================================");
            System.out.print("Chon cau hoi: ");
            q = sc.nextInt(); sc.nextLine();
            switch (q) {
                case 1: ex.question1(); break;
                case 2: ex.question2(); break;
                case 3: ex.question3(); break;
                case 4: ex.question4(); break;
                case 5: ex.question5(); break;
                case 6: ex.question6(); break;
                case 7: ex.question7(); break;
                case 0: break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (q != 0);
    }

    private static void runExercise5Menu(Scanner sc, InputData input) {
        Exercise5 ex = new Exercise5(sc, input.accountList, input.departmentList,
                input.groupList, input.groupAccountList);
        int q;
        do {
            System.out.println("\n========== MENU EXERCISE 5 ==========");
            System.out.println("  1.  Q1  - Nhap 3 so nguyen");
            System.out.println("  2.  Q2  - Nhap 2 so thuc");
            System.out.println("  3.  Q3  - Nhap ho va ten");
            System.out.println("  4.  Q4  - Nhap ngay sinh");
            System.out.println("  5.  Q5  - Tao account");
            System.out.println("  6.  Q6  - Tao department");
            System.out.println("  7.  Q7  - Nhap so chan");
            System.out.println("  8.  Q8  - Menu tao account / department");
            System.out.println("  9.  Q9  - Them group vao account");
            System.out.println(" 10.  Q10 - Menu + them group + hoi tiep tuc");
            System.out.println(" 11.  Q11 - Menu + them account vao group ngau nhien");
            System.out.println("  0.  Quay lai");
            System.out.println("======================================");
            System.out.print("Chon cau hoi: ");
            q = sc.nextInt(); sc.nextLine();
            switch (q) {
                case 1:  ex.question1();  break;
                case 2:  ex.question2();  break;
                case 3:  ex.question3();  break;
                case 4:  ex.question4();  break;
                case 5:  ex.question5();  break;
                case 6:  ex.question6();  break;
                case 7:  ex.question7();  break;
                case 8:  ex.question8();  break;
                case 9:  ex.question9();  break;
                case 10: ex.question10(); break;
                case 11: ex.question11(); break;
                case 0:  break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (q != 0);
    }

    private static void runExercise6Menu(Scanner sc, InputData input) {
        Exercise6 ex = new Exercise6(input.accountList);
        int q;
        do {
            System.out.println("\n========== MENU EXERCISE 6 ==========");
            System.out.println("  1. Q1 - In so chan nguyen duong < 10");
            System.out.println("  2. Q2 - In thong tin cac account");
            System.out.println("  3. Q3 - In so nguyen duong < 10");
            System.out.println("  0. Quay lai");
            System.out.println("======================================");
            System.out.print("Chon cau hoi: ");
            q = sc.nextInt(); sc.nextLine();
            switch (q) {
                case 1: ex.question1(); break;
                case 2: ex.question2(); break;
                case 3: ex.question3(); break;
                case 0: break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (q != 0);
    }
}
