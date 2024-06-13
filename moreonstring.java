public class moreonstring {
    public static void main(String[] args) {
        String name = "aryan";
        // name = name + " kumar"; // both works
        name += " kumar"; // it doesn't changes the string object in heap it instead creates new object
                          // and older one becomes the garbagae collection which will be removed after
                          // sometime to clean up memory and the variable in the stach only changes the
                          // address to the object
        System.out.println(name);
    }
}
