import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    private final Scanner sc;
    private final List<Account> accounts;
    private final List<Department> departments;
    private final List<Group> groups;
    private final List<GroupAccount> groupAccounts;

    public Exercise5(Scanner sc, List<Account> accounts, List<Department> departments,
                     List<Group> groups, List<GroupAccount> groupAccounts) {
        this.sc = sc;
        this.accounts = accounts;
        this.departments = departments;
        this.groups = groups;
        this.groupAccounts = groupAccounts;
    }

    // Q1: Nhap 3 so nguyen
    public void question1() {
        System.out.print("Nhap so nguyen 1: "); int a = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap so nguyen 2: "); int b = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap so nguyen 3: "); int c = sc.nextInt(); sc.nextLine();
        System.out.println("3 so nguyen da nhap: " + a + ", " + b + ", " + c);
    }

    // Q2: Nhap 2 so thuc
    public void question2() {
        System.out.print("Nhap so thuc 1: "); double a = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhap so thuc 2: "); double b = sc.nextDouble(); sc.nextLine();
        System.out.println("2 so thuc da nhap: " + a + ", " + b);
    }

    // Q3: Nhap ho va ten
    public void question3() {
        System.out.print("Nhap ho va ten: ");
        String name = sc.nextLine();
        System.out.println("Ho va ten: " + name);
    }

    // Q4: Nhap ngay sinh (yyyy-MM-dd)
    public void question4() {
        System.out.print("Nhap ngay sinh (yyyy-MM-dd): ");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Ngay sinh: " + birthday);
    }

    // Q5: Tao account (viet thanh method)
    public Account taoAccount() {
        Account acc = new Account();
        System.out.print("Nhap ID        : "); acc.setId(sc.nextInt()); sc.nextLine();
        System.out.print("Nhap email     : "); acc.setEmail(sc.nextLine());
        System.out.print("Nhap username  : "); acc.setUsername(sc.nextLine());
        System.out.print("Nhap full name : "); acc.setFullName(sc.nextLine());
        System.out.print("Nhap ngay tao (yyyy-MM-dd): "); acc.setCreateDate(LocalDate.parse(sc.nextLine()));

        System.out.println("Chon Position (1=Dev, 2=Test, 3=ScrumMaster, 4=PM): ");
        int posChoice = sc.nextInt(); sc.nextLine();
        PositionName[] values = PositionName.values();
        if (posChoice >= 1 && posChoice <= values.length) {
            Position pos = new Position();
            pos.setName(values[posChoice - 1].name());
            acc.setPosition(pos);
        } else {
            System.out.println("Lua chon khong hop le, bo qua position.");
        }

        System.out.print("Nhap Department ID (de trong neu khong co): ");
        String deptInput = sc.nextLine().trim();
        if (!deptInput.isEmpty()) {
            int deptId = Integer.parseInt(deptInput);
            for (Department d : departments) {
                if (d.getId() == deptId) { acc.setDepartment(d); break; }
            }
        }

        accounts.add(acc);
        System.out.println("Tao account thanh cong!");
        return acc;
    }

    public void question5() { taoAccount(); }

    // Q6: Tao department (viet thanh method)
    public Department taoDepartment() {
        Department dept = new Department();
        System.out.print("Nhap ID        : "); dept.setId(sc.nextInt()); sc.nextLine();
        System.out.print("Nhap ten phong ban: "); dept.setName(sc.nextLine());
        departments.add(dept);
        System.out.println("Tao department thanh cong!");
        return dept;
    }

    public void question6() { taoDepartment(); }

    // Q7: Nhap so chan (validate loop)
    public void question7() {
        int n;
        do {
            System.out.print("Nhap so chan: ");
            n = sc.nextInt(); sc.nextLine();
            if (n % 2 != 0) System.out.println("So le, vui long nhap lai!");
        } while (n % 2 != 0);
        System.out.println("So chan da nhap: " + n);
    }

    // Q8: Menu tao account / department
    public void question8() {
        int choice;
        do {
            System.out.println("Moi ban nhap vao chuc nang muon su dung:");
            System.out.println("  1. Tao account");
            System.out.println("  2. Tao department");
            System.out.print("Chon: ");
            choice = sc.nextInt(); sc.nextLine();
            if      (choice == 1) taoAccount();
            else if (choice == 2) taoDepartment();
            else System.out.println("Moi ban nhap lai");
        } while (choice != 1 && choice != 2);
    }

    // Q9: Them group vao account
    public void themGroupVaoAccount() {
        System.out.println("Danh sach username:");
        for (Account a : accounts) System.out.println("  - " + a.getUsername());

        System.out.print("Nhap username: ");
        String username = sc.nextLine();
        Account target = null;
        for (Account a : accounts) {
            if (a.getUsername().equals(username)) { target = a; break; }
        }
        if (target == null) { System.out.println("Khong tim thay account!"); return; }

        System.out.println("Danh sach group:");
        for (Group g : groups) System.out.println("  - " + g.getName());

        System.out.print("Nhap ten group: ");
        String groupName = sc.nextLine();
        Group targetGroup = null;
        for (Group g : groups) {
            if (g.getName().equals(groupName)) { targetGroup = g; break; }
        }
        if (targetGroup == null) { System.out.println("Khong tim thay group!"); return; }

        groupAccounts.add(new GroupAccount(targetGroup, target, LocalDate.now()));
        System.out.println("Da them [" + username + "] vao group [" + groupName + "] thanh cong!");
    }

    public void question9() { themGroupVaoAccount(); }

    // Q10: Them option 3, hoi tiep tuc sau moi thao tac
    public void question10() {
        while (true) {
            System.out.println("Moi ban nhap vao chuc nang muon su dung:");
            System.out.println("  1. Tao account");
            System.out.println("  2. Tao department");
            System.out.println("  3. Them group vao account");
            System.out.print("Chon: ");
            int choice = sc.nextInt(); sc.nextLine();

            if      (choice == 1) taoAccount();
            else if (choice == 2) taoDepartment();
            else if (choice == 3) themGroupVaoAccount();
            else { System.out.println("Moi ban nhap lai"); continue; }

            System.out.print("Ban co muon thuc hien chuc nang khac khong? (co/khong): ");
            if (!sc.nextLine().trim().equalsIgnoreCase("co")) return;
        }
    }

    // Q11: Them option 4 (them account vao group ngau nhien)
    public void themAccountVaoGroupNgauNhien() {
        System.out.println("Danh sach username:");
        for (Account a : accounts) System.out.println("  - " + a.getUsername());

        System.out.print("Nhap username: ");
        String username = sc.nextLine();
        Account target = null;
        for (Account a : accounts) {
            if (a.getUsername().equals(username)) { target = a; break; }
        }
        if (target == null) { System.out.println("Khong tim thay account!"); return; }

        Group randomGroup = groups.get(new Random().nextInt(groups.size()));
        System.out.println("Group ngau nhien duoc chon: " + randomGroup.getName());

        groupAccounts.add(new GroupAccount(randomGroup, target, LocalDate.now()));
        System.out.println("Da them [" + username + "] vao group [" + randomGroup.getName() + "] thanh cong!");
    }

    public void question11() {
        while (true) {
            System.out.println("Moi ban nhap vao chuc nang muon su dung:");
            System.out.println("  1. Tao account");
            System.out.println("  2. Tao department");
            System.out.println("  3. Them group vao account");
            System.out.println("  4. Them account vao group ngau nhien");
            System.out.print("Chon: ");
            int choice = sc.nextInt(); sc.nextLine();

            if      (choice == 1) taoAccount();
            else if (choice == 2) taoDepartment();
            else if (choice == 3) themGroupVaoAccount();
            else if (choice == 4) themAccountVaoGroupNgauNhien();
            else { System.out.println("Moi ban nhap lai"); continue; }

            System.out.print("Ban co muon thuc hien chuc nang khac khong? (co/khong): ");
            if (!sc.nextLine().trim().equalsIgnoreCase("co")) return;
        }
    }
}
