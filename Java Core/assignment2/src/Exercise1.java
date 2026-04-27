import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    private List<Account> accounts;
    private List<Department> departments;
    private List<Group> groups;
    private List<GroupAccount> groupAccounts;

    public Exercise1(List<Account> accounts, List<Department> departments,
                     List<Group> groups, List<GroupAccount> groupAccounts) {
        this.accounts = accounts;
        this.departments = departments;
        this.groups = groups;
        this.groupAccounts = groupAccounts;
    }

    // ==================== IF ====================

    // Q1: Kiem tra phong ban cua account thu 2
    public void question1() {
        Account account = accounts.get(1);
        if (account.getDepartment() == null) {
            System.out.println("Nhan vien nay chua co phong ban");
        } else {
            System.out.println("Phong ban cua nhan vien nay la: " + account.getDepartment().getName());
        }
    }

    // Q2: Kiem tra so luong group cua account thu 2
    public void question2() {
        Account account = accounts.get(1);
        List<String> groupNames = new ArrayList<>();
        for (GroupAccount ga : groupAccounts) {
            if (ga.getAccount().getId() == account.getId()) {
                groupNames.add(ga.getGroup().getName());
            }
        }
        int count = groupNames.size();
        if (count == 0) {
            System.out.println("Nhan vien nay chua co group");
        } else if (count <= 2) {
            System.out.println("Group cua nhan vien nay la: " + String.join(", ", groupNames));
        } else if (count == 3) {
            System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
        } else {
            System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
        }
    }

    // Q3: Dung ternary lam lai Q1
    public void question3() {
        Account account = accounts.get(1);
        String result = (account.getDepartment() == null)
                ? "Nhan vien nay chua co phong ban"
                : "Phong ban cua nhan vien nay la: " + account.getDepartment().getName();
        System.out.println(result);
    }

    // Q4: Dung ternary kiem tra position cua account thu 1
    public void question4() {
        Account account = accounts.get(0);
        String posName = (account.getPosition() != null) ? account.getPosition().getName() : "";
        String result = posName.equals("Dev") ? "Day la Developer" : "Nguoi nay khong phai la Developer";
        System.out.println(result);
    }

    // ==================== SWITCH CASE ====================

    // Q5: So luong account trong nhom thu 1
    public void question5() {
        Group group = groups.get(0);
        int count = 0;
        for (GroupAccount ga : groupAccounts) {
            if (ga.getGroup().getId() == group.getId()) {
                count++;
            }
        }
        switch (count) {
            case 1:  System.out.println("Nhom co mot thanh vien");  break;
            case 2:  System.out.println("Nhom co hai thanh vien");  break;
            case 3:  System.out.println("Nhom co ba thanh vien");   break;
            default: System.out.println("Nhom co nhieu thanh vien");
        }
    }

    // Q6: Dung switch lam lai Q2
    public void question6() {
        Account account = accounts.get(1);
        List<String> groupNames = new ArrayList<>();
        for (GroupAccount ga : groupAccounts) {
            if (ga.getAccount().getId() == account.getId()) {
                groupNames.add(ga.getGroup().getName());
            }
        }
        switch (groupNames.size()) {
            case 0:
                System.out.println("Nhan vien nay chua co group");
                break;
            case 1:
            case 2:
                System.out.println("Group cua nhan vien nay la: " + String.join(", ", groupNames));
                break;
            case 3:
                System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
                break;
            default:
                System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
        }
    }

    // Q7: Dung switch lam lai Q4
    public void question7() {
        Account account = accounts.get(0);
        String posName = (account.getPosition() != null) ? account.getPosition().getName() : "";
        switch (posName) {
            case "Dev":
                System.out.println("Day la Developer");
                break;
            default:
                System.out.println("Nguoi nay khong phai la Developer");
        }
    }

    // ==================== FOREACH ====================

    // Q8: In thong tin tat ca account
    public void question8() {
        for (Account a : accounts) {
            System.out.println("Email: " + a.getEmail()
                    + " | Full name: " + a.getFullName()
                    + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
        }
    }

    // Q9: In thong tin tat ca department
    public void question9() {
        for (Department d : departments) {
            System.out.println("Id: " + d.getId() + " | Name: " + d.getName());
        }
    }

    // ==================== FOR ====================

    // Q10: In thong tin account co dinh dang
    public void question10() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            System.out.println("Thong tin account thu " + (i + 1) + " la:");
            System.out.println("  Email: " + a.getEmail());
            System.out.println("  Full name: " + a.getFullName());
            System.out.println("  Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
        }
    }

    // Q11: In thong tin department co dinh dang
    public void question11() {
        for (int i = 0; i < departments.size(); i++) {
            Department d = departments.get(i);
            System.out.println("Thong tin department thu " + (i + 1) + " la:");
            System.out.println("  Id: " + d.getId());
            System.out.println("  Name: " + d.getName());
        }
    }

    // Q12: Chi in 2 department dau tien (dung break)
    public void question12() {
        for (int i = 0; i < departments.size(); i++) {
            if (i == 2) break;
            Department d = departments.get(i);
            System.out.println("Thong tin department thu " + (i + 1) + " la:");
            System.out.println("  Id: " + d.getId());
            System.out.println("  Name: " + d.getName());
        }
    }

    // Q13: In tat ca account ngoai tru account thu 2 (dung continue)
    public void question13() {
        for (int i = 0; i < accounts.size(); i++) {
            if (i == 1) continue;
            Account a = accounts.get(i);
            System.out.println("Email: " + a.getEmail()
                    + " | Full name: " + a.getFullName()
                    + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
        }
    }

    // Q14: In account co id < 4
    public void question14() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if (a.getId() < 4) {
                System.out.println("Email: " + a.getEmail()
                        + " | Full name: " + a.getFullName()
                        + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            }
        }
    }

    // Q15: In cac so chan <= 20
    public void question15() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // ==================== WHILE ====================

    // Q16: Dung while lam lai Q10 -> Q15
    public void question16() {
        System.out.println("--- While (lam lai Q10) ---");
        int i = 0;
        while (i < accounts.size()) {
            Account a = accounts.get(i);
            System.out.println("Thong tin account thu " + (i + 1) + " la:");
            System.out.println("  Email: " + a.getEmail());
            System.out.println("  Full name: " + a.getFullName());
            System.out.println("  Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            i++;
        }

        System.out.println("--- While (lam lai Q11) ---");
        i = 0;
        while (i < departments.size()) {
            Department d = departments.get(i);
            System.out.println("Thong tin department thu " + (i + 1) + " la:");
            System.out.println("  Id: " + d.getId());
            System.out.println("  Name: " + d.getName());
            i++;
        }

        System.out.println("--- While + break (lam lai Q12) ---");
        i = 0;
        while (i < departments.size()) {
            if (i == 2) break;
            Department d = departments.get(i);
            System.out.println("Thong tin department thu " + (i + 1) + " la:");
            System.out.println("  Id: " + d.getId());
            System.out.println("  Name: " + d.getName());
            i++;
        }

        System.out.println("--- While + continue (lam lai Q13) ---");
        i = 0;
        while (i < accounts.size()) {
            if (i == 1) { i++; continue; }
            Account a = accounts.get(i);
            System.out.println("Email: " + a.getEmail()
                    + " | Full name: " + a.getFullName()
                    + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            i++;
        }

        System.out.println("--- While (lam lai Q14) ---");
        i = 0;
        while (i < accounts.size()) {
            Account a = accounts.get(i);
            if (a.getId() < 4) {
                System.out.println("Email: " + a.getEmail()
                        + " | Full name: " + a.getFullName()
                        + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            }
            i++;
        }

        System.out.println("--- While (lam lai Q15) ---");
        i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }

    // ==================== DO-WHILE ====================

    // Q17: Dung do-while lam lai Q10 -> Q15
    public void question17() {
        System.out.println("--- Do-While (lam lai Q10) ---");
        int i = 0;
        do {
            Account a = accounts.get(i);
            System.out.println("Thong tin account thu " + (i + 1) + " la:");
            System.out.println("  Email: " + a.getEmail());
            System.out.println("  Full name: " + a.getFullName());
            System.out.println("  Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            i++;
        } while (i < accounts.size());

        System.out.println("--- Do-While (lam lai Q11) ---");
        i = 0;
        do {
            Department d = departments.get(i);
            System.out.println("Thong tin department thu " + (i + 1) + " la:");
            System.out.println("  Id: " + d.getId());
            System.out.println("  Name: " + d.getName());
            i++;
        } while (i < departments.size());

        System.out.println("--- Do-While + break (lam lai Q12) ---");
        i = 0;
        do {
            if (i == 2) break;
            Department d = departments.get(i);
            System.out.println("Thong tin department thu " + (i + 1) + " la:");
            System.out.println("  Id: " + d.getId());
            System.out.println("  Name: " + d.getName());
            i++;
        } while (i < departments.size());

        System.out.println("--- Do-While + continue (lam lai Q13) ---");
        i = 0;
        do {
            if (i == 1) { i++; continue; }
            Account a = accounts.get(i);
            System.out.println("Email: " + a.getEmail()
                    + " | Full name: " + a.getFullName()
                    + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            i++;
        } while (i < accounts.size());

        System.out.println("--- Do-While (lam lai Q14) ---");
        i = 0;
        do {
            Account a = accounts.get(i);
            if (a.getId() < 4) {
                System.out.println("Email: " + a.getEmail()
                        + " | Full name: " + a.getFullName()
                        + " | Phong ban: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A"));
            }
            i++;
        } while (i < accounts.size());

        System.out.println("--- Do-While (lam lai Q15) ---");
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println();
    }
}
