package enums;

enum Status {
    Running, Failed, Pending, Success
}

public class Demo {
    public static void main(String[] args) {
       /*

        Status status = Status.Success;
        Status[] statuses = Status.values();
        System.out.println(status.ordinal()); // 3
        System.out.println(statuses.length); // Success

        for (Status s : statuses) {
            System.out.println(s + " : " + s.ordinal());
        }
       * */

        Status s = Status.Failed;
        System.out.println(s.getClass().getSuperclass());

        if (s == Status.Running) System.out.println("all good");
        else if (s == Status.Failed) System.out.println("Try again");
        else if (s == Status.Pending) System.out.println("Please wait");
        else System.out.println("Done");

        switch (s) {
            case Running:
                System.out.println("all good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Done");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }
    }
}

/*
 * enums are used to define a group of named constants.
 * it is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 * To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
 * The enum constants have initial value that starts from 0, 1, 2, 3, and so on.
 * You can access enum constants with the dot syntax.
 * You can loop through the enum constants with the values() method.
 * You can compare enum constants with the == operator.
 * You can use the switch statement to select enum constants.
 * You can add fields, constructors, and methods to an enum.
 * It extends java.lang.Enum class.
 *
 * */