public class MoreOnOops {
    public static void main(String[] args) {
        AdvCalc c1 = new AdvCalc();
        int r1 = c1.add(10, 12);
        int r2 = c1.sub(20, 12);
        int r3 = c1.multi(20, 12);
        int r4 = c1.div(20, 12);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
