import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // DEPARTMENT
        Department dept1 = new Department(1, "Công nghệ thông tin");
        Department dept2 = new Department(2, "Kế toán - Tài chính");
        Department dept3 = new Department(3, "Nhân sự");

        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        System.out.println("===== DEPARTMENT =====");
        System.out.println("ID: " + dept1.getId() + " | Tên: " + dept1.getName());

        //  POSITION
        Position pos1 = new Position(1, "Nhân viên");
        Position pos2 = new Position(2, "Trưởng phòng");
        Position pos3 = new Position(3, "Giám đốc");

        List<Position> positions = new ArrayList<>();
        positions.add(pos1);
        positions.add(pos2);
        positions.add(pos3);

        System.out.println("\n===== POSITION =====");
        System.out.println("ID: " + pos1.getId() + " | Tên: " + pos1.getName());

        //  ACCOUNT
        Account acc1 = new Account(1, "alice@gmail.com", "alice123", "Nguyễn Thị Alice",
                dept1, pos1, LocalDate.of(2023, 1, 10));
        Account acc2 = new Account(2, "bob@gmail.com", "bob456", "Trần Văn Bob",
                dept2, pos2, LocalDate.of(2022, 5, 20));
        Account acc3 = new Account(3, "charlie@gmail.com", "charlie789", "Lê Minh Charlie",
                dept3, pos3, LocalDate.of(2021, 8, 15));

        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        System.out.println("\n===== ACCOUNT =====");
        System.out.println("ID: " + acc1.getId()
                + " | Username: " + acc1.getUsername()
                + " | Họ tên: " + acc1.getFullName()
                + " | Phòng ban: " + acc1.getDepartment().getName()
                + " | Chức vụ: " + acc1.getPosition().getName()
                + " | Ngày tạo: " + acc1.getCreateDate());

        //  CATEGORY QUESTION
        CategoryQuestion cat1 = new CategoryQuestion(1, "Java Cơ Bản");
        CategoryQuestion cat2 = new CategoryQuestion(2, "Cơ Sở Dữ Liệu");
        CategoryQuestion cat3 = new CategoryQuestion(3, "Mạng Máy Tính");

        List<CategoryQuestion> categories = new ArrayList<>();
        categories.add(cat1);
        categories.add(cat2);
        categories.add(cat3);

        System.out.println("\n===== CATEGORY QUESTION =====");
        System.out.println("ID: " + cat1.getId() + " | Danh mục: " + cat1.getCategoryName());

        //  TYPE QUESTION
        TypeQuestion type1 = new TypeQuestion(1, "Trắc nghiệm một đáp án");
        TypeQuestion type2 = new TypeQuestion(2, "Trắc nghiệm nhiều đáp án");
        TypeQuestion type3 = new TypeQuestion(3, "Tự luận");

        List<TypeQuestion> types = new ArrayList<>();
        types.add(type1);
        types.add(type2);
        types.add(type3);

        System.out.println("\n===== TYPE QUESTION =====");
        System.out.println("ID: " + type1.getId() + " | Loại: " + type1.getTypeName());

        //  QUESTION
        // Lưu ý: Question.java chưa có constructor/getter/setter
        // Cần bổ sung trước khi chạy được đoạn này
        Question q1 = new Question(1, "Java là ngôn ngữ lập trình gì?", cat1, type1, acc1,
                LocalDate.of(2024, 3, 1));
        Question q2 = new Question(2, "SQL là viết tắt của từ gì?", cat2, type1, acc2,
                LocalDate.of(2024, 3, 5));
        Question q3 = new Question(3, "Mô hình OSI có bao nhiêu tầng?", cat3, type2, acc3,
                LocalDate.of(2024, 3, 10));

        List<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

        System.out.println("\n===== QUESTION =====");
        System.out.println("ID: " + q1.getId()
                + " | Nội dung: " + q1.getContent()
                + " | Danh mục: " + q1.getCategoryQuestion().getCategoryName()
                + " | Loại: " + q1.getTypeQuestion().getTypeName()
                + " | Người tạo: " + q1.getCreator().getFullName());

        //  ANSWER
        Answer ans1 = new Answer(1, "Ngôn ngữ lập trình hướng đối tượng", q1, true);
        Answer ans2 = new Answer(2, "Ngôn ngữ lập trình ", q1, false);
        Answer ans3 = new Answer(3, "Structured Query Language", q2, true);
        Answer ans4 = new Answer(4, "Simple Query Language", q2, false);
        Answer ans5 = new Answer(5, "7 tầng", q3, true);
        Answer ans6 = new Answer(6, "4 tầng", q3, false);

        List<Answer> answers = new ArrayList<>();
        answers.add(ans1);
        answers.add(ans2);
        answers.add(ans3);
        answers.add(ans4);
        answers.add(ans5);
        answers.add(ans6);

        System.out.println("\n===== ANSWER =====");
        System.out.println("ID: " + ans1.getId()
                + " | Nội dung: " + ans1.getContent()
                + " | Câu hỏi: " + ans1.getQuestion().getContent()
                + " | Đúng: " + ans1.isCorrect());

        //  EXAM
        Exam exam1 = new Exam(1, 1001, "Đề thi Java Cơ Bản", cat1, 60 , acc1,
                LocalDate.of(2024, 4, 1));
        Exam exam2 = new Exam(2, 1002, "Đề thi Cơ Sở Dữ Liệu", cat2, 45, acc2,
                LocalDate.of(2024, 4, 5));
        Exam exam3 = new Exam(3, 1003, "Đề thi Mạng Máy Tính", cat3, 90 , acc3,
                LocalDate.of(2024, 4, 10));

        List<Exam> exams = new ArrayList<>();
        exams.add(exam1);
        exams.add(exam2);
        exams.add(exam3);

        System.out.println("\n===== EXAM =====");
        System.out.println("ID: " + exam1.getId()
                + " | Mã đề: " + exam1.getCode()
                + " | Tiêu đề: " + exam1.getTitle()
                + " | Danh mục: " + exam1.getCategoryQuestion().getCategoryName()
                + " | Thời gian: " + exam1.getDuration()
                + " | Người tạo: " + exam1.getCreator().getFullName()
                + " | Ngày tạo: " + exam1.getCreateDate());

        //  EXAM QUESTION
        ExamQuestion eq1 = new ExamQuestion(exam1, q1);
        ExamQuestion eq2 = new ExamQuestion(exam2, q2);
        ExamQuestion eq3 = new ExamQuestion(exam3, q3);

        List<ExamQuestion> examQuestions = new ArrayList<>();
        examQuestions.add(eq1);
        examQuestions.add(eq2);
        examQuestions.add(eq3);

        System.out.println("\n===== EXAM QUESTION =====");
        System.out.println("Đề thi: " + eq1.getExam().getTitle()
                + " | Câu hỏi: " + eq1.getQuestion().getContent());

        //  GROUP
        Group group1 = new Group(1, "Nhóm Java Nâng Cao", acc1, LocalDate.of(2024, 1, 15));
        Group group2 = new Group(2, "Nhóm SQL Cơ Bản", acc2, LocalDate.of(2024, 2, 20));
        Group group3 = new Group(3, "Nhóm Mạng & Bảo Mật", acc3, LocalDate.of(2024, 3, 25));

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        System.out.println("\n===== GROUP =====");
        System.out.println("ID: " + group1.getId()
                + " | Tên nhóm: " + group1.getName()
                + " | Người tạo: " + group1.getCreator().getFullName()
                + " | Ngày tạo: " + group1.getCreateDate());

        //  GROUP ACCOUNT
        GroupAccount ga1 = new GroupAccount(group1, acc1, LocalDate.of(2024,01,16));
        GroupAccount ga2 = new GroupAccount(group2, acc2,  LocalDate.of(2024,02,21));
        GroupAccount ga3 = new GroupAccount(group3, acc3,  LocalDate.of(2024,3,22));

        List<GroupAccount> groupAccounts = new ArrayList<>();
        groupAccounts.add(ga1);
        groupAccounts.add(ga2);
        groupAccounts.add(ga3);

        System.out.println("\n===== GROUP ACCOUNT =====");
        System.out.println("Nhóm: " + ga1.getGroup().getName()
                + " | Thành viên: " + ga1.getAccount().getFullName()
                + " | Ngày tham gia: " + ga1.getJoinDate());
    }
}