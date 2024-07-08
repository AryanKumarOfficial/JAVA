class X {
    public X() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in show");
    }
}

public class MoreOnObject {
    public static void main(String[] args) {
//        int marks;
//        marks = 720;
//        X x; reference creation for object
//        x = new X(); assigning object known as reference object
//        x.show();

        new X().show();// anonymous object because it doesn't have name.
    }
}
