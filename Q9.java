public class Q9 {
    public static void main(String[] args) {
        String s = "This string is 20 ch";
        StringBuilder buffer = new StringBuilder(s);
        buffer.delete(4,10);

        System.out.println(buffer.toString());
    }
}