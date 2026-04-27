import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
    Scanner sc = new Scanner(System.in);

    List<Department> departmentList = new ArrayList<>();
    List<Position> positionList = new ArrayList<>();
    List<Account> accountList = new ArrayList<>();
    List<CategoryQuestion> categoryQuestionList = new ArrayList<>();
    List<TypeQuestion> typeQuestionList = new ArrayList<>();
    List<Question> questionList = new ArrayList<>();
    List<Answer> answerList = new ArrayList<>();
    List<Group> groupList = new ArrayList<>();
    List<GroupAccount> groupAccountList = new ArrayList<>();
    List<Exam> examList = new ArrayList<>();
    List<ExamQuestion> examQuestionList = new ArrayList<>();

    // ==================== DEPARTMENT ====================
    public void nhapDanhSachDepartment() {
        System.out.print("Nhập số lượng Department: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Department " + (i + 1) + " =====");
            Department d = new Department();
            System.out.print("Nhập ID: ");
            d.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập tên: ");
            d.setName(sc.nextLine());
            departmentList.add(d);
        }
    }

    // ==================== POSITION ====================
    public void nhapDanhSachPosition() {
        System.out.print("Nhập số lượng Position: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Position " + (i + 1) + " =====");
            Position p = new Position();
            System.out.print("Nhập ID: ");
            p.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập tên: ");
            p.setName(sc.nextLine());
            positionList.add(p);
        }
    }

    // ==================== ACCOUNT ====================
    public void nhapDanhSachAccount() {
        System.out.print("Nhập số lượng Account: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Account " + (i + 1) + " =====");
            Account a = new Account();
            System.out.print("Nhập ID: ");
            a.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập email: ");
            a.setEmail(sc.nextLine());
            System.out.print("Nhập username: ");
            a.setUsername(sc.nextLine());
            System.out.print("Nhập fullName: ");
            a.setFullName(sc.nextLine());
            System.out.print("Nhập ngày tạo (yyyy-mm-dd): ");
            a.setCreateDate(LocalDate.parse(sc.nextLine()));

            // Tìm Department theo ID
            System.out.print("Nhập Department ID: ");
            int deptId = sc.nextInt();
            sc.nextLine();
            for (Department d : departmentList)
                if (d.getId() == deptId) {
                    a.setDepartment(d);
                    break;
                }

            // Tìm Position theo ID
            System.out.print("Nhập Position ID: ");
            int posId = sc.nextInt();
            sc.nextLine();
            for (Position p : positionList)
                if (p.getId() == posId) {
                    a.setPosition(p);
                    break;
                }

            accountList.add(a);
        }
    }

    // ==================== CATEGORY QUESTION ====================
    public void nhapDanhSachCategoryQuestion() {
        System.out.print("Nhập số lượng CategoryQuestion: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== CategoryQuestion " + (i + 1) + " =====");
            CategoryQuestion cq = new CategoryQuestion();
            System.out.print("Nhập ID: ");
            cq.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập tên category: ");
            cq.setCategoryName(sc.nextLine());
            categoryQuestionList.add(cq);
        }
    }

    // ==================== TYPE QUESTION ====================
    public void nhapDanhSachTypeQuestion() {
        System.out.print("Nhập số lượng TypeQuestion: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== TypeQuestion " + (i + 1) + " =====");
            TypeQuestion tq = new TypeQuestion();
            System.out.print("Nhập ID: ");
            tq.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập typeName (Essay / MultipleChoice): ");
            tq.setTypeName(sc.nextLine());
            typeQuestionList.add(tq);
        }
    }

    // ==================== QUESTION ====================
    public void nhapDanhSachQuestion() {
        System.out.print("Nhập số lượng Question: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Question " + (i + 1) + " =====");
            Question q = new Question();
            System.out.print("Nhập ID: ");
            q.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập nội dung câu hỏi: ");
            q.setContent(sc.nextLine());
            System.out.print("Nhập ngày tạo (yyyy-mm-dd): ");
            q.setCreateDate(LocalDate.parse(sc.nextLine()));

            // Tìm CategoryQuestion theo ID
            System.out.print("Nhập CategoryQuestion ID: ");
            int cqId = sc.nextInt();
            sc.nextLine();
            for (CategoryQuestion cq : categoryQuestionList)
                if (cq.getId() == cqId) {
                    q.setCategoryQuestion(cq);
                    break;
                }

            // Tìm TypeQuestion theo ID
            System.out.print("Nhập TypeQuestion ID: ");
            int tqId = sc.nextInt();
            sc.nextLine();
            for (TypeQuestion tq : typeQuestionList)
                if (tq.getId() == tqId) {
                    q.setTypeQuestion(tq);
                    break;
                }

            // Tìm Account (creator) theo ID
            System.out.print("Nhập Creator Account ID: ");
            int accId = sc.nextInt();
            sc.nextLine();
            for (Account a : accountList)
                if (a.getId() == accId) {
                    q.setCreator(a);
                    break;
                }

            questionList.add(q);
        }
    }

    // ==================== ANSWER ====================
    public void nhapDanhSachAnswer() {
        System.out.print("Nhập số lượng Answer: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Answer " + (i + 1) + " =====");
            Answer ans = new Answer();
            System.out.print("Nhập ID: ");
            ans.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập nội dung đáp án: ");
            ans.setContent(sc.nextLine());
            System.out.print("Đáp án đúng không? (true/false): ");
            ans.setCorrect(Boolean.parseBoolean(sc.nextLine()));

            // Tìm Question theo ID
            System.out.print("Nhập Question ID: ");
            int qId = sc.nextInt();
            sc.nextLine();
            for (Question q : questionList)
                if (q.getId() == qId) {
                    ans.setQuestion(q);
                    break;
                }

            answerList.add(ans);
        }
    }

    // ==================== GROUP ====================
    public void nhapDanhSachGroup() {
        System.out.print("Nhập số lượng Group: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Group " + (i + 1) + " =====");
            Group g = new Group();
            System.out.print("Nhập ID: ");
            g.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập tên: ");
            g.setName(sc.nextLine());
            System.out.print("Nhập ngày tạo (yyyy-mm-dd): ");
            g.setCreateDate(LocalDate.parse(sc.nextLine()));

            // Tìm Account (creator) theo ID
            System.out.print("Nhập Creator Account ID: ");
            int accId = sc.nextInt();
            sc.nextLine();
            for (Account a : accountList)
                if (a.getId() == accId) {
                    g.setCreator(a);
                    break;
                }

            groupList.add(g);
        }
    }

    // ==================== GROUP ACCOUNT ====================
    public void nhapDanhSachGroupAccount() {
        System.out.print("Nhập số lượng GroupAccount: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== GroupAccount " + (i + 1) + " =====");
            GroupAccount ga = new GroupAccount();
            System.out.print("Nhập ngày join (yyyy-mm-dd): ");
            ga.setJoinDate(LocalDate.parse(sc.nextLine()));

            // Tìm Group theo ID
            System.out.print("Nhập Group ID: ");
            int gId = sc.nextInt();
            sc.nextLine();
            for (Group g : groupList)
                if (g.getId() == gId) {
                    ga.setGroup(g);
                    break;
                }

            // Tìm Account theo ID
            System.out.print("Nhập Account ID: ");
            int accId = sc.nextInt();
            sc.nextLine();
            for (Account a : accountList)
                if (a.getId() == accId) {
                    ga.setAccount(a);
                    break;
                }

            groupAccountList.add(ga);
        }
    }

    // ==================== EXAM ====================
    public void nhapDanhSachExam() {
        System.out.print("Nhập số lượng Exam: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== Exam " + (i + 1) + " =====");
            Exam e = new Exam();
            System.out.print("Nhập ID: ");
            e.setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập Code: ");
            e.setCode(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập tiêu đề: ");
            e.setTitle(sc.nextLine());
            System.out.print("Nhập thời gian làm bài (phút): ");
            e.setDuration(sc.nextInt());
            sc.nextLine();
            System.out.print("Nhập ngày tạo (yyyy-mm-dd): ");
            e.setCreateDate(LocalDate.parse(sc.nextLine()));

            // Tìm CategoryQuestion theo ID
            System.out.print("Nhập CategoryQuestion ID: ");
            int cqId = sc.nextInt();
            sc.nextLine();
            for (CategoryQuestion cq : categoryQuestionList)
                if (cq.getId() == cqId) {
                    e.setCategoryQuestion(cq);
                    break;
                }

            // Tìm Account (creator) theo ID
            System.out.print("Nhập Creator Account ID: ");
            int accId = sc.nextInt();
            sc.nextLine();
            for (Account a : accountList)
                if (a.getId() == accId) {
                    e.setCreator(a);
                    break;
                }

            examList.add(e);
        }
    }

    // ==================== EXAM QUESTION ====================
    public void nhapDanhSachExamQuestion() {
        System.out.print("Nhập số lượng ExamQuestion: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("===== ExamQuestion " + (i + 1) + " =====");
            ExamQuestion eq = new ExamQuestion();

            // Tìm Exam theo ID
            System.out.print("Nhập Exam ID: ");
            int eId = sc.nextInt();
            sc.nextLine();
            for (Exam e : examList)
                if (e.getId() == eId) {
                    eq.setExam(e);
                    break;
                }

            // Tìm Question theo ID
            System.out.print("Nhập Question ID: ");
            int qId = sc.nextInt();
            sc.nextLine();
            for (Question q : questionList)
                if (q.getId() == qId) {
                    eq.setQuestion(q);
                    break;
                }

            examQuestionList.add(eq);
        }
    }

    // ==================== GỌI TẤT CẢ ====================
    public void nhapDuLieu() {
        nhapDanhSachDepartment();
        nhapDanhSachPosition();
        nhapDanhSachAccount();          // cần Department + Position
        nhapDanhSachCategoryQuestion();
        nhapDanhSachTypeQuestion();
        nhapDanhSachQuestion();         // cần Category + Type + Account
        nhapDanhSachAnswer();           // cần Question
        nhapDanhSachGroup();            // cần Account
        nhapDanhSachGroupAccount();     // cần Group + Account
        nhapDanhSachExam();             // cần Category + Account
        nhapDanhSachExamQuestion();     // cần Exam + Question
        sc.close();
    }

    public void taoduLieuGia() {
        // ========== Department ==========
        departmentList.add(new Department(1, "Phòng Kỹ Thuật"));
        departmentList.add(new Department(2, "Phòng Nhân Sự"));
        departmentList.add(new Department(3, "Phòng Marketing"));

        // ========== Position ==========
        positionList.add(new Position(1, "Developer"));
        positionList.add(new Position(2, "Tester"));
        positionList.add(new Position(3, "Project Manager"));

        // ========== Account ==========
        accountList.add(new Account(1, "alice@gmail.com", "alice", "Nguyễn Thị Alice",
                departmentList.get(0), positionList.get(0), LocalDate.of(2023, 1, 10)));
        accountList.add(new Account(2, "bob@gmail.com", "bob", "Trần Văn Bob",
                departmentList.get(1), positionList.get(1), LocalDate.of(2023, 3, 15)));
        accountList.add(new Account(3, "charlie@gmail.com", "charlie", "Lê Minh Charlie",
                departmentList.get(2), positionList.get(2), LocalDate.of(2023, 6, 20)));

        // ========== CategoryQuestion ==========
        categoryQuestionList.add(new CategoryQuestion(1, "Java"));
        categoryQuestionList.add(new CategoryQuestion(2, "SQL"));
        categoryQuestionList.add(new CategoryQuestion(3, "OOP"));

        // ========== TypeQuestion ==========
        typeQuestionList.add(new TypeQuestion(1, "MultipleChoice"));
        typeQuestionList.add(new TypeQuestion(2, "Essay"));

        // ========== Question ==========
        questionList.add(new Question(1, "Java là gì?",
                categoryQuestionList.get(0), typeQuestionList.get(0),
                accountList.get(0), LocalDate.of(2023, 7, 1)));
        questionList.add(new Question(2, "OOP có mấy tính chất?",
                categoryQuestionList.get(2), typeQuestionList.get(0),
                accountList.get(0), LocalDate.of(2023, 7, 2)));
        questionList.add(new Question(3, "Trình bày về SQL JOIN?",
                categoryQuestionList.get(1), typeQuestionList.get(1),
                accountList.get(1), LocalDate.of(2023, 7, 3)));

        // ========== Answer ==========
        answerList.add(new Answer(1, "Ngôn ngữ lập trình hướng đối tượng", questionList.get(0), true));
        answerList.add(new Answer(2, "Ngôn ngữ lập trình hướng thủ tục", questionList.get(0), false));
        answerList.add(new Answer(3, "4 tính chất", questionList.get(1), true));
        answerList.add(new Answer(4, "2 tính chất", questionList.get(1), false));

        // ========== Group ==========
        groupList.add(new Group(1, "Nhóm Java Cơ Bản", accountList.get(0), LocalDate.of(2023, 8, 1)));
        groupList.add(new Group(2, "Nhóm SQL Nâng Cao", accountList.get(1), LocalDate.of(2023, 8, 15)));

        // ========== GroupAccount ==========
        groupAccountList.add(new GroupAccount(groupList.get(0), accountList.get(0), LocalDate.of(2023, 8, 1)));
        groupAccountList.add(new GroupAccount(groupList.get(0), accountList.get(1), LocalDate.of(2023, 8, 2)));
        groupAccountList.add(new GroupAccount(groupList.get(1), accountList.get(1), LocalDate.of(2023, 8, 15)));
        groupAccountList.add(new GroupAccount(groupList.get(1), accountList.get(2), LocalDate.of(2023, 8, 16)));

        // ========== Exam ==========
        examList.add(new Exam(1, 1001, "Kiểm tra Java cơ bản",
                categoryQuestionList.get(0), 60,
                accountList.get(0), LocalDate.of(2023, 9, 1)));
        examList.add(new Exam(2, 1002, "Kiểm tra SQL",
                categoryQuestionList.get(1), 45,
                accountList.get(1), LocalDate.of(2023, 9, 10)));

        // ========== ExamQuestion ==========
        examQuestionList.add(new ExamQuestion(examList.get(0), questionList.get(0)));
        examQuestionList.add(new ExamQuestion(examList.get(0), questionList.get(1)));
        examQuestionList.add(new ExamQuestion(examList.get(1), questionList.get(2)));

        System.out.println("✔ Đã tạo dữ liệu giả thành công!");
    }
    public void inDuLieu() {
        // ========== Department ==========
        System.out.println("========== DANH SÁCH DEPARTMENT ==========");
        for (Department d : departmentList) {
            System.out.println("ID: " + d.getId() + " | Tên: " + d.getName());
        }

        // ========== Position ==========
        System.out.println("\n========== DANH SÁCH POSITION ==========");
        for (Position p : positionList) {
            System.out.println("ID: " + p.getId() + " | Tên: " + p.getName());
        }

        // ========== Account ==========
        System.out.println("\n========== DANH SÁCH ACCOUNT ==========");
        for (Account a : accountList) {
            System.out.println("ID: " + a.getId()
                    + " | Email: " + a.getEmail()
                    + " | Username: " + a.getUsername()
                    + " | FullName: " + a.getFullName()
                    + " | Department: " + (a.getDepartment() != null ? a.getDepartment().getName() : "N/A")
                    + " | Position: " + (a.getPosition() != null ? a.getPosition().getName() : "N/A")
                    + " | Ngày tạo: " + a.getCreateDate());
        }

        // ========== CategoryQuestion ==========
        System.out.println("\n========== DANH SÁCH CATEGORY QUESTION ==========");
        for (CategoryQuestion cq : categoryQuestionList) {
            System.out.println("ID: " + cq.getId() + " | Category: " + cq.getCategoryName());
        }

        // ========== TypeQuestion ==========
        System.out.println("\n========== DANH SÁCH TYPE QUESTION ==========");
        for (TypeQuestion tq : typeQuestionList) {
            System.out.println("ID: " + tq.getId() + " | Type: " + tq.getTypeName());
        }

        // ========== Question ==========
        System.out.println("\n========== DANH SÁCH QUESTION ==========");
        for (Question q : questionList) {
            System.out.println("ID: " + q.getId()
                    + " | Nội dung: " + q.getContent()
                    + " | Category: " + (q.getCategoryQuestion() != null ? q.getCategoryQuestion().getCategoryName() : "N/A")
                    + " | Type: " + (q.getTypeQuestion() != null ? q.getTypeQuestion().getTypeName() : "N/A")
                    + " | Creator: " + (q.getCreator() != null ? q.getCreator().getUsername() : "N/A")
                    + " | Ngày tạo: " + q.getCreateDate());
        }

        // ========== Answer ==========
        System.out.println("\n========== DANH SÁCH ANSWER ==========");
        for (Answer ans : answerList) {
            System.out.println("ID: " + ans.getId()
                    + " | Nội dung: " + ans.getContent()
                    + " | Đúng: " + ans.isCorrect()
                    + " | Thuộc câu hỏi ID: " + (ans.getQuestion() != null ? ans.getQuestion().getId() : "N/A"));
        }

        // ========== Group ==========
        System.out.println("\n========== DANH SÁCH GROUP ==========");
        for (Group g : groupList) {
            System.out.println("ID: " + g.getId()
                    + " | Tên: " + g.getName()
                    + " | Creator: " + (g.getCreator() != null ? g.getCreator().getUsername() : "N/A")
                    + " | Ngày tạo: " + g.getCreateDate());
        }

        // ========== GroupAccount ==========
        System.out.println("\n========== DANH SÁCH GROUP ACCOUNT ==========");
        for (GroupAccount ga : groupAccountList) {
            System.out.println("Group: " + (ga.getGroup() != null ? ga.getGroup().getName() : "N/A")
                    + " | Account: " + (ga.getAccount() != null ? ga.getAccount().getUsername() : "N/A")
                    + " | Ngày join: " + ga.getJoinDate());
        }

        // ========== Exam ==========
        System.out.println("\n========== DANH SÁCH EXAM ==========");
        for (Exam e : examList) {
            System.out.println("ID: " + e.getId()
                    + " | Code: " + e.getCode()
                    + " | Tiêu đề: " + e.getTitle()
                    + " | Category: " + (e.getCategoryQuestion() != null ? e.getCategoryQuestion().getCategoryName() : "N/A")
                    + " | Thời gian: " + e.getDuration() + " phút"
                    + " | Creator: " + (e.getCreator() != null ? e.getCreator().getUsername() : "N/A")
                    + " | Ngày tạo: " + e.getCreateDate());
        }

        // ========== ExamQuestion ==========
        System.out.println("\n========== DANH SÁCH EXAM QUESTION ==========");
        for (ExamQuestion eq : examQuestionList) {
            System.out.println("Exam: " + (eq.getExam() != null ? eq.getExam().getTitle() : "N/A")
                    + " | Question: " + (eq.getQuestion() != null ? eq.getQuestion().getContent() : "N/A"));
        }
    }

}
