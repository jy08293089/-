import java.util.Scanner;

class Student {
    private int studentNumber;
    private String name;
    private String major;
    private String phoneNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length != 4) {
                System.out.println("다시 입력해주세요.");
                i--;
                continue;
            }

            Student student = new Student();
            student.setStudentNumber(Integer.parseInt(parts[0]));
            student.setName(parts[1]);
            student.setMajor(parts[2]);
            String phoneNumber = parts[3].replaceAll("-", "");
            phoneNumber = "010-" + phoneNumber.substring(3, 7) + "-" + phoneNumber.substring(7);
            student.setPhoneNumber(phoneNumber);

            students[i] = student;
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        System.out.println("첫번째 학생: "+ students[0].getStudentNumber()+" " + students[0].getName()+" " + students[0].getMajor()+" " + students[0].getPhoneNumber());
        System.out.println("두번째 학생: "+ students[1].getStudentNumber()+" "+ students[1].getName()+" " + students[1].getMajor()+" " + students[1].getPhoneNumber());
        System.out.println("세번째 학생: "+ students[2].getStudentNumber()+" " + students[2].getName()+" " + students[2].getMajor()+" " + students[2].getPhoneNumber());


        scanner.close();
    }
}
