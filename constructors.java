class Humans {
    private int age;
    private String name;

    public Humans(int age) {
        this.age = age;
    }

    public Humans(String name) {
        this.name = name;
    }

    public Humans(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Humans() {
    }

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

public class constructors {
    public static void main(String[] args) {
        Humans me = new Humans();
        Humans you = new Humans(30, "Aryan");
        System.out.println(me.getName() + " : " + me.getAge());
        System.out.println(you.getName() + " : " + you.getAge());
        /*
         * me.setAge(20);
         * me.setName("Aryan");
         * */
    }
}

/*
 * Constructor is type of function which is created in a class.
 * constructor is called whenever the object is created.
 * we need not call the constructor manually.
 * it has the same name as the class itself.
 * it doesn't have return type.
 * we can use method overloading with constructors.
 * */