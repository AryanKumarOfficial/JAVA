//import tools.AdvCalc;
//import tools.Calc;
//import tools.ScientificCalc;

/*
  means all the files but not the folders.
 */

import tools.*;

public class MoreOnOops {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        AdvCalc c2 = new AdvCalc();
        ScientificCalc c3 = new ScientificCalc();
/*
 *
 * int r1 = c1.add(10, 12);
 int r2 = c1.sub(20, 12);
 int r3 = c1.multi(20, 12);
 int r4 = c1.div(20, 12);
 double r5 = c1.power(20, 2);
 System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
*/
    }
}

/*
 * types of inheritance:
 * 1.single level inheritance  - only once inheritance occurs in the program. ex: AdvCalc from Calc.
 * 2.multi level inheritance - it inherits at multiple level. ex:ScientificCalc from AdvCalc and AdvCalc from Calc.
 * */