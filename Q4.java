public class Q4 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";

        //a
        String s3 = s1.replace('e','E');
        
        //b
        String temp = "Welcome to Java and HTML";
        String[] tokens = temp.split(" ");
        s1 = tokens[0];
        s2 = tokens[1];

        System.out.println(s3);

    }
}