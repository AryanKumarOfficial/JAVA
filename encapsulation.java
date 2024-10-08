class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human me = new Human();
        me.setAge(19);
        me.setName("Aryan");
        System.out.println(me.getName() + " : " + me.getAge());
    }
}
/*
 * private members can only be accessed within class only.
 * It cannot be accessed directly outside the class.
 * */