class Student {

    String name;
    int rollNo;
    int marks;

}

public class arrayInObjects {
    public static void main(String[] args) {

        Student aryan = new Student();
        aryan.name = "Aryan Kumar";
        aryan.rollNo = 58;
        aryan.marks = 100;

        Student kush = new Student();
        kush.name = "Kush De Santa";
        kush.rollNo = 8;
        kush.marks = 95;

        Student jhon = new Student();
        jhon.name = "Jhon Choudhary";
        jhon.rollNo = 5;
        jhon.marks = 90;

        Student students[] = new Student[3];
        students[0] = aryan;
        students[1] = kush;
        students[2] = jhon;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
            System.out.println(students[i].rollNo);
            System.out.println(students[i].marks);
            System.out.println();
        }

    }

}
