public class stringbuffer {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aryan"); // mutable data tyle
        /*
         * it is similar to StringBuilder but the only difference is that it has
         * thead-safe
         */
        sb.append(" kumar");
        sb.insert(0, "Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        // sb.deleteCharAt(1);
        // System.out.println(sb.capacity());
        /*
         * capacity of sting, provides 16 extra as it is mutalbe and contigeous
         * memory storage
         */

        System.out.println(sb);
        System.out.println(sb.length());

        String str = sb.toString();
        // System.out.println(str);
    }
}
