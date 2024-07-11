package enums;

enum Status {
    Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {
        Status status = Status.Success;
        Status[] statuses = Status.values();
        System.out.println(status.ordinal()); // 3
        System.out.println(statuses.length); // Success

        for (Status s : statuses) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}

/*
* enums are used to define a group of named constants.
*
* */