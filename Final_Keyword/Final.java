package Final_Keyword;

class Calc {
    public final void show() {
        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {
    @Override
    public void show() {
        System.out.println("in Adv Calc show");
    }
}


public class Final {
    public static void main(String[] args) {
        final int num = 8;
        System.out.println(num);
        Calc obj = new AdvCalc();
        obj.show();
        obj.add(2, 3);
    }
}

/*
 * final can be used with - variables, method,class
 * final make variables constant can't change values.
 * class with final can't be inherited.
 * final stops method from overriding.
 * */