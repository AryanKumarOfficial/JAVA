class Student {
    String name;
    int rollNo;
    int marks;
}

public class foreach {
    public static void main(String[] args) {
        // int num[] = new int[4];

        // num[0] = 7;
        // num[1] = 2;
        // num[2] = 6;
        // num[3] = 4;

        // for (int n : num) {
        // System.out.println(n);
        // }

        Student s1 = new Student();
        s1.name = "Aryan";
        s1.rollNo = 58;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "Kush De Santa";
        s2.rollNo = 5;
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "John Choudhary";
        s3.rollNo = 8;
        s3.marks = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }

    }
}
