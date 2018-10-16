import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userSentence = input.nextLine();
        int[] characters = new int[26];

        for (int i = 0; i < userSentence.length(); i++) {
            int tempIndex = Character.toLowerCase(userSentence.charAt(i));
            tempIndex -= 97;
            characters[tempIndex]++;
        }

        System.out.printf("%-6s %13s%n","Letter", "Occurences");
        for (int i = 0; i < 26; i++) {
            int tempInt = i + 97;
            char letterOfTheAlphabet = (char)tempInt;

            System.out.printf("%-6c %13d%n",letterOfTheAlphabet, characters[i]);
        }
    }
}