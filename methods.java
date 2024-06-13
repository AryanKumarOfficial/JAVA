/**
 * methods
 */

class Computer {
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    // while calling the fucntion getPen we need to give it a arguemnt else it will
    // throw an error as we have specified an parameter in the string

    public String getPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "nothing";
    }

}

public class methods {

    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.playMusic();
        String device = comp.getPen(1);
        System.out.println(device);

    }
}