public class Q1 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println(s1 == s2); //a
        System.out.println(s1 == s3); //b
        System.out.println(s1 == s4); //c
        System.out.println(s1.equals(s3)); //d
        System.out.println(s1.equals(s4)); //e
        System.out.println("Welcome to Java".replace("Java", "HTML"));
        System.out.println(s1.replace('o', 'T'));
        System.out.println(s1.replaceAll("o", "T"));
        System.out.println(s1.replaceFirst("o","T"));
        char[] ch = s1.toCharArray();

        System.out.println();
        for (char value : ch) {
            System.out.print(value);
        }
    }
}